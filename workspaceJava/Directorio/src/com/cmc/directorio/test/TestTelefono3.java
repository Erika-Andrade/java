package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi","0979876757",30);
		Telefono telf2=new Telefono("claro","0998933066",40);
		Telefono telf3=new Telefono("movi","0980673425",50);
		AdminTelefono admin=new AdminTelefono();
		int cont=admin.contarMovi(telf1, telf2, telf3);
		System.out.println("El número de telefonos movi es "+cont);

	}

}
