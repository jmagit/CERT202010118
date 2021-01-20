package com.example.entities;

import java.io.IOError;
import java.util.Optional;

import com.example.util.Autor;
import com.example.util.CursoException;
import com.example.util.Validaciones;

@Autor(nombre = "yo", apellidos = "mismo")
public abstract class Persona implements Grafico{
	@Autor(nombre = "yo")
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
	
	@Autor(nombre = "yo")
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
			throw new CursoException("El nombre debe estar relleno");
		this.nombre = nombre;
	}
	public Optional<String> getApellido() {
		if(apellido == null)
			return Optional.empty();
		return Optional.of(apellido);
	}
	public void setApellido(String apellido) throws CursoException {
		try {
			this.apellido = apellido.toUpperCase();			
		} catch(NullPointerException|IOError ex) {
			// throw new CursoException("El apellido debe estar relleno", ex);
			if(ex instanceof IndexOutOfBoundsException) {
				this.apellido = "algo";
			} else {
				throw ex;
			}
		}
	}
	public abstract String saluda();
}
