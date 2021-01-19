package com.example.entities;

import java.util.Optional;

import com.example.util.Validaciones;

public abstract class Persona implements Grafico{
	private int id;
	private String nombre, apellido;
	
	
	private class Direccion {
		private int id;
		private String calle;
		
		public void algo() {
			nombre = "";
			id = Persona.this.id;
		}
		
	}
	
	private Direccion direccion;
	
	public Direccion getDrireccion() {
		return direccion;
	}
	
	public Persona(int id, String nombre, String apellido) throws Exception {
		this.id = id;
		setNombre(nombre);
		this.apellido = apellido;
	}
	public int getId() {
		return id;		
	}
	public void setId(int value) {
		id = value;		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) throws Exception {
		if(Validaciones.estaVacia(nombre))
			throw new Exception("El nombre debe estar relleno");
		this.nombre = nombre;
	}
	public Optional<String> getApellido() {
		if(apellido == null)
			return Optional.empty();
		return Optional.of(apellido);
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public abstract String saluda();
}
