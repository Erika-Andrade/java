package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String nombre;
	private int codigo;
	private boolean tieneWhatsapp;
	public Telefono(String operadora, String nombre, int codigo) {
		this.operadora = operadora;
		this.nombre = nombre;
		this.codigo = codigo;
		tieneWhatsapp=false;
	}
	public String getOperadora() {
		return operadora;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public boolean isTieneWhatsapp() {
		return tieneWhatsapp;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setTieneWhatsapp(boolean tieneWhatsapp) {
		this.tieneWhatsapp = tieneWhatsapp;
	}
	
	

}
