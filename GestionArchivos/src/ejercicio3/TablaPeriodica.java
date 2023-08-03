package ejercicio3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablaPeriodica {

	private Map<Integer, Elemento> elementos;

	public TablaPeriodica() {
		elementos = new HashMap<>();
	}

	public void agregarElemento(Elemento elemento) {
		elementos.put(elemento.getNumeroAtomico(), elemento);
	}

	public void eliminarElemento(int numeroAtomico) {
		elementos.remove(numeroAtomico);
	}

	public int obtenerCantidadElementos() {
		return elementos.size();
	}

	public Elemento obtenerElemento(int numeroAtomico) {
		return elementos.get(numeroAtomico);
	}

	public List<Elemento> obtenerElementosGrupo(int grupo) {
		List<Elemento> elementosGrupo = new ArrayList<>();
		for (Elemento elemento : elementos.values()) {
			if (elemento.getGrupo() == grupo) {
				elementosGrupo.add(elemento);
			}
		}
		return elementosGrupo;
	}

	public void guardarTablaPeriodica(String nombreArchivo) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
			oos.writeObject(elementos);
			System.out.println("Tabla periodica guardada en el archivo: " + nombreArchivo);
		} catch (IOException e) {
			System.out.println("Error al guardar la tabla periodica: " + e.getMessage());
		}
	}

	public void cargarTablaPeriodica(String nombreArchivo) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
			elementos = (Map<Integer, Elemento>) ois.readObject();
			System.out.println("Tabla periodica cargada desde el archivo: " + nombreArchivo);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error al cargar la tabla periodica: " + e.getMessage());
		}
	}
}
