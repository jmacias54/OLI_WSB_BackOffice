/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.response;

import java.util.List;

/**
 * @author Jesus A. Macias Benitez
 *
 */
public class MagazineResponseList {
	
	
	List<MagazineResponse> lista ;

	public List<MagazineResponse> getLista() {
		return lista;
	}

	public void setLista(List<MagazineResponse> lista) {
		this.lista = lista;
	}

	/**
	 * @param lista
	 */
	public MagazineResponseList(List<MagazineResponse> lista) {
		super();
		this.lista = lista;
	}

	/**
	 * 
	 */
	public MagazineResponseList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MagazineResponseList [lista=" + lista + "]";
	}
	
	

}
