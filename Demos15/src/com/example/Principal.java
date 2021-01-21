package com.example;

import java.lang.annotation.Annotation;
import java.util.function.Supplier;

import com.example.entities.Alumno;
import com.example.entities.Elemento;
import com.example.entities.Factura;
import com.example.entities.Genero;
import com.example.entities.Grafico;
import com.example.entities.Otra;
import com.example.entities.Persona;
import com.example.entities.Profesor;
import com.example.entities.ProfesorImp;
import com.example.entities.ProfesorOtro;
import com.example.util.Autor;
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
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String... args) throws Exception {
		int x = 1, y = 2;
		Supplier<Integer> supplier = new Supplier<Integer>() {
			@Override
			public Integer get() {
				return x + y;
			}
		};
		int rslt = supplier.get();
//		Otra a;
//		a.dos();
//		com.example.util.Otra b;
//		b.uno();
		Annotation[] anutaciones = Genero.class.getAnnotations();
		System.out.println(Genero.class.getAnnotation(Autor.class).nombre());

		Principal app = new Principal();
		app.afirmar("", 1, new int[10], 1);
		System.out.println("Fin");
//		var x = new Elemento<ProfesorImp>(new ProfesorImp(0, null, null, 4), "kk");
//		x = new Elemento<ProfesorImp>(null, "kk");
//		x.getKey().setId(0);
		//
//		var a = new Alumno(0, "dd", null);
//		a.setGenero(Enum.valueOf(Genero.class, "MASCULINO"));
//		System.out.println(a.getGenero());
//		var c = a.getGenero().getValue();
//		a.setGenero(Genero.getEnum('F'));
//		System.out.println(a.getGenero());

//		var p = new ProfesorImp(0, "xxx", null, 4);
//		p.getNombreCompleto();
//		Profesor.despedir(p);
		
//		String s = null;
//		if(p.getApellido().isPresent())
//		    s = p.getApellido().get();
//		System.out.println(p.getApellido().orElse("vacio"));
//		p.setApellido(s.toUpperCase());
//		System.out.println(p.getApellido().orElse("algo"));
		
//		var clase = Class.forName("com.example.entities.Factura");
//		Object object = clase.newInstance();
//		var clase = Elemento.class;
//		var provincia = new Elemento<Integer>(1, "Madrid");
//		System.out.println(provincia instanceof Elemento);
//		var lst = clase.getMethods()[2];
//		clase.getMethods()[2].invoke(provincia, "cadena");
////		clase.getMethod("setKey", Object.class).invoke(provincia, 'A');
//		System.out.println(provincia.getKey().getClass().getName());
//		System.out.println(clase.getMethod("getKey", null).getReturnType().getName());
	}

	@Deprecated
	public void afirmar(String cad, int divisor, int[] tabla, int indice) {
		assert cad != null;
		assert divisor > 0 : "debe ser positivo";
		assert tabla != null;
		assert 0 <= indice && indice <= tabla.length;
		// ...
		assert tabla != null;
	}
	public void genericos() throws Exception {
		var p = new ProfesorImp(0, null, null, 4);
		var provincia = new Elemento<Integer>(1, "Madrid");
		provincia.setKey(28);
		var genero = new Elemento<>('M', "Masculino");
		genero.setKey('m');
		var x = new Elemento<ProfesorImp>(new ProfesorImp(0, null, null, 4), "kk");
		var f = new Factura();
		var rslt = f.get(Alumno.class); //f.facturar(new Alumno(0, null, null));
		//rslt.
	}
	public void clases() {
		try {
			Persona p = new ProfesorImp();
			Profesor profesor = new ProfesorOtro();
			boolean cond = true;
			//var d = profesor.getDrireccion();
			ProfesorImp.Asignatura a;
			p = new Persona(0, "xxx", null) {
				
				@Override
				public String saluda() {
					return null;
				}

				@Override
				public void pintate() {
					// TODO Auto-generated method stub
					
				}
			};
			// profesor.
			Object object = null;
			Grafico v;
			// ...
			if(cond) {
				v = p;
			} else {
				v = new Factura();
			}
			// ...
			v.pintate();
			
			if(object instanceof Grafico) {
				((Grafico)object).pintate();
			}
			
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
