package com.cmc.evaluacion.servicios;


import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double co=prestamo.getMonto();
		double i=((prestamo.getInteres())/12);
		i/=100;
		int plazo=prestamo.getPlazo();
		double cuota=(co*i)/(1-(Math.pow(1+i,-plazo)));
		
		return cuota;
	}
	public static void generarTabla(Prestamo prestamo) {
		double cuotaCalcu=calcularCuota(prestamo);
		double interes=(prestamo.getInteres()/12)/100;
		//creando objetos cuota , inicializando 
		for(int i=1;i<prestamo.getPlazo()+1;i++) {
			prestamo.getCuotas().add(new Cuota(i));
			prestamo.getCuotas().get(i-1).setCuota(cuotaCalcu);
		}
		//asignacion valor a primera cuota con el valor total del monto-prestamo
		prestamo.getCuotas().get(0).setInicio(prestamo.getMonto());
		//5 iteracion llamado calcylarvalorescuotas
		for(int j=0;j<prestamo.getCuotas().size();j++) {
			if(j!=prestamo.getPlazo()-1) {
				calcularValoresCuotas(interes,prestamo.getCuotas().get(j),prestamo.getCuotas().get(j+1));
			}else {
				calcularValoresCuotas(interes,prestamo.getCuotas().get(j),null);
				
			}
			
		}
				
		
	}
	/*
	 * double interes=(prestamo.getInteres()/prestamo.getPlazo())/100;
	 * Cuota cuenta2=new Cuota(2);
	calcularValoresCuotas(interes,cuota,cuenta2);
	for(int i=2;i<prestamo.getPlazo();i++) {
		Cuota cuotaNext=new Cuota(i);
		calcularValoresCuotas(interes,cuota,cuotaNext);
		prestamo.getCuotas().add(cuotaNext);
	}*/

	public static void calcularValoresCuotas(double i,Cuota cuotaActual, Cuota cuotaNext) {
		double interes=(cuotaActual.getInicio()*i);//calcula interes, 
		double abonoCapital=cuotaActual.getCuota()-interes;//Restante de interes y cuora
		double saldo=cuotaActual.getInicio()-abonoCapital; 
		//setear
		cuotaActual.setInteres(interes);
		cuotaActual.setAbonoCapital(abonoCapital);
		cuotaActual.setSaldo(saldo);
		if(cuotaNext!=null) {
			cuotaNext.setInicio(saldo);
		}
		
		
		
	}
	public static void mostrarTabla(Prestamo prestamo) {
		System.out.println("Numero | Cuota  | Inicio | Interes | Abono  | Saldo ");
		for(int i=0;i<prestamo.getCuotas().size();i++) {
			prestamo.getCuotas().get(i).mostrarPrestamo();
		}
	}
}
