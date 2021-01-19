package com.example.entities;

import java.util.Optional;

public interface Profesor {
	int getId();
	void setId(int value);
	String getNombre();
	void setNombre(String nombre) throws Exception;
	Optional<String> getApellido();
	void setApellido(String apellido) ;
	double getSalario();
	String saluda();
}
