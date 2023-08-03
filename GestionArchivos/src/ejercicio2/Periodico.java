package ejercicio2;

import java.math.BigDecimal;

public class Periodico extends Publicacion {

	private String paisOrigen;
	private BigDecimal iva;

	public Periodico(String nombre, String editorial, int numPaginas, String paisOrigen, BigDecimal iva) {
		super(nombre, editorial, numPaginas);
		this.paisOrigen = paisOrigen;
		this.iva = iva;
	}

	public String

			getPaisOrigen() {
		return paisOrigen;
	}

	public BigDecimal getIVA() {
		return iva;
	}

	public BigDecimal calcularPrecioTotal() {
		BigDecimal precioTotal = precioBase.multiply(BigDecimal.valueOf(2));
		precioTotal = precioTotal.add(precioTotal.multiply(iva));
		return precioTotal;
	}

	public String toString() {
		return super.toString() + " - Pais de origen: " + paisOrigen;
	}
}