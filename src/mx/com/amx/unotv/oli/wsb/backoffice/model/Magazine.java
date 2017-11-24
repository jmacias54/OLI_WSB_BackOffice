package mx.com.amx.unotv.oli.wsb.backoffice.model;

import java.io.Serializable;



/**
 * The persistent class for the oli_mx_c_magazine database table.
 * 
 */

public class Magazine implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String fcIdMagazine;
	private String fcDescripcion;
	private String fcUrlExterna;
	private Integer fiEstatus;
	private Integer fiOrden;

	public Magazine() {
	}

	public String getFcIdMagazine() {
		return this.fcIdMagazine;
	}

	public void setFcIdMagazine(String fcIdMagazine) {
		this.fcIdMagazine = fcIdMagazine;
	}

	public String getFcDescripcion() {
		return this.fcDescripcion;
	}

	public void setFcDescripcion(String fcDescripcion) {
		this.fcDescripcion = fcDescripcion;
	}

	public String getFcUrlExterna() {
		return this.fcUrlExterna;
	}

	public void setFcUrlExterna(String fcUrlExterna) {
		this.fcUrlExterna = fcUrlExterna;
	}

	public Integer getFiEstatus() {
		return this.fiEstatus;
	}

	public void setFiEstatus(Integer fiEstatus) {
		this.fiEstatus = fiEstatus;
	}

	public Integer getFiOrden() {
		return this.fiOrden;
	}

	public void setFiOrden(Integer fiOrden) {
		this.fiOrden = fiOrden;
	}

}