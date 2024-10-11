package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes=new ArrayList<Estudiante>() ;
	
	
	
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante estudianteRec;
		String esta=null;
		for(int i=0;i<estudiantes.size();i++) {
			estudianteRec=estudiantes.get(i);
			if(estudianteRec.getCedula()==estudiante.getCedula()) {
				esta="SI";
			}
		}
		return esta;
	}
	public void matricularEstudiante(Estudiante estudiante) {
		String esta=buscarEstudiantePorCedula(estudiante);
		if(esta==null) {
			estudiantes.add(estudiante);
		}
	}
	public double calcularPromedioCurso() {
		double promEstudiante;
		double promTotal=0;
		
		for(int i=0;i<estudiantes.size();i++) {
			promEstudiante=estudiantes.get(i).calcularPromedioNotasEstudiantes();
			promTotal+=promEstudiante;
		}
		return promTotal/estudiantes.size();
	}
	public void mostrar() {
		Estudiante estudiante;
		for(int i=0;i<estudiantes.size();i++) {
			estudiante=estudiantes.get(i);
			System.out.println("Nombre: "+estudiante.getNombre()+" ,Apellido: "+estudiante.getApellido()
					+" ,Cedula:"+estudiante.getCedula()+" ,Materia: "+estudiante.getNotas()+" ,Calificación: "+estudiante.getNotas());
		}
	}
}
