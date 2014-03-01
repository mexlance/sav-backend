package com.sav.cloud.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Embeddable
public class LlaveLista implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="LSH_ID", nullable = false)
	@Basic
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_LISTASH")
	@SequenceGenerator(name = "SEQ_LISTASH", sequenceName = "SEQ_LISTASH", schema = "NEO_95TX8CQ9UTSKSYW51TUHCVNXA", allocationSize = 1)
	private String idLista;

	@Basic
	@Column(name="SUC_ID")
	private String idSucursal;
	
	@Basic
	@Column(name="CAT_ID")
	private String idCatalogo;
		
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
	 * @return the idSucursal
	 */
	public String getIdSucursal() {
		return idSucursal;
	}

	/**
	 * @param idSucursal the idSucursal to set
	 */
	public void setIdSucursal(String idSucursal) {
		this.idSucursal = idSucursal;
	}

	/**
	 * @return the idCatalogo
	 */
	public String getIdCatalogo() {
		return idCatalogo;
	}

	/**
	 * @param idCatalogo the idCatalogo to set
	 */
	public void setIdCatalogo(String idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	public boolean equals(Object other) {
	    if (this == other)
	        return true;
	    if (!(other instanceof LlaveLista))
	        return false;
	    LlaveLista castOther = (LlaveLista) other;
	    return idLista.equals(castOther.idLista) && idSucursal.equals(castOther.idSucursal)
	    		&& idCatalogo.equals(castOther.idCatalogo);
	}

	public int hashCode() {		
		int hashCode = 0;
		String id = null;
		
		id = this.idLista + this.idSucursal + this.idCatalogo;
		hashCode = Integer.parseInt(id);
	    return hashCode;
	}
	
}