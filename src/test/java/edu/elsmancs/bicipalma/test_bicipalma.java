package edu.elsmancs.bicipalma;

import estacion.Estacion;
//import bicicleta.Bicicleta;
//import tarjetaUsuario.TarjetaUsuario;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test_bicipalma {
	
	Estacion estacion;

	@Before
	public void estaciones() {
		estacion = new Estacion(4, "Alcudia", 4);
	}

	@Test
	public void test_crear_estacion() {
		Estacion estacion = new Estacion(3, "Palma", 10);
	}
	
	@Test
	public void test_consultar_estacion() {
		estacion.consultarEstacion();
	}
	
	@Test
	public void test_anclajes_libres() {
		assertEquals(estacion.anclajesLibres(), 4, 0);
	}
	
	@Test
	public void crearBicicleta() {
		Bicicleta bici = new Bicicleta(1);
	}
	
	@Test
	public void anclarBicicleta() {
		Bicicleta bici = new Bicicletya(2);
		estacion.anckarBicicleta(bici);
	}
	
	@Test
	public void consultarAnclajes() {
		estacion.consultarAnclajes();
	}
	
	@Test
	public void crearTarjetaUsuario() {
		TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);
	}
	
	@Test
	public void leerTarjetaUsuario() {
		TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);
		estacion.leerTarjetaUsuario(tarjetaUsuario);
	}
	
	@Test
	public void retirarBicicleta() {
		TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);
		estacion.retirarBicicleta(tarjetaUsuario);
	}

}
