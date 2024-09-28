package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		//---modificar valores atributos producto a
		productoA.setNombre("Acetaminofén (Tylenol)");
		productoA.setDescripcion("Analgésico y antipirético");
		productoA.setPrecio(5.99);
		productoA.setStockActual(25);
		//---modificar valores atributos producto b
		productoB.setNombre("Ibuprofeno (Advil)");
		productoB.setDescripcion("Antiinflamatorio y analgésico");
		productoB.setPrecio(8.99);
		productoB.setStockActual(40);
				//---modificar valores atributos producto c
		productoC.setNombre("Cremas para manos Nivea");
		productoC.setDescripcion("Hidratación intensiva para manos secas");
		productoC.setPrecio(7.49);
		productoC.setStockActual(12);
		//mostrar producto A
		System.out.println("-------Producto A------");
		System.out.println("nombre: "+productoA.getNombre());
		System.out.println("descripción: "+productoA.getDescripcion());
		System.out.println("precio: "+productoA.getPrecio());
		System.out.println("Stock Actual: "+productoA.getStockActual());
		//mostrar producto B
		System.out.println("-------Producto B------");
		System.out.println("nombre: "+productoB.getNombre());
		System.out.println("descripción: "+productoB.getDescripcion());
		System.out.println("precio: "+productoB.getPrecio());
		System.out.println("Stock Actual: "+productoB.getStockActual());
		//mostrar producto C
		System.out.println("-------Producto C------");
		System.out.println("nombre: "+productoC.getNombre());
		System.out.println("descripción: "+productoC.getDescripcion());
		System.out.println("precio: "+productoC.getPrecio());
		System.out.println("Stock Actual: "+productoC.getStockActual());
		

	}

}
