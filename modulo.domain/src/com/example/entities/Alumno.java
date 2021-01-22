package com.example.entities;

public class Alumno extends Persona implements Comparable<Alumno> {
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

	private int privado = 0;
	private double[][] notas = new double[5][2];
	@Override
	public Object clone() throws CloneNotSupportedException {
		try {
			var copia = new Alumno(getId(), getNombre(), getNombre());
			copia.notas = notas;
			return copia;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + getId();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Alumno))
			return false;
		return this.getId() == ((Alumno) obj).getId();
	}

	@Override
	public int compareTo(Alumno o) {
		if (o == null)
			return 1;
		if(equals(o))
			return 0;
		else 
			return getId() - o.getId();
	}
	public int comparePorNombre(Alumno o) {
		return getNombre().compareTo(o.getNombre());
	}
	
	public void op1() {
		a();
		b();
		c();
		d();
	}

	public void fuera(Alumno o) {
		o.a().b().c().d();
		o.a().d();
		o.c().b().a();
	}
	public Alumno a() {
		return this;
	}
	public Alumno b() {
		return this;
	}
	public Alumno c() {
		return this;
	}
	public Alumno d() {
		return this;
	}

	@Override
	public String toString() {
		return "Alumno [" + getId() + " " + getNombre() + (getApellido().isPresent() ? " " + getApellido().get() : "" ) +"]";
	}
	
	
}
