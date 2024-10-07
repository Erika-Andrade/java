package com.clearminds.maquina;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;


public class MaquinaDulces {
	private Celda celda1=new Celda(" ");
	private Celda celda2=new Celda(" ");
	private Celda celda3=new Celda(" ");
	private Celda celda4=new Celda(" ");
	private double saldo;
	//metodos
	public void configurarMaquina(String cod1,String cod2,String cod3,String cod4) {
		celda1.setCodigo(cod1);;
		celda2.setCodigo(cod2);
		celda3.setCodigo(cod3);
		celda4.setCodigo(cod4);
	}
	public void mostrarConfiguracion() {
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
		System.out.println("SALDO: "+saldo);
		System.out.println("CELDA 1");
		System.out.println("Codigo: "+celda1.getCodigo());
		System.out.println("Stock Actual: "+celda1.getStock());
		System.out.println("Nombre: "+celda1.getProducto().getNombre());
		System.out.println("Precio: "+celda1.getProducto().getPrecio());
		
		System.out.println("CELDA 2");
		System.out.println("Codigo: "+celda2.getCodigo());
		System.out.println("Stock Actual: "+celda2.getStock());
		System.out.println("Nombre: "+celda2.getProducto().getNombre());
		System.out.println("Precio: "+celda2.getProducto().getPrecio());
		
		System.out.println("CELDA 3");
		System.out.println("Codigo: "+celda3.getCodigo());
		System.out.println("Stock Actual: "+celda3.getStock());
		System.out.println("Nombre: "+celda3.getProducto().getNombre());
		System.out.println("Precio: "+celda3.getProducto().getPrecio());
		
		System.out.println("CELDA 4");
		System.out.println("Codigo: "+celda4.getCodigo());
		System.out.println("Stock Actual: "+celda4.getStock());
		System.out.println("Nombre: "+celda4.getProducto().getNombre());
		System.out.println("Precio: "+celda4.getProducto().getPrecio());
	}
	public Producto buscarProductoEnCelda(String cod) {
		Celda celdaRecuperada=buscarCelda(cod);
		if(celdaRecuperada==null) {
			return null;
		}else {
			return celdaRecuperada.getProducto();
		}
	}
	public double consultarPrecio(String cod) {
		Producto prodRecu=buscarProductoEnCelda(cod);
		return prodRecu.getPrecio();
	}
	public Celda buscarCeldaProducto(String cod) {
		if(cod==celda1.getProducto().getCodigo()) {
			return celda1;
		}else if(cod==celda2.getProducto().getCodigo()) {
			return celda2;
		}else if(cod==celda3.getProducto().getCodigo()) {
			return celda3;
		}else if(cod==celda4.getProducto().getCodigo()) {
			return celda4;
		}else {
			return null;
		}
	}
	public void incrementarProductos(String codProd, int cantidad) {
		Celda celdaEncontrada=buscarCeldaProducto(codProd);
		if(celdaEncontrada!=null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidad);
		}
	}
	public void vender(String codCelda) {
		Celda celdaEncontrada=buscarCelda(codCelda);
		if(celdaEncontrada!=null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
			saldo+=celdaEncontrada.getProducto().getPrecio();
			mostrarProductos();
		}
	}
	public double venderConCambio(String cod,double valor) {
		Celda celdaEncontrada=buscarCelda(cod);
		double precio=celdaEncontrada.getProducto().getPrecio();
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo-=precio;
		return valor-precio;
	}
	public Celda getCelda1() {
		return celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public Celda getCelda4() {
		return celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
