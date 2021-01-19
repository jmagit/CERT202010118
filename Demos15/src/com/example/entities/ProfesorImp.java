package com.example.entities;

public class ProfesorImp extends Persona implements Profesor {
	public static class Asignatura {
		
	}
	private double salario;
	
	public ProfesorImp(int id, String nombre, String apellido, double salario) throws Exception {
		super(id, nombre, apellido);
		this.salario = salario;
	}
	public ProfesorImp() throws Exception {
		this(0, null, "", 0.0);
	}
	public double getSalario() {
		return salario;
	}
	
	public void setId(int value) {
		value *= 2;
		super.setId(value);
		// ...
	}

	@Override
	public String saluda() {
		return null;
	}
	
	void compara(Persona p) {
		
	}
	@Override
	public void pintate() {
		System.out.println("Soy el profesor " + getNombre());
	}
	
}
