/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.response;

import java.util.List;

import mx.com.amx.unotv.oli.wsb.backoffice.model.Categoria;



/**
 * @author Jesus A. Macias Benitez
 *
 */
public class CategoriaListResponse {

	List<Categoria> lista;

	public List<Categoria> getLista() {
		return lista;
	}

	public void setLista(List<Categoria> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CategoriaListResponse [lista=" + lista + "]";
	}

}
