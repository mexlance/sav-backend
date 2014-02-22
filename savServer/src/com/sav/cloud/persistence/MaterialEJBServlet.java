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

import com.sav.cloud.entities.Material;

import com.google.gson.Gson;


/**
 * Servlet implementation class MaterialEJBServlet
 */
@WebServlet( urlPatterns={"/Material","/Material/*"})
public class MaterialEJBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(MaterialEJBServlet.class);
	
	@EJB
	MaterialBean materialBean;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaterialEJBServlet() {
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
			/*response.getWriter().println("<p>Primera aplicaci�n JPA</p><br>");
			response.getWriter().println("<p>"+ request.getPathInfo() +"</p><br>");
			response.getWriter().println("<p>"+ request.getParameterMap() +"</p><br>");*/
			//Se inicia la extracci�n de los materiales
			List<Material> materiales  = materialBean.getAllMaterials();
			//tamMat = materiales.size();
			//Se realiza la conversion JSON
			gson = new Gson();
			response.getWriter().write(gson.toJson(materiales));			
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
		doGet(request,response);
	}

}
