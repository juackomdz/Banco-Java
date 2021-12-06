package Clases;

import java.util.ArrayList;
import java.util.Iterator;

public class Mantenedor {
	
	ArrayList<DatosTransferencia> lista = new ArrayList<>();
	
	public void Agregar(String nom, String rut, String banco, String tipoCuenta, String nroCuenta, String email) {
			
		DatosTransferencia da = new DatosTransferencia();

		da.setNombre(nom);
		da.setRut(rut);
		da.setBanco(banco);
		da.setTipoCuenta(tipoCuenta);
		da.setNroCuenta(nroCuenta);
		da.setEmail(email);
		
		lista.add(da);
	}
	
	public void Modificar(String nom, String rut, String banco, String tipoCuenta, String nroCuenta, String email) {
		
		//DatosTransferencia dt = new DatosTransferencia();
		
		int indice=Buscar(rut);
		
		lista.get(indice).setNombre(nom);
		lista.get(indice).setRut(rut);
		lista.get(indice).setBanco(banco);
		lista.get(indice).setTipoCuenta(tipoCuenta);
		lista.get(indice).setNroCuenta(nroCuenta);
		lista.get(indice).setEmail(email);
		
	}
	
	public void Listar() {
		
		for (DatosTransferencia dat : lista) {
			System.out.println(dat.getNombre()+","+dat.getRut()+","+dat.getBanco());
		}
		
	}
	
	public int Buscar(String r) {
		int index = -1;
		int dimension=lista.size();
		
		for(int i=0;i<dimension;i++) {
			if(lista.get(i).getRut().equals(r)) {
				index=i;
			}
		}
		return index;
	}
	
	public void Eliminar(String rut) {
		int indice = Buscar(rut);
		lista.remove(indice);
	}
}
