package com.example.entities;

public enum Genero {
	DESCONOCIDO (null), MASCULINO('M'), FEMENINO('F'), NEUTRO ('N');

	private Character value;
	private Genero(Character value) {
		this.value = value;
	}
	public Character getValue() {
		return value;
	}
	public static Genero getEnum(Character value) {
		if(value == null) return Genero.DESCONOCIDO;
		switch (value) {
		case 'M': return Genero.MASCULINO;
		case 'F': return Genero.FEMENINO;
		case 'N': return Genero.NEUTRO;
		default: return Genero.DESCONOCIDO;
		}
	}
}
