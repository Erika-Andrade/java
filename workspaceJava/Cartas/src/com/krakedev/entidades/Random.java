package com.krakedev.entidades;

public class Random {
	public static int obtenerPosicion() {
		double numDec=Math.random();
		int numeInt=(int) (numDec*52);
		return numeInt;
	}
}
