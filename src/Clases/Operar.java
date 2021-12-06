package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Operar {

	public static void crearArchivo(ArrayList<Usuario> lista) {
		FileWriter fw=null;
		
		try {
			fw=new FileWriter("C:\\archivos\\lista.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			for(Usuario usuario : lista) {
				bw.write(usuario.getRut() + "," + usuario.getNombre() + "," + usuario.getApellido() + ","
						+ usuario.getClave() + "," + usuario.getSaldo() + "\n");
			}
			bw.close();
			System.out.println("Archivo creado");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if (fw!=null) {
				try {
					fw.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
	
	public static ArrayList leer() {
		File file=new File("C:\\archivos\\lista.txt");
		ArrayList listaUsuarios = new ArrayList<>();
		Scanner sc;
		
		try {
			sc=new Scanner(file);
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				Scanner delimitar = new Scanner(s);
				
				delimitar.useDelimiter("\\s*,\\s*");
				
				Usuario u = new Usuario();
				u.setRut(delimitar.next());
				u.setNombre(delimitar.next());
				u.setApellido(delimitar.next());
				u.setClave(delimitar.next());
				u.setSaldo(delimitar.nextInt());
				
				listaUsuarios.add(u);
			}
			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listaUsuarios;
	}
	
	public static void anadirArchivo(ArrayList<Usuario> lista) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("C:\\archivos\\lista.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			for(Usuario usuario : lista) {
				bw.write(usuario.getRut() + "," + usuario.getNombre() + "," + usuario.getApellido() + ","
						+ usuario.getClave() + "," + usuario.getSaldo() + "\n");
			}
			bw.close();
			System.out.println("archivo modificado");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if (fw!=null) {
				try {
					fw.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
	
	public static void modificar(int posicion, String lineaNue) {
		/*Random aleatorio= new Random();
		
		String nombreFicNuevo = ficheroAntigua.getParent()+"/auxiliar"+String.valueOf(Math.abs(aleatorio.nextInt()))+".txt";
		
		File archivoNuevo=new File(nombreFicNuevo);
		FileWriter fw=null;
		try {
			fw=new FileWriter("C:\\archivos\\lista.txt", true);
			if (ficheroAntigua.exists()) {
				BufferedReader bur=new BufferedReader(new FileReader(ficheroAntigua));
				
				String linea;
				while ((linea=bur.readLine())!=null) {
					if (linea.toUpperCase().trim().equals(lineaAnt.toUpperCase().trim())) {
						BufferedWriter bw=new BufferedWriter(fw);
						bw.write(lineaNue);
					}
					
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		FileWriter fichero = null;
		PrintWriter escritor = null;
		try {
			fichero=new FileWriter("C:\\archivos\\lista.txt");
			escritor=new PrintWriter(fichero);
			escritor.flush();
			
			String split[] = leer().toString().split("\n");
			split[posicion] = lineaNue;
			for (int i = 0; i < split.length; i++) {
				escritor.write(split[i]);
				escritor.println();
			}
			escritor.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	/*public static void modificarSaldo(ArrayList<Usuario> lista) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("C:\\archivos\\lista.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			for(Usuario usuario : lista) {
				bw.write(usuario.getRut() + "," + usuario.getNombre() + "," + usuario.getApellido() + ","
						+ usuario.getClave() + "," + usuario.getSaldo() + "\n");
			}
			bw.close();
			System.out.println("archivo modificado");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if (fw!=null) {
				try {
					fw.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}*/
}
