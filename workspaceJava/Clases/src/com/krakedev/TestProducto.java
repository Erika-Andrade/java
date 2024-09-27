package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		//---modificar valores atributos producto a
		productoA.nombre="Acetaminofén (Tylenol)";
		productoA.descripcion="Analgésico y antipirético";
		productoA.precio=5.99;
		productoA.stockActual=25;
		//---modificar valores atributos producto b
		productoB.nombre="Ibuprofeno (Advil)";
		productoB.descripcion="Antiinflamatorio y analgésico";
		productoB.precio=8.99;
		productoB.stockActual=40;
				//---modificar valores atributos producto c
		productoC.nombre="Cremas para manos Nive";
		productoC.descripcion="Hidratación intensiva para manos secas";
		productoC.precio=7.49;
		productoC.stockActual=12;
		//mostrar producto A
		System.out.println("-------Producto A------");
		System.out.println("nombre: "+productoA.nombre);
		System.out.println("descripción: "+productoA.descripcion);
		System.out.println("precio: "+productoA.precio);
		System.out.println("Stock Actual: "+productoA.stockActual);
		//mostrar producto B
		System.out.println("-------Producto B------");
		System.out.println("nombre: "+productoB.nombre);
		System.out.println("descripción: "+productoB.descripcion);
		System.out.println("precio: "+productoB.precio);
		System.out.println("Stock Actual: "+productoB.stockActual);
		//mostrar producto C
		System.out.println("-------Producto C------");
		System.out.println("nombre: "+productoC.nombre);
		System.out.println("descripción: "+productoC.descripcion);
		System.out.println("precio: "+productoC.precio);
		System.out.println("Stock Actual: "+productoC.stockActual);
		

	}

}
