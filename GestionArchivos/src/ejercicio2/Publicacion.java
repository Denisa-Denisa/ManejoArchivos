package ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Publicacion {

	protected String nombre;
	protected BigDecimal precioBase;
	protected String editorial;
	protected int numPaginas;

	public Publicacion(String nombre, String editorial, int numPaginas) {
		this.nombre = nombre;
		this.editorial = editorial;
		this.numPaginas = numPaginas;
		this.precioBase = BigDecimal.valueOf(0.50);
	}

	public abstract BigDecimal calcularPrecioTotal();

	public String getNombre() {
		return nombre;
	}

	public String getEditorial() {
		return editorial;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public BigDecimal getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(BigDecimal precioBase) {
		this.precioBase = precioBase;
	}

	public String toString() {
		return nombre + " - Precio: " + calcularPrecioTotal().toString();
	}

	public static void guardarPublicaciones(List<Publicacion> publicaciones, String archivo) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
			for (Publicacion publicacion : publicaciones) {
				writer.write(publicacion.getClass().getSimpleName() + ";");
				writer.write(publicacion.getNombre() + ";");
				writer.write(publicacion.getPrecioBase().toString() + ";");
				writer.write(publicacion.getEditorial() + ";");
				writer.write(publicacion.getNumPaginas() + ";");

				if (publicacion instanceof Periodico) {
					Periodico periodico = (Periodico) publicacion;
					writer.write(periodico.getPaisOrigen() + ";");
					writer.write(periodico.getIVA().toString());
				} else if (publicacion instanceof Revista) {
					Revista revista = (Revista) publicacion;
					writer.write(revista.getTema() + ";");
					writer.write(revista.getIVA().toString());
				}

				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error al guardar las publicaciones: " + e.getMessage());
		}

	}

	public static List<Publicacion> cargarPublicaciones(String archivo) {
		List<Publicacion> publicaciones = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
			String linea;
			while ((linea = reader.readLine()) != null) {
				String[] campos = linea.split(";");
				if (campos.length >= 5) {
					String tipo = campos[0];
					String nombre = campos[1];
					BigDecimal precioBase = new BigDecimal(campos[2]);
					String editorial = campos[3];
					int numPaginas = Integer.parseInt(campos[4]);

					if (tipo.equals("Periodico")) {
						if (campos.length >= 7) {
							String paisOrigen = campos[5];
							BigDecimal iva = new BigDecimal(campos[6]);
							publicaciones.add(new Periodico(nombre, editorial, numPaginas, paisOrigen, iva));
						}
					} else if (tipo.equals("Revista")) {
						if (campos.length >= 7) {
							String tema = campos[5];
							BigDecimal iva = new BigDecimal(campos[6]);
							publicaciones.add(new Revista(nombre, editorial, numPaginas, tema, iva));
						}
					}
				}
			}
		} catch (IOException e) {
			System.out.println("Error al cargar las publicaciones: " + e.getMessage());
		}

		return publicaciones;
	}

}