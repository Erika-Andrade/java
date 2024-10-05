package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;


public class TestContactos1 {

	public static void main(String[] args) {
		//Instancia Contacto con telefono incluido
		Telefono telf1=new Telefono("claro","0978664433",27);
		Contacto c1=new Contacto("Juana","De Arco",telf1,48.9);
		Telefono telf2=new Telefono("movi","0978664483",29);
		Contacto c2=new Contacto("Mariano","Hernandez",telf2,30);
		//Instacia para llamar metodos
		AdminContactos admin=new AdminContactos();
		Contacto masPesado=admin.buscarMasPesado(c1, c2);
		Telefono telfPesa=masPesado.getTelefono();//guarda el telf
		//imprimir
		System.out.println("Contacto más pesado");
		System.out.println(masPesado.getNombre()+" "+masPesado.getApellido()+" "
		+masPesado.getPeso()+" "+telfPesa.getNombre()+" "+telfPesa.getOperadora());
		
		boolean resul=admin.compararOperadoras(c1, c2);
		if(resul==true) {
			System.out.println("Los dos contactos son de la misma operadora");
		}else if(resul==false) {
			System.out.println("Los contactos son de distintas operadoras");
		}
		
		
	}

}
