package com.sav.cloud.persistence;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.google.gson.Gson;

import com.sav.cloud.domain.ConsultaPrecios;
import com.sav.cloud.entities.ListaItem;

/**
 * Servlet implementation class ConsultaServlet
 */
@WebServlet("/Consulta/*")
public class ConsultaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(ConsultaServlet.class);
	
	@EJB
	ConsultaBean consultaBean;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Gson   gson     = null;
		String consulta = null;
		String idCatalogo = null;
		int    val      = 0;
		List<ConsultaPrecios> lPrecios  = null;
		ConsultaPrecios lPrecio = null;
		
		try {
			consulta = request.getPathInfo();
			
			System.out.println("Path: " + consulta);
			
			if (consulta.equals("/precios")) {
				val = 1;
			}
			
			switch (val) {
			case 1:
												
				idCatalogo = request.getParameter("catalogo");
				System.out.println("catalogo seleccionado: " + idCatalogo);
				
				if (idCatalogo != null && idCatalogo.length() > 0) {
					
					response.setContentType("application/json");
					//Se buscan los catalogos
					List<ListaItem> listaItem = consultaBean.getListasbyCatalago(idCatalogo);
					
					//Se realiza la conversion JSON
					if (listaItem != null) {
						gson = new Gson();
						for(ListaItem list : listaItem) {
							lPrecio = new ConsultaPrecios();
							lPrecio.setMaterial(list.getMaterial());
							lPrecio.setPagina(list.getPagina());
							lPrecio.setPrecioContado(list.getPrecioContado());
							lPrecio.setPrecioPagos(list.getPrecioPagos());
							lPrecio.setUbicacion(list.getUbicacion());
							
							if (lPrecios == null) {
								lPrecios = new ArrayList<ConsultaPrecios>();
							}
							//Se agregan los objetos
							lPrecios.add(lPrecio);
						}
						response.getWriter().write(gson.toJson(lPrecios));
					}
				}
				
				break;
				
			default:
				break;
			}			
			
		} catch (Exception e) {
			response.getWriter().println(
					"Persistence operation failed with reason: "
							+ e.getMessage());
			LOGGER.error("Persistence operation failed", e);
		}
		//Asignar valores a null para limpieza de objetos en memoria
		gson = null;
		lPrecios = null;
		lPrecio = null;

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
