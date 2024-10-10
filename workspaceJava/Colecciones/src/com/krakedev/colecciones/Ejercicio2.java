package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas;
		personas=new ArrayList<Persona>();
		
		personas.add(new Persona("Alejandra","Pizarnik"));
		personas.add(new Persona("Idea","Vilariño"));
		personas.add(new Persona("Silvia","Path"));

		Persona elementoPersona;
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			System.out.println(elementoPersona.getNombre()+" "+elementoPersona.getApellido());
		}
	}

}
