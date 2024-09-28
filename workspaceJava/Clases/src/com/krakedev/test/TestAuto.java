package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1=new Auto("",0,0);
		Auto auto2=new Auto("",0,0);
		//modificar atributos auto1
		auto1.setMarca("Ford Mustang GT");
		auto1.setAnio(2012);
		auto1.setPrecio(26000.00);
		//modificar atributos auto2
		auto2.setMarca("Nissan GT-R");
		auto2.setAnio(2023);
		auto2.setPrecio(113000.00);
		//mostrar valores atributos auto1
		System.out.println("-------Auto 1------");
		System.out.println("marca: "+auto1.getMarca());
		System.out.println("anio: "+auto1.getAnio());
		System.out.println("precio: "+auto1.getPrecio());
		//mostrar valores atributos auto2
		System.out.println("-------Auto 2------");
		System.out.println("marca: "+auto2.getMarca());
		System.out.println("anio: "+auto2.getAnio());
		System.out.println("precio: "+auto2.getPrecio());
		
	}

}
