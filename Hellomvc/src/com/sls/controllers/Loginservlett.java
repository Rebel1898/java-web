package com.sls.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sls.database.DBDD;

/**
 * Servlet implementation class Loginservlett
 */
@WebServlet("/Login")
public class Loginservlett extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Loginservlett() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("./login.jsp").forward(request, response);
		
		HttpSession session = request.getSession();
		
		if( session.getAttribute("usuario")!=null) {
			
			DBDD dbdd = new DBDD();
			request.setAttribute("LosUsuarios",dbdd.usuarios);
		   request.getRequestDispatcher("listado").forward(request, response);
			
			
		}
		
		
		else     {response.sendRedirect("login");}
		
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String emailr = request.getParameter("email");
		String passwordr = request.getParameter("password");

		System.out.println("Estoy en el post " + emailr + " " + passwordr);

		DBDD dbdd =  DBDD.getinstance();
		boolean existe = dbdd.dameusuariopormailypass(emailr, passwordr);
		
		HttpSession session=request.getSession();

		if (existe) {
			session.setAttribute("usuario", emailr);
			response.sendRedirect("listado");

			/*
			 * La otra forma es un
			 * request.getRequestDispatcher("./listado").forward(request, response); Uno
			 * deja ver la direccion y el otro no
			 */
		}

		else {
			request.setAttribute("error", "Usuario y contraseņa no existe");
			this.doGet(request, response);
		}
	}

}
