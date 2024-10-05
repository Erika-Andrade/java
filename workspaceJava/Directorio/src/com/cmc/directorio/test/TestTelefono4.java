package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi","0979876757",30);
		Telefono telf2=new Telefono("claro","0998933066",40);
		Telefono telf3=new Telefono("movi","0980673425",50);
		Telefono telf4=new Telefono("claro","0934578990",60);
		AdminTelefono admin=new AdminTelefono();
		int cont=admin.contarClaro(telf1, telf2, telf3,telf4);
		System.out.println("El número de telefonos claro es "+cont);

	}

}
