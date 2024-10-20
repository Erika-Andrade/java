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
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		if(buscarCliente(cedula)==null) {
			System.out.println("No es cliente del banco");
		}else {
			prestamos.add(new Prestamo(prestamo.getMonto(),prestamo.getInteres(),prestamo.getPlazo(),cedula));
			CalculadoraAmortizacion.generarTabla(prestamo);
		}
	}
	public ArrayList<Prestamo> buscarPrestamos(String cedula){
		ArrayList<Prestamo> prestamosCliente=new ArrayList<Prestamo>();
		for(int i=0;i<prestamos.size();i++) {
			if(buscarCliente(cedula)!=null) {
				if(cedula.equals(prestamos.get(i).getCedulaCliente())) {
					prestamosCliente.add(prestamos.get(i));
				}
				
			}
		}
		return prestamosCliente;
	}
}
