package com.cmc.evaluacion.entidades;

public class Cliente {
	private String cedula;
	private String nombre;
	private String apellido;
	//constructor
	public Cliente(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	//getters and setters
	public String getCedula() {
		return cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	//metodos
	public void mostrarCliente() {
		System.out.println("Cliente registrado: "+nombre+" "+apellido+"[Cedula= "+cedula+", nombre="+nombre+" ,apellido="+apellido+"]");
	}
	
}
