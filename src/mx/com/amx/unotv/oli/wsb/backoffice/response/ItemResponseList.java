/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.response;

import java.util.List;

/**
 * @author Jesus A. Macias Benitez
 *
 */
public class ItemResponseList {
	
	
	List<ItemResponse> lista ;

	public List<ItemResponse> getLista() {
		return lista;
	}

	public void setLista(List<ItemResponse> lista) {
		this.lista = lista;
	}

	/**
	 * 
	 */
	public ItemResponseList() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param lista
	 */
	public ItemResponseList(List<ItemResponse> lista) {
		super();
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "ItemResponseList [lista=" + lista + "]";
	}
	
	

}
