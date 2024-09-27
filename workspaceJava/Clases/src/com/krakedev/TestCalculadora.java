package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMulti;
		
		calcu=new Calculadora();
		
		resultadoSuma=calcu.sumar(2,3);
		resultadoResta=calcu.restar(10,3);
		resultadoMulti=calcu.multiplicar(10,5);
		
		System.out.println("RESULTADO: "+resultadoSuma);
		System.out.println("RESULTADO RESTA: "+resultadoResta);
		System.out.println("RESULTADO MULTIPLICACION: "+resultadoMulti);
		
	}

}
