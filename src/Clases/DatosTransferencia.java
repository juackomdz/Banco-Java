package Clases;

public class DatosTransferencia {

	private String nombre;
	private String rut;
	private String banco;
	private String tipoCuenta;
	private String nroCuenta;
	private String email;
	
	public DatosTransferencia() {
		this.setNombre("");
		this.setRut("");
		this.setBanco("");
		this.setTipoCuenta("");
		this.setNroCuenta("");
		this.setEmail("");
	}
	
	public DatosTransferencia(String Nombre, String Rut, String Banco, String TipoCuenta, String NroCuenta, String Email) {
		this.setNombre(Nombre);
		this.setRut(Rut);
		this.setBanco(Banco);
		this.setTipoCuenta(TipoCuenta);
		this.setNroCuenta(NroCuenta);
		this.setEmail(Email);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
