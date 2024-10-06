package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int stock;
	private String codigo;
	//constructor
	public Celda(String codigo) {
		this.codigo = codigo;
	}
	
	//metodos
	public void ingresarProducto(Producto producto, int stock) {
		this.producto=producto;
		this.stock=stock;
	}

	public Producto getProducto() {
		return producto;
	}

	public int getStock() {
		return stock;
	}

	public String getCodigo() {
		return codigo;
	}

	
	
	
}
