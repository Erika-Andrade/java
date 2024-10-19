package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;


public class Banco {
	private ArrayList<Prestamo> prestamos=new ArrayList<Prestamo>();
	private ArrayList<Cliente> clientes=new ArrayList<Cliente>();
	//getters
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	//metodo
	public Cliente buscarCliente(String cedula) {
		Cliente clienteEncontrado=null;
		for(int i=0;i<clientes.size();i++) {
			if(clientes.get(i).getCedula().equals(cedula)) {
				clienteEncontrado= clientes.get(i);
				break;
			}
		}
		return clienteEncontrado;	
	}
	public void registrarCliente(Cliente clienteARegis) {
		if(buscarCliente(clienteARegis.getCedula())==null) {
			clientes.add(clienteARegis);
		}else {
			System.out.println("Cliente ya existe: "+clienteARegis.getCedula());
		}
	}
}
