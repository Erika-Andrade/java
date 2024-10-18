package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugador=new ArrayList<ArrayList<Carta>>();
	private ArrayList<Carta> naipeBarajado;
	//constructor
	public Juego(ArrayList<String> ids) {
		naipe=new Naipe();
		naipeBarajado=naipe.barajar();
		for(int i=0;i<ids.size();i++) {
			cartasJugador.add(new ArrayList<Carta>());
		}
	}
	//get
	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}
	//metodos
	public void entregarCartas(int cartasPorJugador) {
		int numJugadores=cartasJugador.size();
		int totalCartas=naipeBarajado.size();
		int cartasTotalesARepartir=Math.min(cartasPorJugador*numJugadores,totalCartas);
		for(int i=0;i<cartasTotalesARepartir;i++) {
			int jugador=i%numJugadores;
			cartasJugador.get(jugador).add(naipeBarajado.get(i));
		}
	}
	/*public int devolverTotal(int idJugador) {
		int total=0;
		for(int i=0;i<cartasJugador.size();i++) {
			if(idJugador==i) {
				for(int j=0;j<6;j++) {
					total+=cartasJugador.get(i).get(j).getNumero().getValor();
				}
			break;
			}
		}
		return total;
	}*/
	public int devolverTotal(int idJugador) {
	    int total = 0;
	    // Asegurarse de que no excede el número de cartas de cada jugador
	    for (int j = 0; j < cartasJugador.get(idJugador).size(); j++) {
	        total += cartasJugador.get(idJugador).get(j).getNumero().getValor();
	    }
	    return total;
	}
	/*public int determinarGanador() {
		int idGanador=0;
		int sumaGanador=devolverTotal(0);
		for(int i=1;i<cartasJugador.size();i++) {
			if(sumaGanador<devolverTotal(i)) {
				idGanador=i;
			}
		}
		return idGanador+1;
	}*/
	public int determinarGanador() {
	    int idGanador = 0;
	    int sumaGanador = devolverTotal(0);

	    for (int i = 1; i < cartasJugador.size(); i++) {
	        int sumaJugadorActual = devolverTotal(i);
	        if (sumaJugadorActual > sumaGanador) {
	            idGanador = i;
	            sumaGanador = sumaJugadorActual;
	        }
	    }
	    return idGanador + 1; 
	} 
}
