package com.example.contracts;

import com.example.contracts.AlumnoRepository;
import com.example.entities.Alumno;
import com.example.util.Autor;

@Autor(nombre = "Javier")
public class AlumnoRepositoryMock implements AlumnoRepository {
	public AlumnoRepositoryMock() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Alumno item) {
		System.out.println("Esto es un doble de prueba.");
	}
}
