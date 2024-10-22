package com.krakedev.estaticos.ejercicios.utils;

public class Util {
	public static String formatearHora(int hora) {
		String valor="";
		if(hora<10) {
			valor="0"+hora;
		}else {
			valor=hora+"";
		}
		return valor;
	}
		
	public static String formatearDia(int dia) {
		String diaR="";
		if(dia==0) {
			diaR="Lunes";
		}else if(dia==1){
			diaR="Martes";
		}else if(dia==2){
			diaR="Miercoles";
		}else if(dia==3){
			diaR="Jueves";
		}else if(dia==4){
			diaR="Viernes";
		}else if(dia==5){
			diaR="Sabado";
		}else {
			diaR="Domingo";
		}
		return diaR;
		
	}
}

