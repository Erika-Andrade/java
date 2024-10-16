package com.krakedev.entidades;

import java.util.ArrayList;

import com.krakedev.servicios.Juego;


public class Jugadores {
	private ArrayList<String> jugadores;
	//getteres and setters
	public ArrayList<String> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	//metodo
	public void jugar() {
		//agregar tres jugadores a la lista
		jugadores.add("0");
		jugadores.add("1");
		jugadores.add("2");
		//instanciar objeto juego y pasarle la lista 
		Juego play=new Juego(jugadores);
		//llamar a entregarCartas
		play.entregarCartas(5);
		//for para sumar e imprimir los resultados de los jugadores
		for(int i=0;i<jugadores.size();i++) {
			int totalLista=play.devolverTotal(i);
			/*
			ArrayList<Carta> cartaLista=play.getCartasJugadores().get(i);
			for(int j=0;j<6;j++) {
				totalLista+=cartaLista.get(j).getNumero().getValor();
			}*/
			System.out.println("Total del jugador "+(i++)+totalLista);
		}
		//determinar ganador ...
		
	}
	
	
}
