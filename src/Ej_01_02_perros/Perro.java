package Ej_01_02_perros;

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
	
}
