package com.cmc.evaluacion.servicios;

public class Utilitario {
	public static double redondear(double valor) {
		double numRedondeado=Math.round(valor*100);
		numRedondeado/=100;
		return numRedondeado;
		
	}
}
