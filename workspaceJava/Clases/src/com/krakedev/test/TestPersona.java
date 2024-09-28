package com.krakedev.test;

import com.krakedev.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p;//1.-Declaro una variable called p tipo Persona
		//Persona p2=new Persona();
		p=new Persona();
		p.setNombre("Holanda");
		System.out.println("nombre: "+p.getNombre());
		System.out.println("edad: "+p.getEdad());
		System.out.println("estatura: "+p.getEstatura());
		

	}

}
