package ejercicio1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libreria {

	private List<Libro> libros;

	public Libreria() {
		libros = new ArrayList<>();
	}

	public void añadirLibro() throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce los datos del libro: \n");

		System.out.print("ISBN: ");
		String isbn = scanner.nextLine();
		if (isbn.length() != 13) {
			throw new IOException("El ISBN debe tener 13 digitos.");
		}

		System.out.print("Titulo: ");
		String titulo = scanner.nextLine();
		if (titulo.isEmpty() || titulo.isBlank()) {
			throw new IOException("El titulo no puede estar en blanco.");
		}

		System.out.print("Autor: ");
		String autor = scanner.nextLine();

		if (autor.isEmpty() || autor.isBlank()) {
			throw new IOException("El autor no puede estar en blanco.");
		}

		System.out.print("Numero de paginas: ");
		int paginas = Integer.parseInt(scanner.nextLine());

		if (paginas <= 30) {
			throw new IOException("El numero de paginas debe ser mayor a 30.");

		}

		Libro libro = new Libro(isbn, titulo, autor, paginas);
		libros.add(libro);
	}

	public List<Libro> getLibros() {
		return libros;
	}

}
