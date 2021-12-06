package Clases;

import java.sql.*;

public class Conexion {

	Connection con = null;
	
	public Conexion() throws Exception{
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String servidor,usuario,pass,bd;
			//bd="dbintersigir01";
			//usuario="SIGIR_H";
			//pass="SIGIR_H";
			//servidor="jdbc:oracle:thin:@dbintersigir01:1521:orcl";
			try {
				this.con=DriverManager.getConnection("jdbc:oracle:thin:@dbintersigir01:1521","SIGIR_H","SIGIR_H");
			} catch (SQLException e) {
				// TODO: handle exception
				throw new Exception(e.getMessage());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception(e.getMessage());
		}
	}
	
	public Connection getConexion() {
		return con;
	}
}
