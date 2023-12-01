package principal;

import java.util.Objects;

public class Libro {
	private String titulo; 
	private String autor;
	private String anioPublicación;
	private String genero;
	private int numPaginas;
	private boolean estado;
	
	public Libro(String titulo, String autor, String anioPublicación, String genero, int numPaginas, boolean estado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicación = anioPublicación;
		this.genero = genero;
		this.numPaginas = numPaginas;
		this.estado = estado;
	}
	
	
	
	
	public Libro(String titulo, String autor, String anioPublicación, String genero, int numPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicación = anioPublicación;
		this.genero = genero;
		this.numPaginas = numPaginas;
		this.estado = true;
	}
	
	
	
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAnioPublicación() {
		return anioPublicación;
	}

	public void setAnioPublicación(String anioPublicación) {
		this.anioPublicación = anioPublicación;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}




	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anioPublicación=" + anioPublicación + ", genero="
				+ genero + ", numPaginas=" + numPaginas + ", estado=" + estado + "]";
	}





	
	
	
	
	
	
	
	
	
	
	
	
}
