package com.krakedev.demo.test;
import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1=new Producto(23332,"Coca Cola");
		producto1.setDescripcion("Bebida gaseosa");
		producto1.setPeso(1.5);
		System.out.println(producto1.getNombre());
		System.out.println(producto1.getDescripcion());
		System.out.println(producto1.getCodigo());
		System.out.println(producto1.getPeso());

	}

}
