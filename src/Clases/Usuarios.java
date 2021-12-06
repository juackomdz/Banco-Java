package Clases;

import java.sql.*;
import java.util.ArrayList;

public class Usuarios {

	ArrayList<Usuario> datos;
	Conexion c;
	
	public Usuarios() throws Exception{
		
		this.datos=new ArrayList<>();
		c=new Conexion();
		if(c.getConexion()==null) {
			throw new Exception("no se pudo conectar");
		}
	}
	
	public boolean validar(String rut, String pass){
		
		String sql ="select RUT,PASSWORD_KEY from SIGIR_H.JMT_CLIENTE where RUT=? AND PASSWORD_KEY=?";
		boolean res=false;
		try {
			PreparedStatement ps = this.c.getConexion().prepareStatement(sql);
			ps.setString(1, rut);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				res=true;
			}
		} catch (SQLException e) {
			e.getMessage();
		}
		return res;
	}
}
