package com.sav.cloud.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ListaDetail
 *
 */
@Entity
@IdClass(com.sav.cloud.entities.LlaveListaItem.class)
@Table(name="LISTAS_I")
@NamedQuery(name = "AllListasItem", query = "select li from ListaItem li")

public class ListaItem implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public ListaItem() {
		super();
	}
		
	@Id
	@Column(name="LSH_ID", nullable = false)
	@Basic
	private String idLista;

	@Id
	@Basic
	@Column(name="LSI_POS", nullable = false)
	private String idPosicion;
	
	@Basic
	@Column(name="MAT_ID")
	private String material;
	
	@Basic
	@Column(name="LSI_PREC_SOC")
	private float precioSocio;
	
	@Basic
	@Column(name="LSI_PREC_CON")
	private float precioContado;
	
	@Basic
	@Column(name="LSI_PREC_PAGOS")
	private float precioPagos;
	
	@Basic
	@Column(name="LSI_PAG")
	private String pagina;
	
	@Basic
	@Column(name="LSI_UBICACION")
	private String ubicacion;
	
	@Basic
	@Column(name="LSI_FEC_CREO")
	private Date fechaCreacion;
	
	@Basic
	@Column(name="LSI_HORA_CREO")
	private Time horaCreacion;
	
	@Basic
	@Column(name="LSI_FEC_MOD")
	private Date fechaModificacion;
	
	@Basic
	@Column(name="LSI_HORA_MOD")
	private Time horaModificacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LSH_ID", referencedColumnName = "LSH_ID", 
				insertable = false, updatable = false)	
	private ListaHeader listah;

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

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * @return the precioSocio
	 */
	public float getPrecioSocio() {
		return precioSocio;
	}

	/**
	 * @param precioSocio the precioSocio to set
	 */
	public void setPrecioSocio(float precioSocio) {
		this.precioSocio = precioSocio;
	}

	/**
	 * @return the precioContado
	 */
	public float getPrecioContado() {
		return precioContado;
	}

	/**
	 * @param precioContado the precioContado to set
	 */
	public void setPrecioContado(float precioContado) {
		this.precioContado = precioContado;
	}

	/**
	 * @return the precioPagos
	 */
	public float getPrecioPagos() {
		return precioPagos;
	}

	/**
	 * @param precioPagos the precioPagos to set
	 */
	public void setPrecioPagos(float precioPagos) {
		this.precioPagos = precioPagos;
	}

	/**
	 * @return the pagina
	 */
	public String getPagina() {
		return pagina;
	}

	/**
	 * @param pagina the pagina to set
	 */
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

	/**
	 * @return the ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * @param ubicacion the ubicacion to set
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the horaCreacion
	 */
	public Time getHoraCreacion() {
		return horaCreacion;
	}

	/**
	 * @param horaCreacion the horaCreacion to set
	 */
	public void setHoraCreacion(Time horaCreacion) {
		this.horaCreacion = horaCreacion;
	}

	/**
	 * @return the fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * @return the horaModificacion
	 */
	public Time getHoraModificacion() {
		return horaModificacion;
	}

	/**
	 * @param horaModificacion the horaModificacion to set
	 */
	public void setHoraModificacion(Time horaModificacion) {
		this.horaModificacion = horaModificacion;
	}

//	/**
//	 * @return the listah
//	 */
//	public ListaHeader getListah() {
//		return listah;
//	}
//
//	/**
//	 * @param listah the listah to set
//	 */
//	public void setListah(ListaHeader listah) {
//		this.listah = listah;
//	}
//	   
}
