package com.krakedev.evaluacion;

public class Contacto {
	private String cedula;
	private String nombre;
	private String  apellido;
	private Direccion direccion;
	//constructor
	public Contacto(String cedula, String nombre, String apellido) {
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
	public Direccion getDireccion() {
		return direccion;
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
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public void imprimir() {
		System.out.println("Cedula: "+cedula);
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Direccion:");
		System.out.println(" Calle Principal: "+direccion.getCallePrincipal());
		System.out.println(" Calle Secundario: "+direccion.getCalleSecundaria());
	}
	
}
