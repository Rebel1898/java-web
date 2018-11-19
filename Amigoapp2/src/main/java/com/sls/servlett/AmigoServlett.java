package com.sls.servlett;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sls.models.Formulario;

/**
 * Servlet implementation class AmigoServlett
 */
public class AmigoServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public AmigoServlett() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/amigos.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstnamenur = request.getParameter("firstname");
		String lastnamenur = request.getParameter("lastname");

		String emailnur = request.getParameter("email");
		String passwordnur1 = request.getParameter("password");

		int pinur = Integer.parseInt(request.getParameter("pin"));

		Formulario nuevoform = new Formulario(firstnamenur, lastnamenur, emailnur, passwordnur1, pinur);

		
		
		//request set attributes   ${formulario.firstname }  trycatch validar
		
		//if ( .esValid) {   request dispatcher else (diverror)

		//integer parse int
		//
		
		
		
		
		
		
		
		
	}

}
