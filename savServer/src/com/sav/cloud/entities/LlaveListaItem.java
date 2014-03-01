package com.sav.cloud.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LlaveListaItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="LSH_ID", nullable = false)
	@Basic
	private String idLista;

	@Basic
	@Column(name="LSI_POS", nullable = false)
	private String idPosicion;
	
	
	/**
	 * @return the idLista
	 */
	public String getIdLista() {
		return idLista;
	}

	/**
	 * @param idLista the idLista to set
	 */
	public void setIdLista(String idLista) {
		this.idLista = idLista;
	}

	/**
	 * @return the idPosicion
	 */
	public String getIdPosicion() {
		return idPosicion;
	}

	/**
	 * @param idPosicion the idPosicion to set
	 */
	public void setIdPosicion(String idPosicion) {
		this.idPosicion = idPosicion;
	}

	public boolean equals(Object other) {
	    if (this == other)
	        return true;
	    if (!(other instanceof LlaveListaItem))
	        return false;
	    LlaveListaItem castOther = (LlaveListaItem) other;
	    return idLista.equals(castOther.idLista) && idPosicion.equals(castOther.idPosicion);
	}

	public int hashCode() {		
		int hashCode = 0;
		String id = null;
		
		id = this.idLista + this.idPosicion;
		hashCode = Integer.parseInt(id);
	    return hashCode;
	}
	
}
