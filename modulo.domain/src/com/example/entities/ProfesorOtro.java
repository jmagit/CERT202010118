package com.example.entities;

import java.util.Optional;

public class ProfesorOtro extends Otra implements Profesor {

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setId(int value) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNombre(String nombre) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<String> getApellido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setApellido(String apellido) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setSalario(double value) {
	}

	@Override
	public String saluda() {
		// TODO Auto-generated method stub
		return null;
	}
}
