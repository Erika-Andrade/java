package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto c1,Contacto c2) {
		if(c1.getPeso()>c2.getPeso()) {
			return c1;
		}else if(c2.getPeso()>c1.getPeso()) {
			return c2;
		}else {
			return null;
		}
	}
	public boolean compararOperadoras(Contacto c1, Contacto c2) {
		Telefono telf1=c1.getTelefono();
		Telefono telf2=c2.getTelefono();
		if((telf1.getOperadora()=="claro" && telf2.getOperadora()=="claro")||
				(telf1.getOperadora()=="movi" && telf2.getOperadora()=="movi")) {
			return true;
		}else{
			return false;
		}
	}
	public void activarUsuario(Contacto c1) {
		Telefono telf1=c1.getTelefono();
		if(telf1.getOperadora()=="movi" || telf1.getOperadora()=="claro" ) {
			c1.setActivo(true);
		}
		
	}
}
