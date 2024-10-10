package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	public MaquinaDulces() {
		celdas=new ArrayList<Celda>();
	}
	
	//getters and setters
	public ArrayList<Celda> getCeldas() {
		return celdas;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//metodos
	public void agregarCelda(String codigo) {
		Celda celda=new Celda(codigo);
		celdas.add(celda);
	}
	public void mostrarConfiguracion() {
		Celda celdaRecuperada;
		for(int i=0;i<celdas.size();i++) {
			celdaRecuperada=celdas.get(i);
			System.out.println("CELDA "+(i+1)+":"+celdaRecuperada.getCodigo());
				
		}
	}
	public Celda buscarCelda(String codigo) {
		Celda celdaEncontrada=null;
		Celda elemento=null;
		for(int i=0;i<celdas.size();i++) {
			elemento=celdas.get(i);
			if(elemento.getCodigo().equals(codigo)) {
				celdaEncontrada=elemento;
			}
		}
		return celdaEncontrada;
	}
	
}
