package com.krakedev.demo;

public class Producto {
	private int codigo;
	private String nombre;
	private String descripcion;
	private double peso;
	
	public Producto(int codigo, String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public double getPeso() {
		return peso;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
