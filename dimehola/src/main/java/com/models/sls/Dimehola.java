package com.models.sls;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Dimehola extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public Dimehola() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String txtrec=request.getParameter("txt");
		request.setAttribute("txt", txtrec);
		
		request.getRequestDispatcher("/hola.jsp").forward(request, response);;
		
//** http://localhost:8080/dimehola/hola?txt=puta**//
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
