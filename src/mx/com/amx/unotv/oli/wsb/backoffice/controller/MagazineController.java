/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.amx.unotv.oli.wsb.backoffice.controller.exception.ControllerException;
import mx.com.amx.unotv.oli.wsb.backoffice.model.Magazine;
import mx.com.amx.unotv.oli.wsb.backoffice.model.NNota;
import mx.com.amx.unotv.oli.wsb.backoffice.request.MagazineRequest;

/**
 * @author Jesus A. Macias Benitez
 *
 */

@Controller
@RequestMapping("magazine")
public class MagazineController {
	/** The logger. */
	private static Logger logger = Logger.getLogger(MagazineController.class);
	
	
	@RequestMapping(value = "/get_list_magazine", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<Magazine> findAll() throws ControllerException {

		logger.info("--- findAll [ MagazineController ]---- ");

		List<Magazine> lista = null;

		try {

			// lista = nNotaDAO.findAll();

		} catch (Exception e) {
			logger.error(" -- Error  findAll [ MagazineController ]:", e);
			throw new ControllerException(e.getMessage());
		}

		return lista;
	}
	
	@RequestMapping(value = "/get_magazine/{idMagazine}", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<NNota> getItemByIdMagazine(@PathVariable String idMagazine) throws ControllerException {

		logger.info("--- getItemByIdMagazine [ MagazineController ]---- ");

		List<NNota> lista = null;

		try {

			// lista = nNotaDAO.getItemByIdMagazine(idMagazine);

		} catch (Exception e) {
			logger.error(" -- Error  getItemByIdMagazine [ MagazineController ]:", e);
			throw new ControllerException(e.getMessage());
		}

		return lista;
	}
	
	
	@RequestMapping(value = "/save_magazine", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<Magazine> saveMagazine(@RequestBody MagazineRequest request) throws ControllerException {

		logger.info("--- saveMagazine [ MagazineController ]---- ");

		List<Magazine> lista = null;

		try {

			// lista = nNotaDAO.saveMagazine(request);

		} catch (Exception e) {
			logger.error(" -- Error  saveMagazine [ MagazineController ]:", e);
			throw new ControllerException(e.getMessage());
		}

		return lista;
	}

}
