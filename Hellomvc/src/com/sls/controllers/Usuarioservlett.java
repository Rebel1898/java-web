package com.sls.controllers;
import com.sls.database.DBDD;
import com.sls.models.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class usuarioservlett
 */
@WebServlet("/usuario")//La anotacvion define la ruta de escucha.Solo escuchara eb ysyarui
public class Usuarioservlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*Usuario juan =new Usuario (1,"Juan","juan@it.it",10);
		Usuario maria =new Usuario (2,"Maria","mario@it.it",20);
		Usuario paco =new Usuario (3,"paco","paco@it.it",30);
		*/
		
		String idUsuario= request.getParameter("id");
		System.out.println("ID recibido"+idUsuario);

		DBDD dbdd =DBDD.getinstance();
		
		int id=Integer.parseInt(idUsuario);
		
		request.setAttribute("elUsuario",dbdd.getUsuariobyid(id));
		
		
      request.getRequestDispatcher("./usuario.jsp").forward(request,response);
      
      

		
           
		/*response.getWriter().append("Nombre de usuario  "+ juan.name + " " ).append(request.getContextPath());
	*/
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}