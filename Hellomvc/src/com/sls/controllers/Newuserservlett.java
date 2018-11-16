package com.sls.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sls.database.DBDD;
import com.sls.models.Room;
import com.sls.models.Usuario;

/**
 * Servlet implementation class Newuserservlett
 */
@WebServlet("/Newuser")
public class Newuserservlett extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Newuserservlett() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 ArrayList<Room> lasHabitaciones = DBDD.getinstance().habitaciones;
		request.setAttribute("lasHabitaciones",lasHabitaciones );
		request.getRequestDispatcher("./Newuser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usernamenur = request.getParameter("user");

		String emailnur = request.getParameter("email");
		String passwordnur1 = request.getParameter("password1");
		String passwordnur2 = request.getParameter("password2");
		String habitacionesr= request.getParameter("habitacion");
		
        int habitacionesnur=0;

		
		   try {
			   habitacionesnur= Integer.parseInt(habitacionesr);	
	        }
	        catch (Exception e) {
	        	
	        	System.out.println("Exception" + e.getMessage());
				
				this.doGet(request, response);

	        	
	        }
		
		
		
		
		Usuario nuevoUser = new Usuario(0, usernamenur, emailnur, DBDD.getinstance().getHabitacionbyhid(habitacionesnur), passwordnur1);

		// if((emailnur!=null)&&(!emailnur.equals(""))&&(emailnur.indexOf("@")>0)) { }
		if (nuevoUser.esValido(passwordnur2)==true) {
			DBDD dbdd =  DBDD.getinstance();
			dbdd.insertausuario(nuevoUser);
			response.sendRedirect("listado");



		} else {
			request.setAttribute("mensajeerror", "El formulario tiene mensajes incorrectos");
			request.setAttribute("emailrecibido", emailnur);
			if (emailnur == null || emailnur.equals("") || emailnur.indexOf("@") <= 0)
			{request.setAttribute("emailrecibido2", "error en el campo mail");}
			
			//if (usernamenur == null || usernamenur.equals("")) {
				//request.setAttribute("emailrecibido2", "error en el campo mail");}
			
			//if (usernamenur.matches("(.*)?[0-9](.*)?")) 
				
			//{request.setAttribute("emailrecibido2", "error en el campo mail");}

			

			request.setAttribute("namerecibido", usernamenur);

			
			
			
			

			
			
			
			
			
			
			
			
			this.doGet(request, response);
			System.out.println("Not so good"+usernamenur+emailnur+passwordnur1);


		}
	}

}
