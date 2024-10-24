package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("inicio");
		String a="xx";
		try {
			a.substring(3);
			System.out.println("Fin");
		}catch(Exception ex) {
			System.out.println("dentro del chatcc");
		}finally {
			System.out.println("ingresa finally");
		}
		System.out.println("Fuera");

	}

}
