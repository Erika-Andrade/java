package com.clearminds.maquina;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;


public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private Celda celda5;
	private double saldo;
	//metodos 
	public void configurarMaquina(String cod1,String cod2,String cod3,String cod4) {
		celda1.setCodigo(cod1);
		celda2.setCodigo(cod2);
		celda3.setCodigo(cod3);
		celda4.setCodigo(cod4);
	}
	public void mostrarConfiguracion() {
		System.out.println("CONFIGURACIÓN");
		System.out.println("CELDA 1: "+celda1.getCodigo());
		System.out.println("CELDA 2: "+celda2.getCodigo());
		System.out.println("CELDA 3: "+celda3.getCodigo());
		System.out.println("CELDA 4: "+celda4.getCodigo());
	}
	public Celda buscarCelda(String cod){
		if(cod==celda1.getCodigo()){
			return celda1;
		}else if(cod==celda2.getCodigo()) {
			return celda2;
		}else if(cod==celda3.getCodigo()) {
			return celda3;
		}else if(cod==celda4.getCodigo()) {
			return celda4;
		}else {
			return null;
		}
	}
	public void cargarProducto(Producto prod,String cod,int cantidad) {
		Celda celdaRecuperada=buscarCelda(cod);
		celdaRecuperada.ingresarProducto(prod, cantidad);
	}
	public void mostrarProductos() {
		System.out.println("CELDA 1");
		System.out.println("Codigo: "+celda1.getCodigo());
		System.out.println("Stock Actual: "+celda1.getStock());
		System.out.println("Nombre: "+celda1.getProducto().getNombre());
		System.out.println("Precio: "+celda1.getProducto().getPrecio());
	}
}
