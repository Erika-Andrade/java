package com.krakedev;

public class Cuadrado {
	private int lado;
	
	public Cuadrado(int lado){
		this.lado=lado;
	}
	//---getter and setter
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	//------
	public double calcularArea() {
		double area=Math.pow(lado, 2);
		return area;
	}
	public double calcularPerimetro() {
		double perimetro=lado*4;
		return perimetro;
	}
}
