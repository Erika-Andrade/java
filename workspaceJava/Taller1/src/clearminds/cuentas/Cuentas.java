package clearminds.cuentas;

public class Cuentas {
	private String id;
	private String tipo;
	private double saldo;
	//constructores
	public Cuentas(String id) {
		this.id=id;
		tipo="A";
	}
	public Cuentas(String id,String tipo,double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	
	//--getters and setter
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getId() {
		return id;
	}
	//metodos
	public void imprimir() {
		System.out.println("********************");
		System.out.println("CUENTA");
		System.out.println("********************");
		System.out.println("Número de Cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: USD "+saldo);
		System.out.println("********************");
	}
	public void imprimiConMiEstilo() {
		System.out.println("----------CUENTA----------");
		System.out.println("Número de Cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: USD "+saldo);
		System.out.println("--------------------------");
		
	}
	
}
