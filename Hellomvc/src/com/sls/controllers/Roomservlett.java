package com.sls.controllers;

import com.sls.database.DBDD;
import com.sls.models.Room;
import com.sls.models.Usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Roomservlett
 */
@WebServlet("/Room")
public class Roomservlett extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * 
	 * 
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 */
		/*
		 * Room habitacionjuan = new Room(10,"HJ Puerto Perico",100); Room
		 * habitacionmaria = new Room(20,"HM Avenida de la heroina",200); Room
		 * habitacionpaco = new Room(30,"HP Calle del Jaco",300);
		 */

		/*
		 * Room habitacionpepe= dbdd.habitaciones.get(2);
		 * 
		 * request.setAttribute("laHabitacion",habitacionpepe);
		 */

		String idHabitacion = request.getParameter("hid");/* Servlett esta esparando un hid" */
		System.out.println("HID recibido" + idHabitacion);

		int idh = Integer.parseInt(idHabitacion);
		DBDD dbdd =  DBDD.getinstance();
		request.setAttribute("laHabitacion", dbdd.getHabitacionbyhid(idh));

		request.getRequestDispatcher("./Room.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		HttpSession session=request.getSession();

	
		
		
		
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
