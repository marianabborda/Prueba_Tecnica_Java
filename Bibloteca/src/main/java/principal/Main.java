package principal;

public class Main {
	public static void main(String[] ags) {
		Libro libro1 = new Libro("El corazón de la piedra", "José María García López", "2013", "Novela",560);
		Libro libro2 = new Libro("Tómas Luis de Victoria", "Antonio Gessa Loaysa", "1956", "Temas Españoles",29);
		Libro libro3 = new Libro("Los tres mosqueteros ", "Alexandre Dumas", "1844", "Novela",880);
		
	
	Biblioteca biblio = new Biblioteca();	
	biblio.agregarLibro(libro1);	
	biblio.agregarLibro(libro2);
	biblio.agregarLibro(libro3);
		
		
	Persona pers = new Persona("Juan", 32);	
	
	pers.tomarPrestadoLibro(libro1);
	biblio.prestarLibro(libro1);
		
	System.out.println("Libros");
	System.out.println(biblio.mostrarLibros());
	System.out.println("Libros Prestados");
	System.out.println(biblio.mostrarLibrosPrestados());
			
	
  }
}