package com.krakedev.herencias;

public class Cuenta extends Persona{
	private String numero_cuenta;
	private double saldo;
	public Cuenta(String cedula,String nombre,String numero_cuenta, double saldo) {
		super(nombre,cedula);
		this.numero_cuenta = numero_cuenta;
		this.saldo = saldo;
	}
	public String getNumero_cuenta() {
		return numero_cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return " \n Cuenta numero de cuenta=" + numero_cuenta + ", saldo=" + saldo;
	}
	
	
}
