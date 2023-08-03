package ejercicio3;

import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 */

		TablaPeriodica tablaPeriodica = new TablaPeriodica();

		tablaPeriodica.cargarTablaPeriodica("tabla_periodica.dat");

		Elemento elemento1 = new Elemento(1, 1.008, "Hidrogeno", "H", "No Metal", "Gas", Arrays.asList(1), 1, 1);
		Elemento elemento2 = new Elemento(22, 47.867, "Titanio", "Ti", "Metal", "Sólido", Arrays.asList(4, 3), 4, 4);
		Elemento elemento3 = new Elemento(13, 26.982, "Aluminio", "Al", "Metal", "Sólido", Arrays.asList(3), 3, 13);
		Elemento elemento4 = new Elemento(64, 157.25, "Gadolinio", "Gd", "Metal", "Sólido", Arrays.asList(3), 6, 4);
		Elemento elemento5 = new Elemento(108, 277.15, "Hasio", "Hs", "Metal", "Desconocido", Arrays.asList(8, 6, 4, 2),
				7, 8);

		tablaPeriodica.agregarElemento(elemento1);
		tablaPeriodica.agregarElemento(elemento2);
		tablaPeriodica.agregarElemento(elemento3);
		tablaPeriodica.agregarElemento(elemento4);
		tablaPeriodica.agregarElemento(elemento5);

		tablaPeriodica.eliminarElemento(1);

		int cantidadElementos = tablaPeriodica.obtenerCantidadElementos();
		System.out.println("Cantidad de elementos en la tabla periodica: " + cantidadElementos);

		Elemento elemento64 = tablaPeriodica.obtenerElemento(64);
		System.out.println("Informacion del elemento 64: \n");
		System.out.println(elemento64);

		List<Elemento> elementosGrupo12 = tablaPeriodica.obtenerElementosGrupo(12);
		System.out.println("Elementos del grupo 12:");
		for (Elemento elemento : elementosGrupo12) {
			System.out.println(elemento);
		}

		tablaPeriodica.guardarTablaPeriodica("tabla_periodica.dat");
	}

}
