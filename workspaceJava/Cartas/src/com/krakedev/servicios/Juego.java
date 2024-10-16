package com.krakedev.servicios;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Jugadores;
import com.krakedev.entidades.Naipe;


public class Juego {
	private ArrayList<ArrayList<Carta>> cartasJugadores=new ArrayList<ArrayList<Carta>>();
	private Naipe naipe;
	private ArrayList<Carta> naipeBarajado=new ArrayList<Carta>();
	//constructor
	public Juego() {
		this.naipe=new Naipe();
		System.out.println(".");
		this.naipeBarajado=naipe.barajar();
	}
	public Juego(ArrayList<String> idJugadores) {
		this.naipe=new Naipe();
		System.out.println(".");
		this.naipeBarajado=naipe.barajar();
		ArrayList<Carta> cartaI=new ArrayList<Carta>();
		System.out.println(".");
		for(int i=0;i<idJugadores.size();i++) {
			cartasJugadores.add(cartaI);
		}
	}
	//get
	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}
	
	//metodo
	
	/*public void entregarCartas(int cartasPorJugador) {
		ArrayList<Carta> cartasJugador;
		int indexCartas=cartasJugadores.size();
		for(int x=0;x<cartasPorJugador*cartasJugadores.size();x++) {
			for(int i=0;i<cartasPorJugador+1;i++) {
				for(int a=0;a<cartasJugadores.size();a++){
					cartasJugadores.add(naipeBarajado.get(x));
				}
			}
		}
		
	}*/
	/*public void entregarCartas(int cartasPorJugador) {
		int numJugadores=cartasJugadores.size();
		System.out.println(cartasJugadores.size());
		if(naipeBarajado!=null) {
			for(int i=0;i<cartasPorJugador;i++) {
				System.out.println("vez "+i);
				for(int j=0;j<numJugadores;j++) {
					int index=i*numJugadores+j;
					System.out.println(index);
					if(index<naipeBarajado.size()) {
						System.out.println("naipe Barajado");
						System.out.println(naipeBarajado.get(index));
						cartasJugadores.get(j).add(naipeBarajado.get(index));
						System.out.println(cartasJugadores.get(j));
					}else {
						System.out.println("No hay suficientes cartas en el mazo");
						return;
					}
				}
			}
		}
		
	}*/
	/*public void entregarCartas(int cartasPorJugador) {
		for(int i=0;i<cartasJugadores.size();i++) {
			for(int j=0;j<cartasPorJugador;j++) {
				int index=j*(cartasJugadores.size())+i;
				cartasJugadores.get(i).add(naipeBarajado.get(index));
			}
			
		}
	}*/
	public void entregarCartas(int cartasPorJugador) {
	    int numJugadores = cartasJugadores.size();
	    int totalCartas = naipeBarajado.size();
	    int cartasTotalesARepartir = Math.min(cartasPorJugador * numJugadores, totalCartas);
	    
	    for (int i = 0; i < cartasTotalesARepartir; i++) {
	        int jugador = i % numJugadores;
	        cartasJugadores.get(jugador).add(naipeBarajado.get(i));
	    }
	}
	public int devolverTotal(int idJugador) {
		int total=0;
		for(int i=0;i<cartasJugadores.size();i++) {
			if(i==idJugador) {
				for(int j=0;j<6;j++) {
					total+=cartasJugadores.get(i).get(j).getNumero().getValor();
				}
				break;
			}
		}
		return total;
	}
	public String determinarGanador() {
		String idGanador="Jugador 1";
		int sumaGanador=(new Juego().devolverTotal(0));
		for(int i=0;i<cartasJugadores.size();i++) {
			if(new Juego().devolverTotal(i)>=sumaGanador) {
				idGanador="Jugador "+i;
			}
		}
		
		return idGanador;
	}
}
