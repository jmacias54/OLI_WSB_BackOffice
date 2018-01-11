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

	/** The fc url externa. */
	private String fcUrlExterna;

	/** The fi orden. */
	private Integer fiOrden;

	private String fcLiveVod;

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

	public String getFcUrlExterna() {
		return fcUrlExterna;
	}

	public void setFcUrlExterna(String fcUrlExterna) {
		this.fcUrlExterna = fcUrlExterna;
	}

	public Integer getFiOrden() {
		return fiOrden;
	}

	public void setFiOrden(Integer fiOrden) {
		this.fiOrden = fiOrden;
	}

	public String getFcLiveVod() {
		return fcLiveVod;
	}

	public void setFcLiveVod(String fcLiveVod) {
		this.fcLiveVod = fcLiveVod;
	}

}