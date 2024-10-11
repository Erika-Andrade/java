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
		Estudiante elementoEstudiante = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			System.out.println("Estudiante [ Nombre: " + elementoEstudiante.getNombre() + ", Apellido: "
					+ elementoEstudiante.getApellido() + ", Cedula: " + elementoEstudiante.getCedula() + " ]");
			Nota elementoNota = null;
			for (int j = 0; j < elementoEstudiante.getNotas().size(); j++) {
				elementoNota = elementoEstudiante.getNotas().get(j);
				System.out.println("Materia: " + elementoNota.getMateria().getNombre() + " Calificacion: "
						+ elementoNota.getCalificacion());
			}
		}
	}
	
}
