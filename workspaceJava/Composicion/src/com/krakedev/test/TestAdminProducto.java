package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;


public class TestAdminProducto {

	public static void main(String[] args) {
		Producto mc;
		AdminProducto admin=new AdminProducto();
		Producto produtcoA=new Producto("Doritos",0.50);
		Producto productoB=new Producto("Papitas",0.55);
		
		mc=admin.buscarMasCaro(produtcoA, productoB);
		if(mc==null) {
			System.out.println("Los dos son iguales");
		}else {
			System.out.println("El más caro es: "+mc.getNombre());
		}
		

	}

}
