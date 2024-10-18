package com.cmc.evaluacion.entidades;

public class Prestamo {
	private double monto;
	private double interes;
	private int plazo;
	//constructor
	public Prestamo(double monto, double interes, int plazo) {
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
	}
	//getter and setters
	public double getMonto() {
		return monto;
	}
	public double getInteres() {
		return interes;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	//
}
