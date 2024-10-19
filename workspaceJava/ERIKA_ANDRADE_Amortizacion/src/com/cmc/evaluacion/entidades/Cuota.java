package com.cmc.evaluacion.entidades;

import com.cmc.evaluacion.servicios.Utilitario;

public class Cuota {
	private int numero;
	private double cuota;
	private double capital;
	private double inicio;
	private double interes;
	private double abonoCapital;
	private double saldo;
	//constructor
	public Cuota(int numero) {
		this.numero = numero;
	}
	
	//getters and setters
	public double getCuota() {
		return cuota;
	}
	
	public double getCapital() {
		return capital;
	}
	public double getInicio() {
		return inicio;
	}
	public double getInteres() {
		return interes;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public void setInicio(double inicio) {
		this.inicio = inicio;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//metodos**********
	public void mostrarPrestamo() {
		cuota=Utilitario.redondear(cuota);
		abonoCapital=Utilitario.redondear(abonoCapital);
		
		System.out.println("1| "+cuota+"|"+capital+" |"+interes+"| "+abonoCapital+"| "+saldo);
	}
	
}
