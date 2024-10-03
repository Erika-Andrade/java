package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		boolean val1;
		boolean val2;
		Validacion validador=new Validacion();
		val1=validador.validarMonto(0);
		val2=validador.validarMonto(300);
		System.out.println(val1+" "+val2);
	}

}
