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
		System.out.println("*****CELDA "+celda1.getCodigo());
		System.out.println("Stock: "+celda1.getStock());
		if(celda1.getProducto()!=null) {
			System.out.println("Nombre Producto: "+celda1.getProducto().getNombre());
			System.out.println("Precio Producto: "+celda1.getProducto().getPrecio());
			System.out.println("Codigo Producto: "+celda1.getProducto().getCodigo());
		}else {
			System.out.println("La celda no tiene producto!");
		}
		
		
		System.out.println("*****CELDA "+celda2.getCodigo());
		System.out.println("Stock: "+celda2.getStock());
		if(celda2.getProducto()!=null) {
			System.out.println("Nombre Producto: "+celda2.getProducto().getNombre());
			System.out.println("Precio Producto: "+celda2.getProducto().getPrecio());
			System.out.println("Codigo Producto: "+celda2.getProducto().getCodigo());
		}else {
			System.out.println("La celda no tiene producto!");
		}
		
		System.out.println("*****CELDA "+celda3.getCodigo());
		System.out.println("Stock: "+celda3.getStock());
		if(celda3.getProducto()!=null) {
			System.out.println("Nombre Producto: "+celda3.getProducto().getNombre());
			System.out.println("Precio Producto: "+celda3.getProducto().getPrecio());
			System.out.println("Codigo Producto: "+celda3.getProducto().getCodigo());
		}else {
			System.out.println("La celda no tiene producto!");
		}
		
		System.out.println("*****CELDA "+celda4.getCodigo());
		System.out.println("Stock: "+celda4.getStock());
		if(celda4.getProducto()!=null) {
			System.out.println("Nombre Producto: "+celda4.getProducto().getNombre());
			System.out.println("Precio Producto: "+celda4.getProducto().getPrecio());
			System.out.println("Codigo Producto: "+celda4.getProducto().getCodigo());
		}else {
			System.out.println("La celda no tiene producto!");
		}
		System.out.println("SALDO: "+saldo);
		
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
		Celda celdaRetorno=new Celda(" ");
		if(celda1.getProducto()!=null) {
			if(cod==(celda1.getProducto().getCodigo())) {
				celdaRetorno=celda1;
			}
		}else if(celda2.getProducto()!=null) {
			if(cod==celda2.getProducto().getCodigo()) {
				celdaRetorno=celda2;
			}
		}else if(celda3.getProducto()!=null) {
			if(cod==celda3.getProducto().getCodigo()) {
				celdaRetorno=celda3;
			}
		}else if(celda4.getProducto()!=null) {
			 if(cod==celda4.getProducto().getCodigo()) {
				 celdaRetorno=celda4;
			 }
		}else {
			celdaRetorno=null;
		}
		return celdaRetorno;
		
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
