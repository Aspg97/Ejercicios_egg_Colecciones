package Ej_01_02_perros;

import java.util.Scanner;

public class Perro_service {
	Scanner leer = new Scanner(System.in);
	private int numPerro = 0;
	public Perro crearPerro() {
		char ingresarNombre;
		String nombre;
		System.out.println("Ingrese la raza del perro");
		Perro perro = new Perro(leer.nextLine());
		System.out.println("Desea ingresar un nombre? Y/N");
		ingresarNombre = leer.next().charAt(0);
		leer.nextLine();
		ingresarNombre = Character.toUpperCase(ingresarNombre);
		if(ingresarNombre == 'Y') {
			System.out.println("Ingrese un nombre");
			nombre = leer.nextLine();
			perro.setNombre(nombre);
		}
		this.numPerro = this.numPerro+1;
		perro.setNumPerro(this.numPerro);
		return perro;
	}
	public void mostrarRaza(Perro perro) {
		System.out.println(perro.getRaza());
	}
	public void mostrarDatos(Perro perro) {
		System.out.println("\nNo. Perro : "+perro.getNumPerro()+"\nNombre: "+perro.getNombre()+"\nRaza: "+perro.getRaza()+"\n");
	}
}
