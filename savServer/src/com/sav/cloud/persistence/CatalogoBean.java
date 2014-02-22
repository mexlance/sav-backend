package com.sav.cloud.persistence;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.sav.cloud.entities.Catalogo;


/**
 * Session Bean implementation class CatalogoBean
 */
@Stateless
@LocalBean
public class CatalogoBean {
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public CatalogoBean() {
        // TODO Auto-generated constructor stub
    }
    
    public List<Catalogo> getAllCatalogos() {
		return em.createNamedQuery("AllCatalogos").getResultList();
	}
	
	public void addCatalogo(Catalogo catalogo) {
		em.persist(catalogo);
		em.flush();
	}

}
