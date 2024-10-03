package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	public Producto(String nombre,double precio) {
		this.nombre=nombre;
		this.precio=precio;
		
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		if(precio<0) {
			this.precio = precio*-1;
		}
	}
	public double calcularPrecioPromo(int porcentaje) {
		double precioDesc=precio-(precio*porcentaje/100);
		return precioDesc;
	}
}
