package com.example.entities;

public class Alumno extends Persona {
	Profesor.Asignatura[] asignaturas;

	public Alumno(int id, String nombre, String apellido) throws Exception {
		super(id, nombre, apellido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String saluda() {
		// TODO Auto-generated method stub
		return null;
	}

}
