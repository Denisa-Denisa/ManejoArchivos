package ejercicio2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) {

		List<Publicacion> publicaciones = new ArrayList<>();

		publicaciones.add(new Periodico("El mundo", "Editorial España", 30, "España", new BigDecimal("0.18")));

		publicaciones.add(
				new Periodico("The land", "Editorial International", 40, "Estados Unidos", new BigDecimal("0.21")));

		publicaciones.add(new Revista("Naturaleza", "Naturaleza pura", 50, "Ciencia",
				new BigDecimal("0.07").add(new BigDecimal("0.01"))));

		publicaciones.add(new Revista("Las galaxias", "Tecnologia avanzada", 40, "Ocio",
				new BigDecimal("0.15").add(new BigDecimal("0.02"))));

		for (Publicacion publicacion : publicaciones) {
			System.out.println(publicacion.getNombre() + " --> Precio Total: " + publicacion.calcularPrecioTotal());
		}

		Publicacion.guardarPublicaciones(publicaciones, "publicaciones.txt");

		List<Publicacion> publicacionesCargadas = Publicacion.cargarPublicaciones("publicaciones.txt");

		System.out.println("\nPublicaciones cargadas desde el archivo:");
		for (Publicacion publicacion : publicacionesCargadas) {
			System.out.println(publicacion.getNombre() + " - Precio Total: " + publicacion.calcularPrecioTotal());
		}
	}
}