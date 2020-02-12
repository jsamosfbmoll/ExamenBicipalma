package estacion;

import bicicleta.Bicicleta;

public class Estacion {
	
	private final int id;
	private final String direccion;
	private final int numAnclajes;
	private final Bicicleta[] anclajes;
	
	public Estacion(int id, String direccion, int numAnclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numAnclajes = numAnclajes;
		this.anclajes = new Bicicleta[numAnclajes];
	}
	
	public void consultarEstacion() {
		String text = "id: " + this.id
				+ "\ndireccion: " + this.direccion
				+ "\nnumeroAnclajes: " + this.numAnclajes;
		System.out.println(text);
	}
	
	public int anclajesLibres() {
		int anclajesLibres = 0;
		for (Bicicleta anclaje : this.anclajes) {
			if (anclaje == null) {
				anclajesLibres += 1;
			}
		}
		return anclajesLibres;
	}
	
	private void mostrarAnclaje(Bicicleta bicicleta, int numAnclaje) {
		System.out.println("Bicicleta: " + bicicleta + " anclada en el anclaje: " + (numAnclaje + 1));
	}
	
	public void anclarBicicleta(Bicicleta bicicleta) {
		for (int posicionAnclaje = 0; posicionAnclaje < this.numAnclajes; posicionAnclaje++) {
			if (this.anclajes[posicionAnclaje] == null) {
				this.anclajes[posicionAnclaje] = bicicleta;
				this.mostrarAnclaje(bicicleta, posicionAnclaje);
				break;
			}
		}
	}
	
	public void consultarAnclajes() {
		String texto = "";
		for (int i = 0; i < this.numAnclajes; i++) {
			if (this.anclajes[i] == null) {
				texto += "Anclaje " + (i + 1) + " libre\n";
			} else {
				texto += "Anclaje " + (i + 1) + " " + this.anclajes[i] + "\n";
			}
		}
		System.out.println(texto);
	}

}
