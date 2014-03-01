package com.sav.cloud.persistence;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sav.cloud.entities.ListaItem;

/**
 * Session Bean implementation class ConsultaBean
 */
@Stateless
@LocalBean
public class ConsultaBean {
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(ConsultaBean.class); 
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public ConsultaBean() {
        // TODO Auto-generated constructor stub
    }
    
    public List<ListaItem> getAllListas() {
		return em.createNamedQuery("AllListasItem").getResultList();
	}
    
    public List<ListaItem> getListasbyCatalago(String catalogo) {
    	
    	Query query = null;
    	
    	try {
    		query = em.createQuery("Select li " +
        			"From ListaHeader lh JOIN lh.listaItem li " +
        			"Where lh.idCatalogo = :catalogo");
        	query.setParameter("catalogo", catalogo);
        	
        	return query.getResultList();
        	
		} catch (Exception e) {
			LOGGER.error("Error ConsultaBean.getListasbyCatalago: " + e.getMessage());
		}
    	
    	query = null;
		return null;
	}

}
