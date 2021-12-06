package Clases;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList listaUsuarios = new ArrayList<>();
		
		Usuario usu1 = new Usuario();
		usu1.setRut("1357295-6");
		usu1.setNombre("Claudio");
		usu1.setApellido("Perez");
		usu1.setClave("123456");
		usu1.setSaldo(1000);
		
		listaUsuarios.add(usu1);
		
		Usuario usu2 = new Usuario();
		usu2.setRut("1234567-8");
		usu2.setNombre("Pedro");
		usu2.setApellido("Gonzales");
		usu2.setClave("1345");
		usu2.setSaldo(3200);
		
		listaUsuarios.add(usu2);
		
		Operar.crearArchivo(listaUsuarios);
	}

}
