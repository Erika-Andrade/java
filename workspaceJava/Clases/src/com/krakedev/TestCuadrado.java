package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		//1.Instaciar cuadrados
		Cuadrado cua1=new Cuadrado();
		Cuadrado cua2=new Cuadrado();
		Cuadrado cua3=new Cuadrado();
		double area1;
		double area2;
		double area3;
		double peri1;
		double peri2;
		double peri3;
		
		//2.Modificar valores
		cua1.setLado(3);
		cua2.setLado(4);
		cua3.setLado(5);
		//testear funciones area
		area1=cua1.calcularArea();
		area2=cua2.calcularArea();
		area3=cua3.calcularArea();
		//testar funcion peri
		peri1=cua1.calcularPerimetro();
		peri2=cua2.calcularPerimetro();
		peri3=cua3.calcularPerimetro();
		//mostrarResultados
		System.out.println("-------C1------");
		System.out.println("Area de c1: "+area1);
		System.out.println("Perimetro de c1: "+peri1);
		
		System.out.println("-------C2-----");
		System.out.println("Area de c2: "+area2);
		System.out.println("Perimetro de c2: "+peri2);
		
		System.out.println("-------C3-----");
		System.out.println("Area de c3: "+area3);
		System.out.println("Perimetro de c3: "+peri3);
		

	}

}
