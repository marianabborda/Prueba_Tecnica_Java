package principal;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad; 
	private ArrayList<Libro> listaLibrosPrestados;
	
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.listaLibrosPrestados = new ArrayList<>();		
	}
	
	public Persona(String nombre, int edad,ArrayList<Libro> listaLibrosPrestados) {
		this.nombre = nombre;
		this.edad = edad;
		this.listaLibrosPrestados = listaLibrosPrestados;
				
	}

	public void tomarPrestadoLibro(Libro libro) {
		
		if(!listaLibrosPrestados.contains(libro)) {
			listaLibrosPrestados.add(libro);
		}
	}
	
	public void devolverLibro(Libro libro) {
		if(listaLibrosPrestados.contains(libro)) {
			listaLibrosPrestados.remove(libro);
		}
	}
	
}
