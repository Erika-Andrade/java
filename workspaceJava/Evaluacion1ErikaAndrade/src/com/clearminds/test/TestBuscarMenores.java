package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(("A1"));
        maquina.agregarCelda(("A2"));
        maquina.agregarCelda(("B1"));
        maquina.agregarCelda(("B2"));
        maquina.agregarCelda(("C1"));
        maquina.agregarCelda(("C2"));
        
        Producto producto=new Producto("KE34","Jumbo",0.70);
		maquina.cargarProducto(producto, "A1", 4);
		
		Producto producto2=new Producto("D456","Manicho",0.55);
		maquina.cargarProducto(producto2, "A2", 6);
		
		Producto producto3=new Producto("LL30","Nestle",2.95);
		maquina.cargarProducto(producto3, "B1", 9);
		
		Producto producto4=new Producto("D897","Nucita",0.30);
		maquina.cargarProducto(producto4, "B2", 12);
		
		Producto producto5=new Producto("9RT3","Ruffles",2);
		maquina.cargarProducto(producto5, "C1", 10);
		
		Producto producto6=new Producto("YU9I","Platanitos",0.65);
		maquina.cargarProducto(producto6, "C2", 2);
		
		ArrayList<Producto> menores=maquina.buscarMenores(1);
        System.out.println("Productos menores: "+menores.size());
        System.out.println("Nombre: "+menores.get(0).getNombre()+" Precio: "+menores.get(0).getPrecio());
        System.out.println("Nombre: "+menores.get(1).getNombre()+" Precio: "+menores.get(1).getPrecio());
        System.out.println("Nombre: "+menores.get(2).getNombre()+" Precio: "+menores.get(2).getPrecio());
        System.out.println("Nombre: "+menores.get(3).getNombre()+" Precio: "+menores.get(3).getPrecio());

	}

}
