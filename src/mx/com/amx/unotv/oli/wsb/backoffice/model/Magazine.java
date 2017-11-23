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
	private int fiEstatus;
	private int fiOrden;

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

	public int getFiEstatus() {
		return this.fiEstatus;
	}

	public void setFiEstatus(int fiEstatus) {
		this.fiEstatus = fiEstatus;
	}

	public int getFiOrden() {
		return this.fiOrden;
	}

	public void setFiOrden(int fiOrden) {
		this.fiOrden = fiOrden;
	}

}