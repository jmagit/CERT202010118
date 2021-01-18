package com.example;

/**
 * Demos del curso
 * @author Javier
 *
 */
public class Principal {

	/**
	 * Método principal
	 * @param args Argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Demo de la documentacion
	 * @param i Un parametro
	 * @param cad Otro parametro
	 * @return Cadena vacia
	 * @throws Exception Por lo que sea
	 */
	public String doc(int id, String cad) throws Exception {
		// if(010 == 10)
		var bit = 0b0110_0001_1010;
		String corta = "Esto ocupa" +
				" dos lineas";
		int i = -65333333;
		char c = 64;
		c = (char)i;
		c = '\64';
		c = (char)( c + ((char)4));
		var b = true;
		var s = b ? bit : corta;
		// s.
		return "";
	}
}
