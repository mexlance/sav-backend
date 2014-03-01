/**
 * 
 */
package com.sav.cloud.domain;

/**
 * @author 449897
 *
 */
public class ConsultaPrecios {
	
	private String material;
	
	//private float precioSocio;
	
	private float precioContado;
	
	private float precioPagos;
	
	private String pagina;
	
	private String ubicacion;

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
	
}
