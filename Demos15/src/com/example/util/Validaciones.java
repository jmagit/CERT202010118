package com.example.util;

public final class Validaciones {
	public static boolean estaVacia(String cad) {
		return cad == null || cad.isBlank();
	}
	public static boolean estaRellena(String cad) {
		return !estaVacia(cad);
	}
	}
