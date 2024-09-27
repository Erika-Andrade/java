package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		//modificar atributos auto1
		auto1.marca="Ford Mustang GT";
		auto1.anio=2012;
		auto1.precio=26000.00;
		//modificar atributos auto2
		auto2.marca="Nissan GT-R";
		auto2.anio=2023;
		auto2.precio=113000.00;
		//mostrar valores atributos auto1
		System.out.println("-------Auto 1------");
		System.out.println("marca: "+auto1.marca);
		System.out.println("anio: "+auto1.anio);
		System.out.println("precio: "+auto1.precio);
		//mostrar valores atributos auto2
		System.out.println("-------Auto 2------");
		System.out.println("marca: "+auto2.marca);
		System.out.println("anio: "+auto2.anio);
		System.out.println("precio: "+auto2.precio);
		
	}

}
