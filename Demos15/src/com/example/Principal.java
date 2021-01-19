package com.example;

import com.example.entities.Persona;
import com.example.entities.Profesor;
import com.example.util.Validaciones;

/**
 * Demos del curso
 * 
 * @author Javier
 *
 */
public class Principal {

	/**
	 * Método principal
	 * 
	 * @param args Argumentos de la linea de comandos
	 */
	public static void main(String... args) {
		// TODO Auto-generated method stub

	}
	
	public void clases() {
		try {
			Persona p = new Profesor();
			Profesor profesor = new Profesor();
			
			var d = profesor.getDrireccion();
			Profesor.Asignatura a;
			var v = new Validaciones();
			p = new Persona(0, "xxx", null) {
				
				@Override
				public String saluda() {
					//v.
					return null;
				}
			};
			// profesor.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Demo de la documentacion
	 * 
	 * @param i   Un parametro
	 * @param cad Otro parametro
	 * @return Cadena vacia
	 * @throws Exception Por lo que sea
	 */
	public String doc( String cad, int id) throws Exception {
		return "";
	}
	public String doc(int id, String cad) throws Exception {
		// if(010 == 10)
		var bit = 0b0110_0001_1010;
		String corta = "Esto ocupa" + " dos lineas";
		int i = -65333333;
		i += 4; // i = i + 4;
		i = 5;
		id = i++;
		Object o = new Principal();
		// ...
		if (o instanceof Principal) {
			Principal p = (Principal) o;
			p.suma(4);
			p.suma((float)3, (int)4);
			p.algo(0);
			p.algo(0, 3);
			p.una(0);
		}
		switch (i) {
		case 1:
		case 2:
		case 3:
			// ...
			break;
		case 4:
		case 5:
			// ...
			break;
		default:
			// ...
			break;
		}
		if (cad != null && cad.length() > 0)
			cad = "cortocircuito";
		char c = 64;
		c = (char) i;
		c = '\64';
		c = (char) (c + ((char) 4));
		var b = true;
		var s = b ? bit : corta;
		// s.
		return "";
	}

	Integer rslt = 0;
	Integer otra = 0;
	public int concurrente(int[] id, String cad) {
		synchronized (rslt) {
			rslt = 0;
			for (int i : id) {
				rslt += i;
			}
			//return rslt;
		}
		synchronized (otra) {
//			rslt = 0;
//			for (int i : id) {
//				rslt += i;
//			}
			return rslt;
		}
	}
	void algo(int a, int b) {

	}
	void algo(int a, int... lista) {
		
	}
	void una(int a, int... lista) {
		
	}

	void suma(int a) {
		
	}
	
	void suma(int a, int b) {
		
	}
	void suma(float a, float b) {
		
	}
}
