package com.krakedev.estaticos;

public class Calculos {
	private final double IVA=12;
	//final hace que no se pueda cambiar el valor
	public double calcularIva(double monto) {
		return monto*IVA/100;
	}
}
