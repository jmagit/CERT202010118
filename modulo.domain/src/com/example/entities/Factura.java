package com.example.entities;

public class Factura implements Grafico {
	private double total;
	private Linea[] lineas;
	
	public class Linea {
		
	}

	@Override
	public void pintate() {
		System.out.println("Soy una factura");
	}
	
	public <T> T facturar(T pardillo) {
		return pardillo;
	}
	public <T> T get(Class<?> elemento) {
		return (T)null;
	}
}
