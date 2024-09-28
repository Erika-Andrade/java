package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1=new Fecha(2001,4,3);
		Fecha fecha2=new Fecha(2000,3,12);
		/*cha1.setAnio(2000);
		fecha1.setMes(12);
		fecha1.setDia(12);*/
		
		System.out.println(fecha1.getAnio());
		System.out.println(fecha1.getMes());
		System.out.println(fecha1.getDia());
		
		System.out.println(fecha2.getAnio());
		System.out.println(fecha2.getMes());
		System.out.println(fecha2.getDia());

	}

}
