package principal;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Libro> listaLibros;
	private ArrayList<Libro> listaLibrosPrestados;
	
	public Biblioteca() {
		listaLibros = new ArrayList<>();
		listaLibrosPrestados = new ArrayList<>();
	}
	
	
	
	public void agregarLibro(Libro libro) {
		if(!listaLibros.contains(libro)) {
		listaLibros.add(libro);
        }
	}
	
	public void prestarLibro(Libro  libro) {
		if(listaLibros.contains(libro)) {
		listaLibros.remove(libro);
		listaLibrosPrestados.add(libro);		
	    }
	}	

    public void devolverLibro(Libro libro) {
	    if(!listaLibrosPrestados.contains(libro)) {
		listaLibrosPrestados.remove(libro);
	    listaLibros.add(libro);
	    }
    }

    
    public String mostrarLibros() {
    	return listaLibros.toString();
    }
    
  
    public String mostrarLibrosPrestados() {
	    return listaLibrosPrestados.toString();
	    }
    }
    
    
    
    
    
    
