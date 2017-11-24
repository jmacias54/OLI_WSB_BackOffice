/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.bo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import mx.com.amx.unotv.oli.wsb.backoffice.bo.exception.ItemBOException;
import mx.com.amx.unotv.oli.wsb.backoffice.response.ItemResponse;
import mx.com.amx.unotv.oli.wsb.backoffice.response.MagazineResponse;
import mx.com.amx.unotv.oli.wsb.backoffice.ws.NNotaCallWS;



/**
 * @author Jesus A. Macias Benitez
 *
 */
public class ItemBO {
	
	/** The logger. */
	private static Logger logger = Logger.getLogger(ItemBO.class);
	
	@Autowired
	NNotaCallWS nNotaCallWS;
	
	
	public List<ItemResponse> findByIdClassVideo(String idClassVideo) throws ItemBOException{
		logger.info("--- findByIdClassVideo [ ItemBO ]---- ");
		List<ItemResponse> lista = null;
		
		try {
			lista = nNotaCallWS.findByIdClassVideo(idClassVideo);
		} catch (Exception e) {
			logger.error(" -- Error  findByIdClassVideo [ ItemBO ]:", e);
			throw new ItemBOException(e.getMessage());
		}
		
		return lista;
	}
	
	
	
	public List<ItemResponse> findByTipoNota(String tipoNota) throws ItemBOException{
		logger.info("--- findByTipoNota [ ItemBO ]---- ");
		List<ItemResponse> lista = null;
		
		try {
			lista = nNotaCallWS.findByTipoNota(tipoNota);
		} catch (Exception e) {
			logger.error(" -- Error  findByTipoNota [ ItemBO ]:", e);
			throw new ItemBOException(e.getMessage());
		}
		
		return lista;
	}

	
	
	public List<ItemResponse> findByIdCategoria(String idCategoria) throws ItemBOException{
		logger.info("--- findByIdCategoria [ ItemBO ]---- ");
		List<ItemResponse> lista = null;
		
		try {
			lista = nNotaCallWS.findByIdCategoria(idCategoria);
		} catch (Exception e) {
			logger.error(" -- Error  findByIdCategoria [ ItemBO ]:", e);
			throw new ItemBOException(e.getMessage());
		}
		
		return lista;
	}
	
	
	public List<MagazineResponse> findByMagazine(String idMagazine) throws ItemBOException{
		logger.info("--- findByMagazine [ ItemBO ]---- ");
		List<MagazineResponse> lista = null;
		
		try {
			lista = nNotaCallWS.findByMagazine(idMagazine);
		} catch (Exception e) {
			logger.error(" -- Error  findByMagazine [ ItemBO ]:", e);
			throw new ItemBOException(e.getMessage());
		}
		
		return lista;
	}
}
