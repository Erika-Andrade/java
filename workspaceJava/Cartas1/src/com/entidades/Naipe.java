package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles=new ArrayList<Numero>();
	private  ArrayList<Carta> cartas=new ArrayList<Carta>();
	//constructor
	public Naipe() {
		Palos palos=new Palos();
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
		for(int i=0;i<numerosPosibles.size();i++) {
			cartas.add(new Carta(numerosPosibles.get(i),palos.getCorazonNegro()));
			cartas.add(new Carta(numerosPosibles.get(i),palos.getCorazonRojo()));
			cartas.add(new Carta(numerosPosibles.get(i),palos.getDiamante()));
			cartas.add(new Carta(numerosPosibles.get(i),palos.getTrebol()));
		}
	}
	//get
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> auxiliar=new ArrayList<Carta>();
		for(int i=1;i<101;i++) {
			int posicion=Random.obtenerPosicion();
			if(cartas.get(posicion).getEstado().equals("N")) {
				auxiliar.add(cartas.get(posicion));
				cartas.get(posicion).setEstado("C");
			}
		}
		for(int i=0;i<cartas.size();i++) {
			if(cartas.get(i).getEstado().equals("N")) {
				auxiliar.add(cartas.get(i));
				cartas.get(i).setEstado("C");
			}
		}
		return auxiliar;
	}
	
}
