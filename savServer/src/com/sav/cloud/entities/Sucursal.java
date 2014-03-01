package com.sav.cloud.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Entity implementation class for Entity: Sucursal
 *
 */
@Entity
@Table(name = "Sucursales")
@NamedQuery(name = "AllSucursales", query = "select s from Sucursal s")

public class Sucursal implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Sucursal() {
		super();
	}
	
	@Id
	@Column(name="SUC_ID", nullable = false)
	@Basic
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SUCURSALES")
	@SequenceGenerator(name = "SEQ_SUCURSALES", sequenceName = "SEQ_SUCURSALES", schema = "NEO_95TX8CQ9UTSKSYW51TUHCVNXA", allocationSize = 1)
	private String id;
	
	@Basic
	@Column(name="SUC_DES")
	private String descripcion;
	
	@Basic
	@Column(name="SUC_UBI")
	private String ubicacion;
	
	@Basic
	@Column(name="SUC_TEL")
	private String telefono;
	
	@Basic
	@Column(name="SUC_FEC_CREO")
	private Date fechaCreacion;
	
	@Basic
	@Column(name="SUC_HORA_CREO")
	private Time horaCreacion;
	
	@Basic
	@Column(name="SUC_FEC_MOD")
	private Date fechaModificacion;
	
	@Basic
	@Column(name="SUC_HORA_MOD")
	private Time horaModificacion;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
   
}
