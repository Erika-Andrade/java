package com.entidades;

public class Numero {
	private String numeroCarta;
	private int valor;
	//CONSTRUCTOR
	public Numero(String numeroCarta, int valor) {
		this.numeroCarta = numeroCarta;
		this.valor = valor;
	}
	//GETTERS AND SETTERS
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
	//METODS
	public void mostrar() {
		System.out.println(numeroCarta+"-"+valor);
	}
	
}
