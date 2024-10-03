package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante=new Estudiante("Ana");
		estudiante.calificar(2);
		System.out.println(estudiante.getNombre()+" "+estudiante.getNota()+" "+estudiante.getResultado());

	}

}
