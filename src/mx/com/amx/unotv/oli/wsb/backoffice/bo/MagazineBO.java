/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.bo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import mx.com.amx.unotv.oli.wsb.backoffice.bo.exception.MagazineBOException;
import mx.com.amx.unotv.oli.wsb.backoffice.model.IMagazine;
import mx.com.amx.unotv.oli.wsb.backoffice.model.Magazine;
import mx.com.amx.unotv.oli.wsb.backoffice.request.MagazineRequest;
import mx.com.amx.unotv.oli.wsb.backoffice.ws.IMagazineCallWS;
import mx.com.amx.unotv.oli.wsb.backoffice.ws.MagazineCallWS;

/**
 * @author Jesus A. Macias Benitez
 *
 */
public class MagazineBO {

	/** The logger. */
	private static Logger logger = Logger.getLogger(MagazineBO.class);
	
	@Autowired
	MagazineCallWS magazineCallWS;
	@Autowired
	IMagazineCallWS iMagazineCallWS;
	
	public List<Magazine> findAll() throws MagazineBOException {

		logger.info("--- findAll [ MagazineBO ]---- ");

		List<Magazine> lista = null;

		try {

			lista = magazineCallWS.findAll();

		} catch (Exception e) {
			logger.error(" -- Error  findAll [ MagazineBO ]:", e);
			throw new MagazineBOException(e.getMessage());
		}

		return lista;
	}
	
	
	public int saveMagazine(MagazineRequest request) throws MagazineBOException {

		logger.info("--- saveMagazine [ MagazineBO ]---- ");

		int res = 0;

		try {

			/* primer paso : se borra la informacion en la tabla IMagazine por IdMagazine */
			iMagazineCallWS.delete(request.getId_magazine());

			/*
			 * segundo paso : se procede a insertar uno por uno la informacion en la tabla
			 * IMagazine
			 */

			for (IMagazine imagazine : request.getLista()) {

				res = iMagazineCallWS.insert(imagazine);

			}

		} catch (Exception e) {
			logger.error(" -- Error  saveMagazine [ MagazineBO ]:", e);
			throw new MagazineBOException(e.getMessage());
		}

		return res;
	}
}
