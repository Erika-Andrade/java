package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		int area;
		int areaR2;
		double perimetro1;
		double perimetro2;
		
		r1.setBase(10);;
		r1.setAltura(5);;
		
		r2.setBase(8);;
		r2.setAltura(3);;
		
		area=r1.calcularArea();
		perimetro1=r1.calcularPerimetro();
		
		areaR2=r2.calcularArea();
		perimetro2=r2.calcularPerimetro();
		
		
		System.out.println("Area de r1: "+area);
		System.out.println("Perimetro de r1: "+perimetro1);
		System.out.println("Area de r2: "+areaR2);
		System.out.println("Perimetro de r2: "+perimetro2);
		
		

	}

}
