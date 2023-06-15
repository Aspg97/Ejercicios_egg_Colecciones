package Ej_01_02_perros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main_perro {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Perro_service tool = new Perro_service();
		ArrayList<Perro> perro = new ArrayList();
		int numPerro;
		boolean continuar=true;
		while(continuar == true) {
			char afirmacion;
			Perro p = tool.crearPerro();
			perro.add(p);
			System.out.println("Desea agregar otro perro? Y/N");
			afirmacion = leer.next().charAt(0);
			afirmacion = Character.toUpperCase(afirmacion);
			if(afirmacion == 'N') {
				continuar = false;
				System.out.println("\nMostrando razas ingresadas...");
			}else {
				System.out.println("\nContinuemos...");
			}
		}
		System.out.println("\nLas razas de perros ingresadas son:");
		for (Perro raza : perro) {
			System.out.print(raza.getRaza()+", ");
		}
		System.out.println("\n\nLos datos de los perros son:");
		for (Perro datos : perro) {
			tool.mostrarDatos(datos);
		}
		System.out.println("De los datos mostrados seleccione un numero de perro");
		numPerro = leer.nextInt();
		Iterator<Perro> recPerro = perro.iterator();
		while(recPerro.hasNext()) {
			if(recPerro.next().getNumPerro()==numPerro) {
				recPerro.remove();
				System.out.println("\nPERRO ELIMINADO!");
				break;
			}else {
				System.out.println("\nNO SE ENCONTRO EL PERRO QUE DESEA ELIMINAR");
			}
		}
		System.out.println("\nLa nueva lista de los perros es:");
		Iterator<Perro> mosPerro = perro.iterator();
		while(mosPerro.hasNext()) {
			tool.mostrarDatos(mosPerro.next());
		}
		//tool.mostrarRaza(p);

	}

}
