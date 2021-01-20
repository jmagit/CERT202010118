package com.example.util;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.example.entities.Persona;

public class Delegados {

	public Delegados() {
	}

	@FunctionalInterface
	public interface Calcular {
	    int operacion (int x,int y);
	}

	public int suma(int a, int b) {
		return a + b;
	}
	
	Calcular operacion() {
		return (a, b) -> a * b;
	}
	
	Optional<Persona> buscar(Persona[] t, Predicate<Persona> where) {
		for(var p: t) {
			if(where.test(p))
				Optional.of(p);
		}
		return Optional.empty();
	}
	void otro() {
		Calcular calc = new Calcular() {			
			@Override
			public int operacion(int x, int y) {
				return x - y;
			}
		};
		Persona[] lst = new Persona[10];
		
		var pp = buscar(lst, item -> item.getNombre().startsWith("P"));
		pp = buscar(lst, item -> item.getNombre().startsWith("P") && item.getApellido() != null || item.getId() == 0);
		calc = (o1, o2) -> o1 - o2;
		calc = this::suma;
		String ss = "kk";
		String s = ss = "";
		if(s == "") return;
		
		Consumer<String> fn = item -> item.toLowerCase();
		fn = String::toLowerCase;
		
		fn.accept("");
		Function<String, Boolean> function = item -> { 
			// ...
			return item != null;
			};
			function.apply("");
		// ...
		int[] t = {1 ,2,3,4};
		// ...
		int rslt = 0;
		for(var i : t ) {
			rslt = calc.operacion(rslt, i);
		}
		
	}

//	void algo() {
//		short(new String[10], new Comparacion<String>() {
//			@Override
//			public boolean mayor(String a, String b) {
//				return a.compareTo(b) == 1;
//			}
//			@Override
//			public boolean menor(String a, String b) {
//				return a.compareTo(b) == -1;
//			}
//		});
//		short(new String[10], new Comparacion<String>() {
//			@Override
//			public boolean mayor(String a, String b) {
//				return a.compareTo(b) == -1;
//			}
//			@Override
//			public boolean menor(String a, String b) {
//				return a.compareTo(b) == 1;
//			}
//		});
//		short(new String[10], new Comparacion<String>() {
//			@Override
//			public boolean mayor(String a, String b) {
//				return a.toLowerCase().compareTo(b.toLowerCase()) == -1;
//			}
//			@Override
//			public boolean menor(String a, String b) {
//				return a.toLowerCase().compareTo(b.toLowerCase()) == 1;
//			}
//		});
//	
//	}
	enum Tipo {
		ASC, DESC, TEXT
	}
	interface Comparacion<T> {
		boolean mayor(T a, T b);
		boolean menor(T a, T b);
	}
	void sort(String[] tabla, Comparacion comp) {
		int i = 0, j = 0;
		// ...
		if (comp.mayor(tabla[i],tabla[j])) {
			// ...
		} else if (comp.menor(tabla[i],tabla[j])) {
			// ...
		} else {
			// ...
		}
		// ...
	}

//	void sort(String[] tabla, Tipo tipo) {
//		int i, j;
//		// ...
//		switch (tipo) {
//		case Tipo.ASC:
//			if (tabla[i] > tabla[j]) {
//				// ...
//			} else if (tabla[i] < tabla[j]) {
//				// ...
//			} else {
//				// ...
//			}
//			break;
//		case Tipo.DESC:
//			if (tabla[i] < tabla[j]) {
//				// ...
//			} else if (tabla[i] > tabla[j]) {
//				// ...
//			} else {
//				// ...
//			}
//			break;
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + tipo);
//		}
//		// ...
//	}
//	void sortDesc(String[] tabla) {
//		int i, j;
//		// ...
//		if(tabla[i] < tabla[j]) {
//			// ...
//		} else if(tabla[i] > tabla[j]) {
//			// ...
//		} else {
//			// ...
//		}
//		// ...
//	}
}
