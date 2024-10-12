package com.krakedev.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Carta> cartas;
	private ArrayList<Numero> numerosPosibles;
	//constructor
	public Naipe() {
		Palos palos=new Palos();
		//agregar numeros a numerosPsibles
		numerosPosibles=new ArrayList<Numero>();
		numerosPosibles.add(new Numero("A",11));
		numerosPosibles.add(new Numero("2",2));
		numerosPosibles.add(new Numero("3",3));
		numerosPosibles.add(new Numero("4",4));
		numerosPosibles.add(new Numero("5",5));
		numerosPosibles.add(new Numero("6",6));
		numerosPosibles.add(new Numero("7",7));
		numerosPosibles.add(new Numero("8",8));
		numerosPosibles.add(new Numero("9",9));
		numerosPosibles.add(new Numero("10",10));
		numerosPosibles.add(new Numero("J",10));
		numerosPosibles.add(new Numero("Q",10));
		numerosPosibles.add(new Numero("K",10));
		//for que guarda las 52 cartas
		for(int i=0;i<numerosPosibles.size();i++) {
			cartas.add(new Carta(numerosPosibles.get(i),palos.getCorazonRojo()));
			cartas.add(new Carta(numerosPosibles.get(i),palos.getCorazonNegro()));
			cartas.add(new Carta(numerosPosibles.get(i),palos.getDiamante()));
			cartas.add(new Carta(numerosPosibles.get(i),palos.getTrebol()));
		}
	}
	//getter
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	
}
