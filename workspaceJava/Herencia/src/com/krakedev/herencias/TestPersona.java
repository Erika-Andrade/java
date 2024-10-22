package com.krakedev.herencias;

public class TestPersona {

	public static void main(String[] args) {
		Persona p=new Persona("Ana","1005463638");
		
		System.out.print("hola ");
		System.out.print(p);
		System.out.print(p.toString());
		
		Cuenta c=new Cuenta("1005463638","Olga","20343",270.99);
		System.out.print(c.toString());
	}

}
