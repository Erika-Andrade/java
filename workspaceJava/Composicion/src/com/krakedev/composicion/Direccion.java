package com.krakedev.composicion;

public class Direccion {
	private String callePrincipal;
	private String calleSecundaria;
	private String numero;
	private double latitud;
	private double longitud;
	
	public Direccion() {
		
	}
	public Direccion(String callePrincipal, String calleSecundaria, String numero) {
		this.callePrincipal = callePrincipal;
		this.calleSecundaria = calleSecundaria;
		this.numero = numero;
	}
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	public String getNumero() {
		return numero;
	}
	public double getLatitud() {
		return latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
}
