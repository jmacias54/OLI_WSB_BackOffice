/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.controller;

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

		try {

			return magazineBO.findAll();

		} catch (Exception e) {
			logger.error(" -- Error  findAll [ MagazineController ]:", e);
			throw new ControllerException(e.getMessage());
		}

	}

	
	@RequestMapping(value = "/save_magazine", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public int saveMagazine(@RequestBody MagazineRequest request) throws ControllerException {

		logger.info("--- saveMagazine [ MagazineController ]---- ");

		try {

			return magazineBO.saveMagazine(request);

		} catch (Exception e) {
			logger.error(" -- Error  saveMagazine [ MagazineController ]:", e);
			throw new ControllerException(e.getMessage());
		}

	}

	@RequestMapping(value = "/get_magazine/{idMagazine}", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<MagazineResponse> findByMagazine(@PathVariable String idMagazine) throws ControllerException {
		logger.info("--- findByMagazine [ MagazineController ]---- ");

		try {

			return itemBO.findByMagazine(idMagazine);

		} catch (Exception e) {
			logger.error(" -- Error  findByMagazine [ MagazineController ]:", e);
			throw new ControllerException(e.getMessage());
		}

	}


}
