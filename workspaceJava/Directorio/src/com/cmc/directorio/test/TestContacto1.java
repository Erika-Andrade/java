package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;
public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf=new Telefono("claro","0978605848",10);
		Contacto c=new Contacto("Alejandra","Pizarnik",telf,48.9);
		System.out.println(c.getNombre()+" "+c.getApellido()+" "
		+c.getPeso()+" "+telf.getOperadora()+" "+telf.getNombre());
	}

}
