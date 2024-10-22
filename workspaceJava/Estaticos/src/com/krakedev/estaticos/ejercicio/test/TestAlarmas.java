package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicios.utils.Utils;



public class TestAlarmas {

	public static void main(String[] args) {
		AdminAlarmas adminA=new AdminAlarmas();
		ArrayList<Alarma> alarmasActuales=adminA.getAlarmas(); 
		Alarma alarma=new Alarma(Utils.LUNES,3,57);
		alarmasActuales.add(alarma);
		Alarma alarma1=new Alarma(Utils.MIERCOLES,5,30);
		alarmasActuales.add(alarma1);
		Alarma alarm2=new Alarma(Utils.JUEVES,14,35);
		alarmasActuales.add(alarm2);
		Alarma alarma3=new Alarma(Utils.DOMINGO,9,50);
		alarmasActuales.add(alarma3);
		
		System.out.println(alarmasActuales);

	}

}
