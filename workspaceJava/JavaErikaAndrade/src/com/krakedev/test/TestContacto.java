package com.krakedev.test;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Direccion;

public class TestContacto {

	public static void main(String[] args) {
	    

        // Crear una instancia de Contacto
        Contacto contacto = new Contacto("1234567890", "Juan", "Pérez");

        // Settear la dirección
        Direccion Direccion = new Direccion("Av. Siempre Viva", "Calle 4");
        contacto.setDireccion(Direccion);

        // Mostrar información 
        System.out.println("\nInformación del Contacto:");
        contacto.imprimir();
        //modificar info
        contacto.setCedula("9876543210");
        contacto.setNombre("Ana");
        contacto.setApellido("Gomez");
        contacto.getDireccion().setCallePrincipal("Cdl del ejercito");
        contacto.getDireccion().setCalleSecundaria("Pasaje 2B");
        //mostrar Info
        System.out.println("\nInformación del Contacto (Actualizada):");
        contacto.imprimir();
    }
}

