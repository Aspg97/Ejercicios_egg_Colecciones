package Ej_01_02_perros;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_perro {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Perro_service tool = new Perro_service();
		ArrayList<Perro> perro = new ArrayList();
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
		
		//tool.mostrarRaza(p);

	}

}
