package com.example.entities;

import java.util.Optional;

import com.example.util.Autor;

@Autor(nombre = "yo", apellidos = "mismo")
public interface Profesor {
	@Autor(nombre = "yo", apellidos = "mismo")
	int getId();
	void setId(int value);
	String getNombre();
	void setNombre(String nombre) throws Exception;
	Optional<String> getApellido();
	void setApellido(String apellido) ;
	double getSalario();
	void setSalario(double value);
	String saluda();
	
	default String getNombreCompleto() {
		return calcula();
	}
	private String calcula() {
		return getNombre() + " " + getApellido();
	}
	
	static void despedir(Profesor item) {
		item.setSalario(0);
	}
}
