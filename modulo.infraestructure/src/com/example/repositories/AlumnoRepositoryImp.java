package com.example.repositories;

import com.example.contracts.AlumnoRepository;
import com.example.db.UnitOfWork;
import com.example.entities.Alumno;
import com.example.util.Autor;

@Autor(nombre = "Javier")
public class AlumnoRepositoryImp implements AlumnoRepository {
	UnitOfWork db = new UnitOfWork();
	
	public AlumnoRepositoryImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Alumno item) {
		db.save("Guardo " + item.getId());
	}
}
