/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.ws;


import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import mx.com.amx.unotv.oli.wsb.backoffice.model.IMagazine;
import mx.com.amx.unotv.oli.wsb.backoffice.ws.exception.IMagazineCallWSException;

/**
 * @author Jesus A. Macias Benitez
 *
 */
public class IMagazineCallWS {

	private static Logger logger = Logger.getLogger(IMagazineCallWS.class);

	private RestTemplate restTemplate;
	private String URL_WS_BASE = "";
	private String URL_WS_I_MAGAZINE = "";
	private HttpHeaders headers = new HttpHeaders();
	private final Properties props = new Properties();

	public IMagazineCallWS() {
		super();
		restTemplate = new RestTemplate();
		ClientHttpRequestFactory factory = restTemplate.getRequestFactory();

		if (factory instanceof SimpleClientHttpRequestFactory) {
			((SimpleClientHttpRequestFactory) factory).setConnectTimeout(15 * 1000);
			((SimpleClientHttpRequestFactory) factory).setReadTimeout(15 * 1000);
			System.out.println("Inicializando rest template 1");
		} else if (factory instanceof HttpComponentsClientHttpRequestFactory) {
			((HttpComponentsClientHttpRequestFactory) factory).setReadTimeout(15 * 1000);
			((HttpComponentsClientHttpRequestFactory) factory).setConnectTimeout(15 * 1000);
			System.out.println("Inicializando rest template 2");
		}

		restTemplate.setRequestFactory(factory);
		headers.setContentType(MediaType.APPLICATION_JSON);

		try {
			props.load(this.getClass().getResourceAsStream("/general.properties"));
		} catch (Exception e) {
			logger.error("[  IMagazineCallWS ::init]Error al iniciar y cargar arhivo de propiedades." + e.getMessage());

		}
		String ambiente = props.getProperty("ambiente");
		URL_WS_BASE = props.getProperty(ambiente + ".url.ws.base");
		URL_WS_I_MAGAZINE = props.getProperty(ambiente + ".url.ws.imagazine");
	}
	
	
	
	
	public void delete(String idMagazine) throws IMagazineCallWSException {

		logger.info("--- delete [ MagazineCallWS ]---- ");
		String METHOD = "/delete/";
		String URL_WS = URL_WS_BASE + URL_WS_I_MAGAZINE + METHOD +idMagazine ;
		
		logger.info("--- URL : " + URL_WS);

		

		try {
			logger.info("URL_WS: " + URL_WS);
			HttpEntity<String> entity = new HttpEntity<String>("Accept=application/json; charset=utf-8", headers);
			
			 restTemplate.postForObject(URL_WS , entity,Integer.class);


		} catch (RestClientResponseException rre) {
			logger.error("RestClientResponseException delete [ MagazineCallWS ]: " + rre.getResponseBodyAsString());
			logger.error("RestClientResponseException delete [ MagazineCallWS ]: ", rre);
			throw new IMagazineCallWSException(rre.getResponseBodyAsString());
		} catch (Exception e) {
			logger.error("Exception delete  [ MagazineCallWS ]: ", e);
			throw new IMagazineCallWSException(e.getMessage());
		}
	}
	

	public int insert(IMagazine imagazine) throws IMagazineCallWSException {

		logger.info("--- insert [ MagazineCallWS ]---- ");
		String METHOD = "/insert/";
		String URL_WS = URL_WS_BASE + URL_WS_I_MAGAZINE + METHOD  ;
		int response = 0;
		logger.info("--- URL : " + URL_WS);

		

		try {
			logger.info("URL_WS: " + URL_WS);
			
			response = restTemplate.postForObject(URL_WS , imagazine,Integer.class);


		} catch (RestClientResponseException rre) {
			logger.error("RestClientResponseException insert [ MagazineCallWS ]: " + rre.getResponseBodyAsString());
			logger.error("RestClientResponseException insert [ MagazineCallWS ]: ", rre);
			throw new IMagazineCallWSException(rre.getResponseBodyAsString());
		} catch (Exception e) {
			logger.error("Exception insert  [ MagazineCallWS ]: ", e);
			throw new IMagazineCallWSException(e.getMessage());
		}
		return response;
	}
}
