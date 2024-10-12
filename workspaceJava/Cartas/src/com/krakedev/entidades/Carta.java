package com.krakedev.entidades;

public class Carta {
	private Numero numero;
	private String palo;
	//constructor
	public Carta(Numero numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	//getters and setters
	public Numero getNumero() {
		return numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setNumero(Numero numero) {
		this.numero = numero;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	//metodo
	public void mostrarInfoCarta() {
		System.out.println(numero+" -"+palo);
	}
}
