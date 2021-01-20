package com.example.entities;

public class Alumno extends Persona {
	ProfesorImp.Asignatura[] asignaturas;

	private Genero genero = Genero.DESCONOCIDO;
	
	public Alumno(int id, String nombre, String apellido) throws Exception {
		super(id, nombre, apellido);
		// TODO Auto-generated constructor stub
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String saluda() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void pintate() {
		System.out.println("Soy el alumno " + getNombre());
	}

}
