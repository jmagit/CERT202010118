package com.example.entities;

public interface Profesor {
	int getId();
	void setId(int value);
	String getNombre();
	void setNombre(String nombre) throws Exception;
	String getApellido();
	void setApellido(String apellido) ;
	double getSalario();
	String saluda();
}
