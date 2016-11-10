package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validar
 */
@WebServlet("/Validar")
public class Validar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Validar() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// SIMULANDO UN NOMBRE , APELLIDO, NUM TARJETA
		
		String minombre = new String ("Manases");
		String miapellido = new String ("Sanchez");
		String mitarjeta = new String ("000111222");
		String mimetalico = new String ("20");
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String numerotarjeta = request.getParameter("numerotarjeta");
		String validar = request.getParameter("validar");
		String metalico = request.getParameter("metalico");
		
		
if(validar != null){
			if(numerotarjeta != null){
				
				if((nombre.equals(minombre)) && (apellido.equals(miapellido)) && (numerotarjeta.equals(mitarjeta))) {	
					
					request.setAttribute("dato1", "TARJETA");
					//response.sendRedirect("html/combustible.jsp");
					request.getRequestDispatcher("html/combustible.jsp").forward(request, response);
				}
				
				
				else{	
					response.sendRedirect("Index.html");
				}	
				
			}
			else{
				
				if((nombre.equals(minombre)) && (apellido.equals(miapellido)) && (metalico.equals(mimetalico))) {	
					request.setAttribute("dato1", "EFECTIVO");
					//response.sendRedirect("html/combustible.jsp");
					request.getRequestDispatcher("html/combustible.jsp").forward(request, response);
				}
				
				else{	
					response.sendRedirect("Index.html");
				}	
				
				
			}
		}
	}
	

	
	

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        doGet(request, response);
    }

}
