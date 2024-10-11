package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;


public class Directorio {
	private ArrayList<Contacto> contactos=new ArrayList<Contacto>();
	private Date fechaModificacion=new Date();
	
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
			//agregar fecha 
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
	public String consultarUltimaModificacion() {
		//Date fecha=this.fechaModificacion.getDate();
		return " ";
	}
	public int contarPerdidos() {
		int conta=0;
		for(int i=0;i<contactos.size();i++) {
			if(contactos.get(i).getDireccion()==null){
				conta+=1;
			}
		}
		return conta;
	}
	public int contarFijos() {
		int conta=0;
		ArrayList<Telefono> elemento;
		for(int i=0;i<contactos.size();i++) {
			elemento=contactos.get(i).getTelefono();
			for(int a=0;a<elemento.size();i++) {
				if(elemento.get(a).getTipo().equals("Convencional")
						&&elemento.get(a).getEstado().equals("C") ) {
					conta+=1;
				}
			}
		}
		return conta;
	}
}
