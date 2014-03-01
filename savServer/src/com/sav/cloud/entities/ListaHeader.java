package com.sav.cloud.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ListaHeader
 *
 */
@Entity
@Table(name="LISTAS_H")
@NamedQuery(name = "AllListasHeader", query = "select lh from ListaHeader lh")
public class ListaHeader implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public ListaHeader() {
		super();
	}
	
	@Id
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
	
	@Basic
	@Column(name="LSH_VIGENCIA_INI")
	private String iniVigencia;
	
	@Basic
	@Column(name="LSH_VIGENCIA_FIN")
	private String finVigencia;
	
	@Basic
	@Column(name="LSH_BORRAR")
	private String isBorrar;
	
	@Basic
	@Column(name="LSH_FEC_CREO")
	private Date fechaCreacion;
	
	@Basic
	@Column(name="LSH_HORA_CREO")
	private Time horaCreacion;
	
	@Basic
	@Column(name="LSH_FEC_MOD")
	private Date fechaModificacion;
	
	@Basic
	@Column(name="LSH_HORA_MOD")
	private Time horaModificacion;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "CAT_ID", referencedColumnName = "CAT_ID", 
//		insertable = false, updatable = false)	
//	private Catalogo catalogo;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="listah")
	private List<ListaItem> listaItem;
	

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

	/**
	 * @return the iniVigencia
	 */
	public String getIniVigencia() {
		return iniVigencia;
	}

	/**
	 * @param iniVigencia the iniVigencia to set
	 */
	public void setIniVigencia(String iniVigencia) {
		this.iniVigencia = iniVigencia;
	}

	/**
	 * @return the finVigencia
	 */
	public String getFinVigencia() {
		return finVigencia;
	}

	/**
	 * @param finVigencia the finVigencia to set
	 */
	public void setFinVigencia(String finVigencia) {
		this.finVigencia = finVigencia;
	}

	/**
	 * @return the isBorrar
	 */
	public String isBorrar() {
		return isBorrar;
	}

	/**
	 * @param isBorrar the isBorrar to set
	 */
	public void setBorrar(String isBorrar) {
		this.isBorrar = isBorrar;
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
