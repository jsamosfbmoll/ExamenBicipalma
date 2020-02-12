package edu.elsmancs.estacion;

public class Estacion {
	
	private final int id;
	private final String direccion;
	private final int numAnclajes;
	private final Integer[] anclajes;
	
	public Estacion(int id, String direccion, int numAnclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numAnclajes = numAnclajes;
		this.anclajes = new Integer[numAnclajes];
	}

}
