package com.krakedev.evaluacion;

public class Telefono {
	private String numero ;
	private String estado;
	private String tipo;
	//constructor
	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		if(this.numero!=null && this.tipo!=null) {
			if(this.tipo.equals("Movil")&&numero.length()==10) {
				this.estado="C";
			}else if(tipo.equals("Convencional")&&numero.length()==7) {
				this.estado="C";
			}else {
				this.estado="E";
			}	
			
		}else {
			this.estado="E";
		}
	}
	//getters
	public String getNumero() {
		return numero;
	}
	
	public String getEstado() {
		return estado;
	}
	public String getTipo() {
		return tipo;
	}
	
}
