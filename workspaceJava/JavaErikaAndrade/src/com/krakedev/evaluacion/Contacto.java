package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String  apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos=new ArrayList<Telefono>();
	//constructor
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	//getters and setters
	
	public String getCedula() {
		return cedula;
	}
	public ArrayList<Telefono> getTelefono() {
		return telefonos;
	}

	public void setTelefono(ArrayList<Telefono> telefono) {
		this.telefonos = telefono;
	}

	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public void imprimir() {
		System.out.println("Cedula: "+cedula);
		System.out.println("Nombre: "+nombre+" "+apellido);
		//System.out.println("Apellido: "+apellido);
		System.out.println("Direccion:");
		System.out.println(" Calle Principal: "+direccion.getCallePrincipal());
		System.out.println(" Calle Secundario: "+direccion.getCalleSecundaria());
		/*System.out.println("****"+nombre+" "+apellido+"****");
		if(direccion!=null) {
			System.out.println("Direccion: "+direccion.getCallePrincipal()+" y "+direccion.getCalleSecundaria());
		}else {
			System.out.println("No tiene asociada una direccion");
		}*/
	}
	public void agregarTelefono(Telefono telf) {
		telefonos.add(telf);
	}
	public void mostrarTelefonos() {
		System.out.println("Telefonos con estado 'C':");
		for(int i=0;i<telefonos.size();i++) {
			if((telefonos.get(i).getEstado().equals("C"))){
				System.out.println("Numero: "+telefonos.get(i).getNumero()+" ,Tipo: "+telefonos.get(i).getTipo());
			}
		}
	
	}
	public ArrayList<Telefono> recuperarIncorrectos(){
		ArrayList<Telefono> error=new ArrayList<Telefono>();
		for(int i=0;i<telefonos.size();i++) {
			if((telefonos.get(i).getEstado().equals("E"))){
				error.add(telefonos.get(i));
			}
		}
		return error;
	}
	
}
