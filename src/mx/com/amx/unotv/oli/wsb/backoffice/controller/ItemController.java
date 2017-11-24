/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.controller;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import mx.com.amx.unotv.oli.wsb.backoffice.bo.ItemBO;
import mx.com.amx.unotv.oli.wsb.backoffice.controller.exception.ControllerException;
import mx.com.amx.unotv.oli.wsb.backoffice.response.ItemResponse;

/**
 * @author Jesus A. Macias Benitez
 *
 */

@Controller
@RequestMapping("item")
public class ItemController {

	/** The logger. */
	private static Logger logger = Logger.getLogger(ItemController.class);
	
	
	@Autowired
	ItemBO itemBO;

	@RequestMapping(value = "/get_list_items_categoria/{idCategotia}", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<ItemResponse> findByIdCategoria(@PathVariable String idCategotia) throws ControllerException {

		logger.info("--- findByIdCategoria [ ItemController ]---- ");

		List<ItemResponse> lista = null;

		try {

			lista = itemBO.findByIdCategoria(idCategotia);

		} catch (Exception e) {
			logger.error(" -- Error  findByIdCategoria [ ItemController ]:", e);
			throw new ControllerException(e.getMessage());
		}

		return lista;
	}
	
	
	@RequestMapping(value = "/get_list_items_tipo_nota/{tipoNota}", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<ItemResponse> findByTipoNota(@PathVariable String tipoNota) throws ControllerException {

		logger.info("--- findByTipoNota [ ItemController ]---- ");

		List<ItemResponse> lista = null;

		try {

			 lista = itemBO.findByTipoNota(tipoNota);

		} catch (Exception e) {
			logger.error(" -- Error  findByTipoNota [ ItemController ]:", e);
			throw new ControllerException(e.getMessage());
		}

		return lista;
	}
	
	
	@RequestMapping(value = "/get_list_items_video/{idClassVideo}", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<ItemResponse> findByIdClassVideo(@PathVariable String idClassVideo) throws ControllerException {

		logger.info("--- findByIdClassVideo [ ItemController ]---- ");

		List<ItemResponse> lista = null;

		try {

			lista = itemBO.findByIdClassVideo(idClassVideo);

		} catch (Exception e) {
			logger.error(" -- Error  findByIdClassVideo [ ItemController ]:", e);
			throw new ControllerException(e.getMessage());
		}

		return lista;
	}
	
	


}
