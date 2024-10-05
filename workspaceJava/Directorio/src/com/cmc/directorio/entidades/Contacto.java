package com.cmc.directorio.entidades;


public class Contacto {
	private String nombre;
	private String apellido;
	private boolean activo;
	private Telefono telefono;
	private double peso;
	public Contacto(String nombre, String apellido, Telefono telefono, double peso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public boolean isActivo() {
		return activo;
	}
	public Telefono getTelefono() {
		return telefono;
	}
	public double getPeso() {
		return peso;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
