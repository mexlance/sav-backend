package com.sav.cloud.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;
import com.sav.cloud.entities.ListaHeader;
import java.util.List;

/**
 * Entity implementation class for Entity: Catalogo
 * 
 */
@Entity
@Table(name = "Catalogos")
@NamedQuery(name = "AllCatalogos", query = "select c from Catalogo c")
public class Catalogo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CAT_ID", nullable = false)
	@Basic
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CATALOGOS")
	@SequenceGenerator(name = "SEQ_CATALOGOS", sequenceName = "SEQ_CATALOGOS", schema = "NEO_95TX8CQ9UTSKSYW51TUHCVNXA", allocationSize = 1)
	private String id;
	
	@Basic
	@Column(name="CAT_DES")
	private String descripcion;
	
	@Basic
	@Column(name="CAT_ACT")
	private String actual;
	
	@Basic
	@Column(name="CAT_ANIO")
	private String anio;
	
	@Basic
	@Column(name="CAT_FEC_CREO")
	private Date fechaCreacion;
	
	@Basic
	@Column(name="CAT_HORA_CREO")
	private Time horaCreacion;
	
	@Basic
	@Column(name="CAT_FEC_MOD")
	private Date fechaModificacion;
	
	@Basic
	@Column(name="CAT_HORA_MOD")
	private Time horaModificacion;

//	@OneToMany(fetch=FetchType.LAZY, mappedBy="catalogo")
//	private List<ListaHeader> listaHeader;

	public Catalogo() {
		super();
	}

	public void setId(String param) {
		this.id = param;
	}

	public String getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getActual() {
		return actual;
	}

	public void setActual(String actual) {
		this.actual = actual;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Time getHoraCreacion() {
		return horaCreacion;
	}

	public void setHoraCreacion(Time horaCreacion) {
		this.horaCreacion = horaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Time getHoraModificacion() {
		return horaModificacion;
	}

	public void setHoraModificacion(Time horaModificacion) {
		this.horaModificacion = horaModificacion;
	}
//
//	public List<ListaHeader> getListaHeader() {
//	    return listaHeader;
//	}
//
//	public void setListaHeader(List<ListaHeader> param) {
//	    this.listaHeader = param;
//	}

}
