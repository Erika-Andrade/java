package com.clearminds.componentes;

public class Producto {
	//atributos
	private String nombre;
	private double precio;
	private String codigo;
	//constructor
	public Producto(String nombre, double precio, String codigo) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	//metodos
	public void incrementarPrecio(int porcentaje){
		double incre=porcentaje*precio/100;
		precio=incre+precio;
	}
	public void disminuirPrecio(double descuento){
		precio-=descuento;
	}
	
}
