package com.clearminds.componentes;

public class celda {
	private Producto producto;
	private int stock;
	private String codigo;
	
	//constructor
	public celda(String codigo) {
		this.codigo = codigo;
	}
	//getters and setters
	public Producto getProducto() {
		return producto;
	}
	
	public int getStock() {
		return stock;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	//metodos
	public void ingresarProducto(Producto producto, int stock) {
		this.producto=producto;
		this.stock=stock;
	}
	
}
