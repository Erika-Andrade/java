package com.krakedev.herencias;

public class TestPersona {

	public static void main(String[] args) {
		Persona p=new Persona("Ana","1005463638");
		//video
		System.out.print("hola ");
		System.out.print(p);
		System.out.print(p.toString());
		//reto
		Cuenta c=new Cuenta("1005463638","Ana","20343",270.99);
		System.out.print(c.toString());
	}

}
