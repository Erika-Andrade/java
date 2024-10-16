package com.krakedev.entidades;

public class Carta {
	private Numero numero;
	private String palo;
	private String estado="N";
	//constructor
	public Carta(Numero numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	//getters and setters
	
	public Numero getNumero() {
		return numero;
	}
	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + ", estado=" + estado + "]";
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
