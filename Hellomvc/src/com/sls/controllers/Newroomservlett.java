package com.sls.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sls.database.DBDD;
import com.sls.models.Room;
import com.sls.models.Usuario;

/**
 * Servlet implementation class Newroom
 */
@WebServlet("/Newroom")
public class Newroomservlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Newroomservlett() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("./Newroom.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String streetnur = request.getParameter("street");

		
		String surfacetemp = request.getParameter("Surface");
        //int  surfacenur= Integer.parseInt(surfacetemp);
		
        int surfacenur=0;
        
        try {
        	surfacenur= Integer.parseInt(surfacetemp);	
        }
        catch (Exception e) {
        	
        	System.out.println("Exception" + e.getMessage());
			request.setAttribute("mensajeerror", "El formulario tiene mensajes incorrectos");
request.setAttribute("mensajeerror2", "Que es un numero, melon");
			this.doGet(request, response);

        	
        }
        
    	//if (streetnur == null || streetnur.equals("") || streetnur.indexOf("0-9") <= 0) {
			//request.setAttribute("mensajeerror", "El formulario tiene mensajes incorrectos");

		//}
    	//else {
        
        Room nuevoroom = new Room(0,streetnur, surfacenur);
        		
        if(nuevoroom.esValido()){

		
		DBDD dbdd =  DBDD.getinstance();
		dbdd.insertahabitacion(nuevoroom);
		response.sendRedirect("Newuser");
		

}
		
        else{
			request.setAttribute("mensajeerror", "El formulario tiene mensajes incorrectos");
			request.setAttribute("newroom", nuevoroom);


			this.doGet(request, response);
        }
        
        
		
		
		
	

}}
