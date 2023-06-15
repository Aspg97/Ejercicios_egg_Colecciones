package Ej_03_aumno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Service {

	Scanner leer = new Scanner(System.in);

	public ArrayList<Alumno> crearAlumno() {
		// Variables de creacion de la lista para agregar los alumnos;
		ArrayList<Alumno> alumnos = new ArrayList();
		// Variables de creacion del alumno
		String nombre;
		ArrayList<Integer> notas = new ArrayList();
		char continuar;
		do {
			System.out.println("Ingrese el nombre del alumno");
			nombre = leer.nextLine();
			for(int i = 0; i < 3 ; i++) {
				System.out.println("Ingrse la nota "+(i+1)+" del Sr. "+nombre);
				notas.add(leer.nextInt());
			}
			leer.nextLine();
			Alumno alumno = new Alumno(nombre,notas);
			alumnos.add(alumno);
			System.out.println("Desea ingresar otro alumno? Y/N");
			continuar = leer.next().charAt(0);
			leer.nextLine();
			continuar = Character.toUpperCase(continuar);
		} while (continuar != 'N');
		return alumnos;
	}
	
	
	public void notaFinal (ArrayList<Alumno> alumnos,String nombre) {
		int acu=0;
		boolean esta = false;
		//SOLUCION CON ITERATOR
		// TODO HAY QUE TOMAR EN CUENTA QUE LOS .next(); DENTRO DEL ITERATOR NO SE PUEDEN REPETIR
		//POR TAL MOTIVO SE CREA UNA VARIABALE QUE LA CONTENGA UNA SOLA VEZ.
		Iterator<Alumno> recAlum = alumnos.iterator();
		while(recAlum.hasNext()) {
			Alumno alumno = recAlum.next();
			if(alumno.getNombre().equals(nombre)) {
				System.out.println("La nota final del Sr. "+alumno.getNombre()+" es: ");
				for(Integer nota : alumno.getNotas()) {
					acu+=nota;
				}
				esta=true;
				break;
			}
		}
		
		//SOLUCION CON FOR EACH
		
		/*for(Alumno alumno : alumnos) {
			if(alumno.getNombre().equals(nombre)) {
				for(Integer nota : alumno.getNotas()) {
					acu+=nota;
				}
				esta=true;
				break;
			}
			
		}*/
		if(esta == true) {
			System.out.println((double)acu/3);
		}else {
			System.out.println("El alumno "+nombre+" no se encuentra registrado");
		}
	}
}
