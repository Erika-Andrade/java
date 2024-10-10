package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	public MaquinaDulces() {
		celdas=new ArrayList<Celda>();
	}
	
	//getters and setters
	public ArrayList<Celda> getCeldas() {
		return celdas;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//metodos
	public void agregarCelda(String codigo) {
		Celda celda=new Celda(codigo);
		celdas.add(celda);
	}
	public void mostrarConfiguracion() {
		Celda celdaRecuperada;
		for(int i=0;i<celdas.size();i++) {
			celdaRecuperada=celdas.get(i);
			System.out.println("CELDA "+(i+1)+":"+celdaRecuperada.getCodigo());
				
		}
	}
	public Celda buscarCelda(String codigo) {
		Celda celdaEncontrada=null;
		Celda elemento=null;
		for(int i=0;i<celdas.size();i++) {
			elemento=celdas.get(i);
			if(elemento.getCodigo().equals(codigo)) {
				celdaEncontrada=elemento;
			}
		}
		return celdaEncontrada;
	}
	public void cargarProducto(Producto producto, String codigo, int stock) {
		Celda celdaRecuperada=buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, stock);
		
	}
	public void mostrarProductos() {
		Celda celda;
		for(int i=0;i<celdas.size();i++) {
			celda=celdas.get(i);
			if(celda.getProducto()!=null) {
				System.out.println("CELDA: "+celda.getCodigo()+" STOCK: "
					+celda.getStock()+" PRODUCTO: "
					+celda.getProducto().getCodigo()+" PRECIO: "+celda.getProducto().getPrecio());
			}else {
				System.out.println("CELDA: "+celda.getCodigo()+" STOCK: "
						+celda.getStock()+" Sin producto asignado");
			}
			
			
		}
	}
	public Producto buscarProductoEnCelda(String codigo) {
		Celda celdaEncontrada=null;
		Celda elemento=null;
		Producto productoEn=null;
		for(int i=0;i<celdas.size();i++) {
			elemento=celdas.get(i);
			if(elemento.getCodigo().equals(codigo)) {
				celdaEncontrada=elemento;
			}
		}
		if(celdaEncontrada!=null) {
			productoEn=celdaEncontrada.getProducto();
		}
		return productoEn;
	}
	public double consultarPrecio(String codigo) {
		Producto productoEnc=buscarProductoEnCelda(codigo);
		double precio;
		if(productoEnc!=null){
			precio=productoEnc.getPrecio();
		}else {
			precio=0.0;
		}
		return precio;
	}
	public Celda buscarCeldaProducto(String codigoP) {
		Celda celdaEncontrada=null;
		Celda elemento=null;
		for(int i=0;i<celdas.size();i++) {
			elemento=celdas.get(i);
			if(elemento.getProducto()!=null) {
				if(codigoP.equals(elemento.getProducto().getCodigo()));
					celdaEncontrada=celdas.get(i);
					break;
			}else {
				celdaEncontrada=null;
			}
		}
		return celdaEncontrada;
	}
	public void incrementarProductos(String codigo, int cant){
		Celda celdaEncontrada=buscarCeldaProducto(codigo);
		if(celdaEncontrada!=null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock()+cant);
		}
	}
}
