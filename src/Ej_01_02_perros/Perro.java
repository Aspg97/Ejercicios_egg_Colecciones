package Ej_01_02_perros;

import java.util.Comparator;

public class Perro {
	private String raza,nombre;
	private int numPerro;

	public Perro(String raza) {
		this.nombre = "Perro sin nombre";
		this.raza = raza;
	}

	public int getNumPerro() {
		return numPerro;
	}

	public void setNumPerro(int numPerro) {
		this.numPerro = numPerro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public static Comparator<Perro> compararRaza = new Comparator<Perro>() {
		@Override
		public int compare(Perro p1, Perro p2) {
			return p1.getRaza().compareTo(p2.getRaza());
		}
	};
}
