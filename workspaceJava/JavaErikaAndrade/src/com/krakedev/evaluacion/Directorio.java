package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;


public class Directorio {
	private ArrayList<Contacto> contactos=new ArrayList<Contacto>();
	private Date fechaModificacion;
	
	public boolean agregarContacto(Contacto contacto) {
		boolean existe=false;
		boolean agregaNuevo=false;
		for(int i=0;i<this.contactos.size();i++) {
			if(contacto.getCedula().equals(contactos.get(i).getCedula())){
				existe=true;
				break;
			}
		}
		if(existe==false) {
			contactos.add(contacto);
			agregaNuevo=true;
		}
		return agregaNuevo;
	}
	public Contacto buscarPorCedula(String cedula) {
		Contacto contactoEnc=null;
		for(int i=0;i<contactos.size();i++) {
			if(cedula.equals(contactos.get(i).getCedula())){
				contactoEnc=contactos.get(i);
				break;
			}
		}
		return contactoEnc;
	}
}
