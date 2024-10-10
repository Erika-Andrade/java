package com.krakedev.colecciones;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Persona(String nombre, String apellido,int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad=edad;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
