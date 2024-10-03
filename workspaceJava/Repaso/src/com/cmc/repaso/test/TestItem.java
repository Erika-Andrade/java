package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1=new Item("Ruffles");
		Item item2=new Item("Coca Cola");
		item1.setProductosActuales(20);
		System.out.println("----Valores Iniciales----");
		item1.imprimir();
		System.out.println("----Valores Modificados----");
		item1.vender(8);
		item1.imprimir();
		System.out.println("--------------");
		item1.devolver(3);
		item1.imprimir();
		//Producto 2
		item2.setProductosActuales(33);
		System.out.println("----Valores Iniciales----");
		item2.imprimir();
		System.out.println("----Valores Modificados----");
		item2.vender(22);
		item2.imprimir();
		System.out.println("--------------");
		item2.devolver(9);
		item2.imprimir();
		
		
	}

}
