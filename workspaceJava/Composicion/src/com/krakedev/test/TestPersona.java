package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;


public class TestPersona {

	public static void main(String[] args) {
		Persona p1=new Persona();
		p1.setNombre("Ana");
		p1.setApellido("Mendez");
		
		Direccion dir=new Direccion();
		dir.setCallePrincipal("Av Mariano Acosta");
		dir.setCalleSecundaria("la que cruza");
		dir.setNumero("1-13");
		
		p1.setDireccion(dir);
		
		String nombre=p1.getNombre();
		Direccion d1=p1.getDireccion();
		System.out.println(nombre);
		//d1 está null y trato de invocar a un método con esa variable
		System.out.println(d1.getCallePrincipal());
		//null.algunMetodo--NullPointerException
		p1.imprimir();
		Persona p2=new Persona();
		Direccion d2=new Direccion("Av shyris","EloyAlfaro","S/N");
		p2.setDireccion(d2);
		p2.setNombre("Maria");
		p2.imprimir();
		
		Persona p3=new Persona();
		p3.setDireccion(new Direccion("xx","yy","123"));
		p3.imprimir();
		
	}

}
