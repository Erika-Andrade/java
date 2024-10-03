package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		double total;
		Producto producto=new Producto("Ruffles",1.87);
		producto.setPrecio(-2);
		total=producto.calcularPrecioPromo(10);
		System.out.println(producto.getPrecio()+" "+total);
		
		

	}

}
