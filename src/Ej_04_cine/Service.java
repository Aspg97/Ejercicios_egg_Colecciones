package Ej_04_cine;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Service {
	Scanner leer = new Scanner(System.in);
	public ArrayList<Pelicula> crearListaPeliculas (){
		ArrayList<Pelicula> peliculas = new ArrayList();
		String nombre,director;
		LocalTime duracion;
		int horas,minutos;
		char continuar;
		System.out.println("Creando Pelicula");
		do {
			System.out.println("Ingrese el nombre de la pelicula");
			nombre = leer.nextLine();
			System.out.println("Ingrese el director de la pelicula");
			director= leer.nextLine();
			System.out.println("Ingrese solamente las horas sin tomar en cuenta las minutos que dura la pelicula");
			horas = leer.nextInt();
			System.out.println("Ingrese los minutos adicionales que dura la pelicula");
			minutos = leer.nextInt();
			duracion = LocalTime.of(horas, minutos,0);
			Pelicula pelicula = new Pelicula(nombre,director,duracion);
			peliculas.add(pelicula);
			System.out.println("Desea agregar otra pelicula? Y/N");
			continuar = leer.next().charAt(0);
			leer.nextLine();
			continuar = Character.toUpperCase(continuar);
		}while(continuar != 'N');
		return peliculas;
	}
	public void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
		System.out.println("\nLas peliculas registradas son:");
		Iterator<Pelicula> recorrerPeliculas = peliculas.iterator();
		while(recorrerPeliculas.hasNext()) {
			Pelicula pelicula = recorrerPeliculas.next();
			System.out.println("\nTitulo: "+pelicula.getTitulo()+"\nDirector: "+pelicula.getDirector()+"\nDuracion: "+pelicula.getDuracion());
		}
	}
	public void mostrarPeliculasMayorUnaHora(ArrayList<Pelicula> pelicula) {
		System.out.println("\nLas peliculas con duracion mayor de una hora son:");
		for(Pelicula peli : pelicula) {
			if(peli.getDuracion().getHour()>0) {
				System.out.println("\nTitulo: "+peli.getTitulo()+"\nDirector: "+peli.getDirector()+"\nDuracion: "+peli.getDuracion());
			}
		}
	}

}
