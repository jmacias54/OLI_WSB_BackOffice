/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.controller;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import mx.com.amx.unotv.oli.wsb.backoffice.bo.CategoriaBO;
import mx.com.amx.unotv.oli.wsb.backoffice.controller.exception.ControllerException;
import mx.com.amx.unotv.oli.wsb.backoffice.model.Categoria;

/**
 * @author Jesus A. Macias Benitez
 *
 */
@Controller
@RequestMapping("categoria")
public class CategoriaController {

	@Autowired
	CategoriaBO categoriaBO;

	/** The logger. */
	private static Logger logger = Logger.getLogger(CategoriaController.class);

	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public List<Categoria> findAll() throws ControllerException {

		logger.info("--- Find All [ CategoriaController ] ---");
		List<Categoria> lista = null;

		try {
			lista = categoriaBO.findAll();
		} catch (Exception e) {
			logger.error("Exception findAll  [ CategoriaController ]: ", e);
			throw new ControllerException(e.getMessage());
		}

		return lista;

	}

}
