package ejercicio1;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {

		/*
		 * 
		 */

		Libreria libreria = new Libreria();
		boolean añadirLibro = true;

		Scanner scanner = new Scanner(System.in);

		while (añadirLibro) {
			try {
				libreria.añadirLibro();

				System.out.print("¿Deseas añadir otro libro? (Si/No): ");
				String respuesta = scanner.nextLine();

				añadirLibro = respuesta.equalsIgnoreCase("Si") || respuesta.equalsIgnoreCase("Yes");

			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

		ImprimirLibros.imprimir(libreria.getLibros());

	}

}
