package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Clases.Mantenedor;

/**
 * Servlet implementation class ServletDest
 */
@WebServlet("/ServletDest")
public class ServletDest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String accion = request.getParameter("btn_accion");
		
		String nombre = request.getParameter("nombre");
		String rut = request.getParameter("rut");
		String banco = request.getParameter("banco");
		String tipo = request.getParameter("tpo_cuenta");
		String numro = request.getParameter("nro_cuenta");
		String email = request.getParameter("email");
		
		
		Mantenedor man = new Mantenedor();
		PrintWriter pw = response.getWriter();
		try {
		switch (accion) {
		case "Agregar":
			man.Agregar(nombre, rut, banco, tipo, numro, email);
			pw.println("<h2>Destinatario creado exitosamente</h2>");
			pw.println("<a href='Transferencias.jsp'>volver a inicio</a>");
			break;
		case "Modificar":
			man.Modificar(nombre, rut, banco, tipo, numro, email);
			pw.println("<h2>Destinatario modificado exitosamente</h2>");
			pw.println("<a href='Transferencias.jsp'>volver a inicio</a>");
			break;
		}
		
		} catch (Exception e) {
			// TODO: handle exception
			pw.println("Ha ocurido un error");
		}
		
		
	}

}
