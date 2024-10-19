package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Prestamo {
	private double monto;
	private double interes;
	private int plazo;
	private ArrayList<Cuota> cuotas;
	private String cedulaCliente;
	//constructor
	public Prestamo(double monto, double interes, int plazo) {
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
		cuotas=new ArrayList<Cuota>(plazo);
	}
	public Prestamo(double monto, double interes, int plazo,String cedulaCliente) {
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
		cuotas=new ArrayList<Cuota>(plazo);
		this.cedulaCliente=cedulaCliente;
	}
	//getter and setters
	
	
	public double getMonto() {
		return monto;
	}
	public String getCedulaCliente() {
		return cedulaCliente;
	}
	public ArrayList<Cuota> getCuotas() {
		return cuotas;
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
	public void mostrarPrestamo() {
		System.out.print("[monto= "+monto+", interes="+interes+", plazo="+plazo+"]\n");
	}
}
