/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.amx.unotv.oli.wsb.backoffice.bo.ItemBO;
import mx.com.amx.unotv.oli.wsb.backoffice.bo.MagazineBO;
import mx.com.amx.unotv.oli.wsb.backoffice.controller.exception.ControllerException;
import mx.com.amx.unotv.oli.wsb.backoffice.model.IMagazine;
import mx.com.amx.unotv.oli.wsb.backoffice.model.Magazine;
import mx.com.amx.unotv.oli.wsb.backoffice.request.MagazineRequest;
import mx.com.amx.unotv.oli.wsb.backoffice.response.MagazineResponse;

/**
 * @author Jesus A. Macias Benitez
 *
 */

@Controller
@RequestMapping("magazine")
public class MagazineController {
	/** The logger. */
	private static Logger logger = Logger.getLogger(MagazineController.class);
	
	@Autowired
	MagazineBO magazineBO;
	@Autowired
	ItemBO itemBO;
	
	@RequestMapping(value = "/get_list_magazine", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<Magazine> findAll() throws ControllerException {

		logger.info("--- findAll [ MagazineController ]---- ");

		List<Magazine> lista = null;

		try {

			lista = magazineBO.findAll();

		} catch (Exception e) {
			logger.error(" -- Error  findAll [ MagazineController ]:", e);
			throw new ControllerException(e.getMessage());
		}

		return lista;
	}
	

	
	@RequestMapping(value = "/save_magazine", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public int saveMagazine(@RequestBody MagazineRequest request) throws ControllerException {

		logger.info("--- saveMagazine [ MagazineController ]---- ");

		int res = 0;

		try {

			res = magazineBO.saveMagazine(request);

		} catch (Exception e) {
			logger.error(" -- Error  saveMagazine [ MagazineController ]:", e);
			throw new ControllerException(e.getMessage());
		}

		return res;
	}
	
	@RequestMapping(value = "/get_magazine/{idMagazine}", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<MagazineResponse> findByMagazine(@PathVariable String idMagazine) throws ControllerException {
		logger.info("--- findByMagazine [ MagazineController ]---- ");

		List<MagazineResponse> lista = null;

		try {

			lista = itemBO.findByMagazine(idMagazine);

		} catch (Exception e) {
			logger.error(" -- Error  findByMagazine [ MagazineController ]:", e);
			throw new ControllerException(e.getMessage());
		}

		return lista;

	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public MagazineRequest magazine() throws ControllerException {
		
		MagazineRequest requ = new MagazineRequest();
		requ.setId_magazine("magazine-deportes");
		
		IMagazine m1 = new IMagazine();
		m1.setFcIdContenido("001348e4-42b9-4caf-9eca-cd78ab0ef882");
		m1.setFcIdMagazine("magazine-home");
		m1.setFcUrlExterna("/");
		
		IMagazine m2 = new IMagazine();
		m2.setFcIdContenido("001348e4-42b9-4caf-9eca-cd78ab0ef881");
		m2.setFcIdMagazine("magazine-home");
		m2.setFcUrlExterna("/");
		
		IMagazine m3 = new IMagazine();
		m3.setFcIdContenido("001348e4-42b9-4caf-9eca-cd78ab0ef880");
		m3.setFcIdMagazine("magazine-home");
		m3.setFcUrlExterna("/");
		
		List<IMagazine> lista = new ArrayList<IMagazine>();
		lista.add(m1);
		lista.add(m2);
		lista.add(m3);
		
		requ.setLista(lista);
		return requ;

	}

}
