package Ej_03_aumno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Service tool = new Service();
		ArrayList<Alumno> listaAlumnos = tool.crearAlumno();
		System.out.println("\nIngrese el nombre del alumno que desea calular la nota final");
		tool.notaFinal(listaAlumnos, leer.nextLine());
	}

}
