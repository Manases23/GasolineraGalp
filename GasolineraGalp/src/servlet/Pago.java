package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Pago
 */
@WebServlet("/Pago")
public class Pago extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pago() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		String minombre = new String ("Manases");
		String miapellido = new String ("Sanchez");
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String pagar = request.getParameter("pagar");
		
		if(pagar != null){
			if((nombre.equals(minombre)) && (apellido.equals(miapellido))) {
				response.sendRedirect("html/gracias.html");
			}
			else{
				response.sendRedirect("Index.html");
			}
					
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
