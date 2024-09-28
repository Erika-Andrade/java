package clearminds.cuentas.test;
import clearminds.cuentas.Cuentas;

public class TestCuentas {

	public static void main(String[] args) {
		//Crear objeto cuenta y referciar con cuenta1
		Cuentas cuenta1=new Cuentas("03476");
		//colocar valor saldo en la cuenta1
		cuenta1.setSaldo(675);
		
		//Crear objeto cuenta y referciar con cuenta2
		Cuentas cuenta2=new Cuentas("03476","C",98);
		//Crear objeto cuenta y referciar con cuenta1
		Cuentas cuenta3=new Cuentas("03476");
		cuenta3.setTipo("C");
		
		//imprimir cuenta1,cuenta2,cuenta3
		System.out.println("--------Valores Iniciales--------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		System.out.println("--------Valores Modificados--------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		

	}

}
