/**
 * 
 */
package mx.com.amx.unotv.oli.wsb.backoffice.model;

/**
 * @author Jesus A. Macias Benitez
 *
 */
public class Categoria {

	private String fcIdCategoria;
	private String fcDescripcion;
	private String fcFriendlyUrl;
	private String fcDfp;
	private Integer fiEstatus;

	/**
	 * 
	 */
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fcIdCategoria
	 * @param fcDescripcion
	 * @param fcFriendlyUrl
	 * @param fcDfp
	 * @param fiEstatus
	 */
	public Categoria(String fcIdCategoria, String fcDescripcion, String fcFriendlyUrl, String fcDfp,
			Integer fiEstatus) {
		super();
		this.fcIdCategoria = fcIdCategoria;
		this.fcDescripcion = fcDescripcion;
		this.fcFriendlyUrl = fcFriendlyUrl;
		this.fcDfp = fcDfp;
		this.fiEstatus = fiEstatus;
	}

	public String getFcIdCategoria() {
		return fcIdCategoria;
	}

	public void setFcIdCategoria(String fcIdCategoria) {
		this.fcIdCategoria = fcIdCategoria;
	}

	public String getFcDescripcion() {
		return fcDescripcion;
	}

	public void setFcDescripcion(String fcDescripcion) {
		this.fcDescripcion = fcDescripcion;
	}

	public String getFcFriendlyUrl() {
		return fcFriendlyUrl;
	}

	public void setFcFriendlyUrl(String fcFriendlyUrl) {
		this.fcFriendlyUrl = fcFriendlyUrl;
	}

	public String getFcDfp() {
		return fcDfp;
	}

	public void setFcDfp(String fcDfp) {
		this.fcDfp = fcDfp;
	}

	public Integer getFiEstatus() {
		return fiEstatus;
	}

	public void setFiEstatus(Integer fiEstatus) {
		this.fiEstatus = fiEstatus;
	}

	@Override
	public String toString() {
		return "Categoria [fcIdCategoria=" + fcIdCategoria + ", fcDescripcion=" + fcDescripcion + ", fcFriendlyUrl="
				+ fcFriendlyUrl + ", fcDfp=" + fcDfp + ", fiEstatus=" + fiEstatus + "]";
	}

}
