/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.bo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mx.com.amx.unotv.oli.wsb.backoffice.bo.exception.CategoriaBOException;
import mx.com.amx.unotv.oli.wsb.backoffice.model.Categoria;
import mx.com.amx.unotv.oli.wsb.backoffice.ws.CategoriaCallWS;

/**
 * @author Jesus A. Macias Benitez
 *
 */
public class CategoriaBO {
	private static Logger logger = Logger.getLogger(CategoriaBO.class);
	@Autowired
	CategoriaCallWS categoriaCallWS;

	public List<Categoria> findAll() throws CategoriaBOException {
		List<Categoria> lista = null;

		try {
			lista = categoriaCallWS.findAll();
		} catch (Exception e) {
			logger.error("Exception findAll  [ CategoriaBO ]: ", e);
			throw new CategoriaBOException(e.getMessage());
		}

		return lista;
	}

}
