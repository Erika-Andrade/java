package com.clearminds.maquina;
import com.clearminds.componentes.Celda;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private Celda celda5;
	private double saldo;
	//metodos 
	public void configurarMaquina(String cod1,String cod2,String cod3,String cod4) {
		celda1.setCodigo(cod1);
		celda2.setCodigo(cod2);
		celda3.setCodigo(cod3);
		celda4.setCodigo(cod4);
		
	}
}
