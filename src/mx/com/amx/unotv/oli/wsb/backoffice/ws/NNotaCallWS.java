/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.ws;

import java.util.Collections;
import java.util.List;
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
import mx.com.amx.unotv.oli.wsb.backoffice.model.NNota;
import mx.com.amx.unotv.oli.wsb.backoffice.response.ListResponse;
import mx.com.amx.unotv.oli.wsb.backoffice.ws.exception.NNotaCallWSException;



/**
 * @author Jesus A. Macias Benitez
 *
 */
public class NNotaCallWS {
	
	private static Logger logger = Logger.getLogger(NNotaCallWS.class);

	private RestTemplate restTemplate;
	private String URL_WS_BASE = "";
	private String URL_WS_NNOTA = "";
	private HttpHeaders headers = new HttpHeaders();
	private final Properties props = new Properties();

	public NNotaCallWS() {
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
			logger.error("[DetailCallWS::init]Error al iniciar y cargar arhivo de propiedades." + e.getMessage());

		}
		String ambiente = props.getProperty("ambiente");
		URL_WS_BASE = props.getProperty(ambiente + ".url.ws.base");
		URL_WS_NNOTA = props.getProperty(ambiente + ".url.ws.nnota");
	}
	
	
	public List<NNota> findByIdClassVideo(String idClassVideo) throws NNotaCallWSException {

		logger.info("--- findByIdClassVideo [ NNotaCallWS ]---- ");
		String METHOD = "/classVideo/";
		String URL_WS = URL_WS_BASE + URL_WS_NNOTA + METHOD +idClassVideo;
		
		logger.info("--- URL : " + URL_WS);

		ListResponse<NNota> response = null;

		try {
			logger.info("URL_WS: " + URL_WS);
			HttpEntity<String> entity = new HttpEntity<String>("Accept=application/json; charset=utf-8", headers);
			
			response = restTemplate.postForObject(URL_WS , entity, ListResponse.class);

			if(response != null)
			logger.info(" Registros obtenidos --> " + response.toString());

		} catch (NullPointerException npe) {
			
			return null;
		}catch (RestClientResponseException rre) {
			logger.error("RestClientResponseException findByIdClassVideo [ NNotaCallWS ]: " + rre.getResponseBodyAsString());
			logger.error("RestClientResponseException findByIdClassVideo [ NNotaCallWS ]: ", rre);
			throw new NNotaCallWSException(rre.getResponseBodyAsString());
		} catch (Exception e) {
			logger.error("Exception findByIdClassVideo  [ NNotaCallWS ]: ", e);
			throw new NNotaCallWSException(e.getMessage());
		}
		
		if(response == null) {
			response = new ListResponse<NNota>();
			response.setLista(Collections.<NNota>emptyList());
		}

		return response.getLista();

	}
	
	public List<NNota> findByTipoNota(String tipoNota) throws NNotaCallWSException {

		logger.info("--- findByTipoNota [ NNotaCallWS ]---- ");
		String METHOD = "/tipoNota/";
		String URL_WS = URL_WS_BASE + URL_WS_NNOTA + METHOD +tipoNota;

		logger.info("--- URL : " + URL_WS);

		ListResponse<NNota> response = null;

		try {
			logger.info("URL_WS: " + URL_WS);
			HttpEntity<String> entity = new HttpEntity<String>("Accept=application/json; charset=utf-8", headers);
			
			response = restTemplate.postForObject(URL_WS , entity, ListResponse.class);

			if(response != null)
			logger.info(" Registros obtenidos --> " + response.toString());

		} catch (NullPointerException npe) {
			
			return null;
		}catch (RestClientResponseException rre) {
			logger.error("RestClientResponseException findByTipoNota [ NNotaCallWS ]: " + rre.getResponseBodyAsString());
			logger.error("RestClientResponseException findByTipoNota [ NNotaCallWS ]: ", rre);
			throw new NNotaCallWSException(rre.getResponseBodyAsString());
		} catch (Exception e) {
			logger.error("Exception findByTipoNota  [ NNotaCallWS ]: ", e);
			throw new NNotaCallWSException(e.getMessage());
		}
		
		if(response == null) {
			response = new ListResponse<NNota>();
			response.setLista(Collections.<NNota>emptyList());
		}

		return response.getLista();

	}
	
	
	public List<NNota> findByIdCategoria(String idCategoria) throws NNotaCallWSException {

		logger.info("--- findByIdCategoria [ NNotaCallWS ]---- ");
		String METHOD = "/categoria/";
		String URL_WS = URL_WS_BASE + URL_WS_NNOTA + METHOD +idCategoria;

		logger.info("--- URL : " + URL_WS);

		ListResponse<NNota> response = null;

		try {
			logger.info("URL_WS: " + URL_WS);
			HttpEntity<String> entity = new HttpEntity<String>("Accept=application/json; charset=utf-8", headers);
			
			response = restTemplate.postForObject(URL_WS , entity, ListResponse.class);

			if(response != null)
			logger.info(" Registros obtenidos --> " + response.toString());

		} catch (NullPointerException npe) {
			
			return null;
		}catch (RestClientResponseException rre) {
			logger.error("RestClientResponseException findByIdCategoria [ NNotaCallWS ]: " + rre.getResponseBodyAsString());
			logger.error("RestClientResponseException findByIdCategoria [ NNotaCallWS ]: ", rre);
			throw new NNotaCallWSException(rre.getResponseBodyAsString());
		} catch (Exception e) {
			logger.error("Exception findByIdCategoria  [ NNotaCallWS ]: ", e);
			throw new NNotaCallWSException(e.getMessage());
		}
		
		if(response == null) {
			response = new ListResponse<NNota>();
			response.setLista(Collections.<NNota>emptyList());
		}

		return response.getLista();

	}
	
	


}
