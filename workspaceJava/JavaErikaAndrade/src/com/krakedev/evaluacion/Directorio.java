package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



public class Directorio {
	private ArrayList<Contacto> contactos=new ArrayList<Contacto>();
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos=new ArrayList<Contacto>();
	private ArrayList<Contacto> incorrectos=new ArrayList<Contacto>();
	
	
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}
	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}
	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}
	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
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
			fechaModificacion=new Date();
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
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return formatoFecha.format(fechaModificacion);
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
			for(int a=0;a<elemento.size();a++) {
				if(elemento.get(a).getTipo().equals("Convencional")
						&&elemento.get(a).getEstado().equals("C") ) {
					conta+=1;
				}
			}
		}
		return conta;
	}
	public void depurar() {
		for(int i=0;i<contactos.size();i++) {
			if(contactos.get(i).getDireccion()==null) {
				incorrectos.add(contactos.get(i));
			}else {
				correctos.add(contactos.get(i));
			}
		}
		contactos.clear();
	}
}
