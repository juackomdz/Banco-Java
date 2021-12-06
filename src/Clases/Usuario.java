package Clases;

public class Usuario {

	private String Rut;
	private String Nombre;
	private String Apellido;
	private String Clave;
	private int Saldo;
	
	public String getRut() {
		return Rut;
	}
	public void setRut(String rut) {
		Rut = rut;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getClave() {
		return Clave;
	}
	public void setClave(String clave) {
		Clave = clave;
	}
	
	public Usuario() {
		Rut="";
		Nombre="";
		Apellido="";
		Clave="";
		Saldo=0;
	}
	
	public Usuario(String rut, String nombre, String apellido, String clave, int saldo) {
		this.Rut=rut;
		this.Nombre=nombre;
		this.Apellido=apellido;
		this.Clave=clave;
		this.Saldo=saldo;
	}
	public int getSaldo() {
		return Saldo;
	}
	public void setSaldo(int saldo) {
		Saldo = saldo;
	}
	
	public int Depositar(int deposito) {
		int total;
		total=this.getSaldo()+deposito;
		return total;
	}
}
