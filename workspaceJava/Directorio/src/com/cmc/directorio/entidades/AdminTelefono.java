package com.cmc.directorio.entidades;


public class AdminTelefono {
	public void activarMensajeria(Telefono telf) {
		if(telf.getOperadora()=="movi") {
			telf.setTieneWhatsapp(true);
		}	
	}
	public int contarMovi(Telefono telf1,Telefono telf2,Telefono telf3) {
		int cont=0;
		if(telf1.getOperadora()=="movi") {
			cont+=1;
		}
		if(telf2.getOperadora()=="movi") {
			cont+=1;
		}
		if(telf3.getOperadora()=="movi") {
			cont+=1;
		}
		return cont;
	}
	public int contarClaro(Telefono telf1,Telefono telf2,Telefono telf3,Telefono telf4) {
		int cont=0;
		if(telf1.getOperadora()=="claro") {
			cont+=1;
		}
		if(telf2.getOperadora()=="claro") {
			cont+=1;
		}
		if(telf3.getOperadora()=="claro") {
			cont+=1;
		}
		if(telf4.getOperadora()=="claro") {
			cont+=1;
		}
		return cont;
	}
}
