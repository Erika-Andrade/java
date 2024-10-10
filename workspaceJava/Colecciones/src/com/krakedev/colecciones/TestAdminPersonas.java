package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin=new AdminPersonas();
		admin.agregar(new Persona("Mario","Benedetti",50));
		admin.agregar(new Persona("Clark","Kent",30));
		admin.agregar(new Persona("Bruno","Diaz",30));
		
		admin.imprimir();
		
		Persona p1=admin.buscarPorNombre("Jose");
		if(p1!=null) {
			System.out.println(p1.getApellido()+" "+p1.getEdad());
		}else {
			System.out.println("No existe persona con ese nombre");
		}
		
		ArrayList<Persona> personasMayores=admin.buscarMayores(25);
		System.out.println("mayores;"+personasMayores.size());
	}
	

}
