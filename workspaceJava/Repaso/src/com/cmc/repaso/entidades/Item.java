package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosVendidos;
	private int productosDevueltos;
	public Item(String nombre) {
		this.nombre=nombre;
	}
	//metodos
	public void imprimir() {
		System.out.println(nombre);
		System.out.println("Productos Vendidos: "+productosVendidos);
		System.out.println("Productos Actuales: "+productosActuales);
		System.out.println("Productos Devueltos: "+productosDevueltos);
	}
	public void vender(int productosVendidos) {
		this.productosVendidos+=productosVendidos;
		this.productosActuales-=productosVendidos;
		
	}
	public void devolver(int productosDevueltos) {
		this.productosVendidos-=productosDevueltos;
		this.productosActuales+=productosDevueltos;
		this.productosDevueltos+=productosDevueltos;
	}
	//setters
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	
}
