package com.sav.cloud.persistence;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.sav.cloud.entities.Catalogo;

/**
 * Servlet implementation class CatalogoEJBServlet
 */
@WebServlet("/Catalogo")
public class CatalogoEJBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(CatalogoEJBServlet.class);
	
	@EJB
	CatalogoBean catalogoBean;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatalogoEJBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Gson   gson   = null;
		try {
			response.setContentType("application/json");
			//Se buscan los catalogos
			List<Catalogo> catalogos  = catalogoBean.getAllCatalogos();
			//Se realiza la conversion JSON
			gson = new Gson();
			response.getWriter().write(gson.toJson(catalogos));
			
						
			
		} catch (Exception e) {
			response.getWriter().println(
					"Persistence operation failed with reason: "
							+ e.getMessage());
			LOGGER.error("Persistence operation failed", e);
		}
		//Asignar valores a null para limpieza de objetos en memoria
		gson = null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
