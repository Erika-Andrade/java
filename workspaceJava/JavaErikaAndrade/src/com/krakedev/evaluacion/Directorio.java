package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;


public class Directorio {
	private ArrayList<Contacto> contactos=new ArrayList<Contacto>();
	private Date fechaModificacion;
	
	public boolean agregarContacto(Contacto contacto) {
		contactos.add(contacto);
		return true;
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
