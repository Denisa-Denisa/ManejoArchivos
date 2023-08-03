package ejercicio1;

import java.util.List;

public class ImprimirLibros {

	public static void imprimir(List<Libro> libros) {
		System.out.println("\nLibros añadidos :\n ");
		System.out.println("ISBN\t\t\tTITULO\t\t\tAUTOR\t\t\tPAGINAS");
		for (Libro libro : libros) {
			System.out.println(libro.getIsbn() + "\t" + "\t" + libro.getTitulo() + "\t" + "\t" + "\t" + libro.getAutor()
					+ "\t" + "\t" + "\t" + libro.getPaginas());
		}
	}

}
