package Ej_04_cine;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Service tool = new Service();
		ArrayList<Pelicula> p1 = tool.crearListaPeliculas();
		tool.mostrarPeliculas(p1);
		tool.mostrarPeliculasMayorUnaHora(p1);
		System.out.println("\n**** Ordenado por duracion ****");
		p1.sort(Pelicula.ordenarPorDuracion);
		for(Pelicula peli:p1) {
			System.out.println("\nTitulo: "+peli.getTitulo()+"\nDirector: "+peli.getDirector()+"\nDuracion: "+peli.getDuracion());
		}
		System.out.println("\n**** Ordenado por titulo ****");
		p1.sort(Pelicula.ordenarPorTitulo);
		for(Pelicula peli:p1) {
			System.out.println("\nTitulo: "+peli.getTitulo()+"\nDirector: "+peli.getDirector()+"\nDuracion: "+peli.getDuracion());
		}
		System.out.println("\n**** Ordenado por director ****");
		p1.sort(Pelicula.ordenarPorDirector);
		for(Pelicula peli:p1) {
			System.out.println("\nTitulo: "+peli.getTitulo()+"\nDirector: "+peli.getDirector()+"\nDuracion: "+peli.getDuracion());
		}
	}

}
