package ejercicio3;

import java.io.Serializable;
import java.util.List;

public class Elemento implements Serializable {

	private int numeroAtomico;
	private double masaAtomica;
	private String nombre;
	private String simbolo;
	private String tipo;
	private String estado;
	private List<Integer> estadosOxidacion;
	private int periodo;
	private int grupo;

	public Elemento(int numeroAtomico, double masaAtomica, String nombre, String simbolo, String tipo, String estado,
			List<Integer> estadosOxidacion, int periodo, int grupo) {
		this.numeroAtomico = numeroAtomico;
		this.masaAtomica = masaAtomica;
		this.nombre = nombre;
		this.simbolo = simbolo;
		this.tipo = tipo;
		this.estado = estado;
		this.estadosOxidacion = estadosOxidacion;
		this.periodo = periodo;
		this.grupo = grupo;
	}

	public int getNumeroAtomico() {
		return numeroAtomico;
	}

	public void setNumeroAtomico(int numeroAtomico) {
		this.numeroAtomico = numeroAtomico;
	}

	public double getMasaAtomica() {
		return masaAtomica;
	}

	public void setMasaAtomica(double masaAtomica) {
		this.masaAtomica = masaAtomica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Integer> getEstadosOxidacion() {
		return estadosOxidacion;
	}

	public void setEstadosOxidacion(List<Integer> estadosOxidacion) {
		this.estadosOxidacion = estadosOxidacion;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public int getGrupo() {
		return grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

	public String toString() {
		return "Elemento{" + "numeroAtomico=" + numeroAtomico + ", masaAtomica=" + masaAtomica + ", nombre='" + nombre
				+ '\'' + ", simbolo='" + simbolo + '\'' + ", tipo='" + tipo + '\'' + ", estado='" + estado + '\''
				+ ", estadosOxidacion=" + estadosOxidacion + ", periodo=" + periodo + ", grupo=" + grupo + '}';
	}
}
