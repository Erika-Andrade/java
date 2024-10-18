package com.entidades;

public class Carta {
	private Numero numero;
	private String palo;
	private String estado="N";
	//constructor
	public Carta(Numero numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	//set and get
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
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	//metodo
	public void mostrarInfo() {
		System.out.println(numero+"-"+palo);
	}
	
}
