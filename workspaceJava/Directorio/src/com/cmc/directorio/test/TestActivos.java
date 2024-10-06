package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono t1=new Telefono("movi","0992332788",30);
		Contacto c1=new Contacto("Danna","Moran",t1,28.0);
		System.out.println(c1.getNombre()+" "+c1.getApellido()+" "+c1.getPeso()
		+" "+c1.isActivo()+" "+t1.getNombre()+" "+t1.getOperadora());
		
		AdminContactos admin=new AdminContactos();
		admin.activarUsuario(c1);
		System.out.println(c1.getNombre()+" "+c1.getApellido()+" "+c1.getPeso()
		+" "+c1.isActivo()+" "+t1.getNombre()+" "+t1.getOperadora());
	}

}
