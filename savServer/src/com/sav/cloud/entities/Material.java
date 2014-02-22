package com.sav.cloud.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "MATERIALES")
@NamedQuery(name = "AllMaterials", query = "select m from Material m")

public class Material implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public Material() {
		super();
	}

	/**
	 * Class holding information of material.
	 **/

	@Id
	@GeneratedValue
	private String mat_id;
	@Basic
	private String mai_tip;
	@Basic
	private String mat_des;
	@Basic
	private String mat_marca;
	@Basic
	private String mat_colores;
	@Basic
	private String mat_forro;
	@Basic
	private String mat_plantilla;
	@Basic
	private String mat_corte;
	@Basic
	private String mat_material;
	@Basic
	private String mat_talla;
	@Basic
	private String mat_fecha;
	@Basic
	private String mat_observaciones;
	@Basic
	private String mat_modelo;
	@Basic
	private String mat_carga;
	@Basic
	private String mat_borrar;
	@Basic
	private Date mat_fec_creo;
	@Basic
	private Time mat_hora_creo;
	@Basic
	private Date mat_fec_mod;
	@Basic
	private Time mat_hora_mod;
	
	public String getMat_id() {
		return mat_id;
	}
	public void setMat_id(String mat_id) {
		this.mat_id = mat_id;
	}
	public String getMai_tip() {
		return mai_tip;
	}
	public void setMai_tip(String mai_tip) {
		this.mai_tip = mai_tip;
	}
	public String getMat_des() {
		return mat_des;
	}
	public void setMat_des(String mat_des) {
		this.mat_des = mat_des;
	}
	public String getMat_marca() {
		return mat_marca;
	}
	public void setMat_marca(String mat_marca) {
		this.mat_marca = mat_marca;
	}
	public String getMat_colores() {
		return mat_colores;
	}
	public void setMat_colores(String mat_colores) {
		this.mat_colores = mat_colores;
	}
	public String getMat_forro() {
		return mat_forro;
	}
	public void setMat_forro(String mat_forro) {
		this.mat_forro = mat_forro;
	}
	public String getMat_plantilla() {
		return mat_plantilla;
	}
	public void setMat_plantilla(String mat_plantilla) {
		this.mat_plantilla = mat_plantilla;
	}
	public String getMat_corte() {
		return mat_corte;
	}
	public void setMat_corte(String mat_corte) {
		this.mat_corte = mat_corte;
	}
	public String getMat_material() {
		return mat_material;
	}
	public void setMat_material(String mat_material) {
		this.mat_material = mat_material;
	}
	public String getMat_talla() {
		return mat_talla;
	}
	public void setMat_talla(String mat_talla) {
		this.mat_talla = mat_talla;
	}
	public String getMat_fecha() {
		return mat_fecha;
	}
	public void setMat_fecha(String mat_fecha) {
		this.mat_fecha = mat_fecha;
	}
	public String getMat_observaciones() {
		return mat_observaciones;
	}
	public void setMat_observaciones(String mat_observaciones) {
		this.mat_observaciones = mat_observaciones;
	}
	public String getMat_modelo() {
		return mat_modelo;
	}
	public void setMat_modelo(String mat_modelo) {
		this.mat_modelo = mat_modelo;
	}
	public String getMat_carga() {
		return mat_carga;
	}
	public void setMat_carga(String mat_carga) {
		this.mat_carga = mat_carga;
	}
	public String getMat_borrar() {
		return mat_borrar;
	}
	public void setMat_borrar(String mat_borrar) {
		this.mat_borrar = mat_borrar;
	}
	public Date getMat_fec_creo() {
		return mat_fec_creo;
	}
	public void setMat_fec_creo(Date mat_fec_creo) {
		this.mat_fec_creo = mat_fec_creo;
	}
	public Time getMat_hora_creo() {
		return mat_hora_creo;
	}
	public void setMat_hora_creo(Time mat_hora_creo) {
		this.mat_hora_creo = mat_hora_creo;
	}
	public Date getMat_fec_mod() {
		return mat_fec_mod;
	}
	public void setMat_fec_mod(Date mat_fec_mod) {
		this.mat_fec_mod = mat_fec_mod;
	}
	public Time getMat_hora_mod() {
		return mat_hora_mod;
	}
	public void setMat_hora_mod(Time mat_hora_mod) {
		this.mat_hora_mod = mat_hora_mod;
	}
}
