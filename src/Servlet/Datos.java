package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Clases.Operar;
import Clases.Usuario;
import Clases.Usuarios;

/**
 * Servlet implementation class Datos
 */
@WebServlet("/Datos")
public class Datos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Datos() {
        super();
        // TODO Auto-generated constructor stub
        
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*HttpSession session=request.getSession();
		Usuario usuarios = (Usuario)session.getAttribute("usuario");
		
		PrintWriter pw = response.getWriter();
		int total;
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Bienvenido</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>Bienvenido " + usuarios.getNombre() +" " + usuarios.getApellido() + "</h1>");
		pw.println("<h3>Su saldo es: " + usuarios.getSaldo() + "</h3>");
		pw.println("<a href='Depositar.jsp'><input type='button' value='Depositar'></a>");
		pw.println("<a href='Retirar.jsp'><input type='button' value='Retirar'></a>");
		pw.println("<a href='Transferencias.jsp'><input type='button' value='Destinatarios'/></a>");
		pw.println("</body>");
		pw.println("</html>");
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		PrintWriter pw = response.getWriter();
		try {
			Usuarios usus = new Usuarios();
			
			String rut, clave, accion;
			
			rut=request.getParameter("rut");
			clave=request.getParameter("clave");
			accion=request.getParameter("accion");
			
			if(usus.validar(rut, clave)==true) {
				pw.println("<h1>bienvenido</h1>");
			}
		} catch (Exception e) {
			// TODO: handle exception
			pw.println(e.getMessage());
		}
		
		
		//ArrayList<Usuario> lista = new ArrayList<>();
		//lista=Operar.leer();
		
		
		
		
		
		
		/*for(Usuario usua : lista) {
			session.setAttribute("usuario", usua);
			if(usua.getRut().equals(rut) && usua.getClave().equals(clave)) {
				pw.println("");
				pw.println("<!DOCTYPE html>");
				pw.println("<html>");
				pw.println("<head>");
				pw.println("<title>Bienvenido</title>");
				pw.println("</head>");
				pw.println("<body>");
				
				pw.println("<h1>Bienvenido " + usua.getNombre() +" " + usua.getApellido() + "</h1>");
				pw.println("<h3>Su saldo es: " + usua.getSaldo() + "</h3>");
				pw.println("<a href='Depositar.jsp'><input type='button' value='Depositar'></a>");
				pw.println("<a href='Retirar.jsp'><input type='button' value='Retirar'></a>");
				pw.println("<a href='Transferencias.jsp'><input type='button' value='Destinatarios'/></a>");
				pw.println("<input type='hidden' name='sald' value='"+usua.getRut()+"'>");
				
				pw.println("</body>");
				pw.println("</html>");
				
				
	          }
			else {
				pw.println("rut o clave incorrectos");
				//break;
			}
		}*/
	}

}
