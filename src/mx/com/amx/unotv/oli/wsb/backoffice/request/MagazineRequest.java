/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.request;

import java.util.List;

import mx.com.amx.unotv.oli.wsb.backoffice.model.IMagazine;



/**
 * @author Jesus A. Macias Benitez
 *
 */
public class MagazineRequest {
	
	
	/** The id magazine. */
	String id_magazine;

	/** The lista. */
	List<IMagazine> lista;

	public String getId_magazine() {
		return id_magazine;
	}

	public void setId_magazine(String id_magazine) {
		this.id_magazine = id_magazine;
	}

	public List<IMagazine> getLista() {
		return lista;
	}

	public void setLista(List<IMagazine> lista) {
		this.lista = lista;
	}
	
	
	

}
