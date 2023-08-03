package ejercicio2;

import java.math.BigDecimal;

public class Revista extends Publicacion {
	private String tema;
	private BigDecimal iva;

	public Revista(String nombre, String editorial, int numPaginas, String tema, BigDecimal iva) {
		super(nombre, editorial, numPaginas);
		this.tema = tema;
		this.iva = iva;
	}

	public String getTema() {
		return tema;
	}

	public BigDecimal getIVA() {
		return iva;
	}

	public BigDecimal calcularPrecioTotal() {
		BigDecimal precioTotal = precioBase.multiply(BigDecimal.valueOf(3));
		precioTotal = precioTotal.add(precioTotal.multiply(iva));
		precioTotal = precioTotal.add(BigDecimal.valueOf(0.02).multiply(BigDecimal.valueOf(numPaginas)));
		return precioTotal;
	}

	public String toString() {
		return super.toString() + " - Tema: " + tema;
	}
}