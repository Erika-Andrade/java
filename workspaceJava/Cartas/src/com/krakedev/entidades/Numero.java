package com.krakedev.entidades;

public class Numero {
	private String numeroCarta;
	private int valor;
	//constructor
	public Numero(String numeroCarta, int valor) {
		this.numeroCarta = numeroCarta;
		this.valor = valor;
	}
	//getters and setters
	public String getNumeroCarta() {
		return numeroCarta;
	}
	public int getValor() {
		return valor;
	}
	public void setNumeroCarta(String numeroCarta) {
		this.numeroCarta = numeroCarta;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	//metodos
	public void mostrarInfoN() {
		System.out.println(numeroCarta+" -"+valor);
	}
}
