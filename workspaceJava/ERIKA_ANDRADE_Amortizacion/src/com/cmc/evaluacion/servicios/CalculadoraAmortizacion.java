package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double co=prestamo.getMonto();
		double i=((prestamo.getInteres())/12);
		i/=100;
		int plazo=prestamo.getPlazo();
		double cuota=(co*i)/(1-(Math.pow(1+i,-plazo)));
		
		return cuota;
	}
	
}
