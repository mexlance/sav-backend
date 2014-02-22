package com.sav.cloud.persistence;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.sav.cloud.entities.Material;

/**
 * Session Bean implementation class MaterialBean
 */
@Stateless
@LocalBean
public class MaterialBean {
	
	@PersistenceContext
	private EntityManager em;
	
	/**
     * Default constructor. 
     */
    public MaterialBean() {
        // TODO Auto-generated constructor stub
    }
    
    public List<Material> getAllMaterials() {
		return em.createNamedQuery("AllMaterials").getResultList();
	}
	
	public void addMaterial(Material material) {
		em.persist(material);
		em.flush();
	}

}
