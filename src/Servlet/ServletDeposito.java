package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Clases.Operar;
import Clases.Usuario;
/**
 * Servlet implementation class Saldos
 */
@WebServlet("/ServletDeposito")
public class ServletDeposito extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDeposito() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
			
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario usu = new Usuario();
		int cantidad = Integer.parseInt(request.getParameter("cant_dep"));	
		String rut=request.getParameter("valor");
		
		for(Usuario usuario : lista) {
			if(usuario.getRut().equals(rut)) {
				int saldo = usuario.getSaldo();
				int total = saldo+cantidad;
				
				usu.setSaldo(total);
				lista.add(usu);
				//Operar.anadirArchivo(lista);
			}
		}
		
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Retiro</title>");
		pw.println("</head>");
		pw.println("<form method='get' action='Datos'>");
		pw.println("<body>");
		pw.println("<h1>Operacion exitosa</h1>");
		pw.println("<input type='submit' value='volver al inicio'>");
		pw.println("</form>");
		pw.println("</body></html>");
	}

}
