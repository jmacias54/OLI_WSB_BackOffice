package mx.com.amx.unotv.oli.wsb.backoffice.model;

import java.io.Serializable;


/**
 * The persistent class for the oli_mx_i_magazine database table.
 * 
 */

public class IMagazine implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private String fcIdMagazine;

	
	private String fcIdContenido;

	public IMagazine() {
	}

	public String getFcIdMagazine() {
		return fcIdMagazine;
	}

	public void setFcIdMagazine(String fcIdMagazine) {
		this.fcIdMagazine = fcIdMagazine;
	}

	public String getFcIdContenido() {
		return fcIdContenido;
	}

	public void setFcIdContenido(String fcIdContenido) {
		this.fcIdContenido = fcIdContenido;
	}

	

}