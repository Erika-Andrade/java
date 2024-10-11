package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas=new ArrayList<Nota>();
	
	
	
	public Estudiante(String nombre, String apellido, String cedula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
		
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	//metodos
	public void agregarNota(Nota nuevaNota){
		boolean notaExiste=false;
		for(int i=0;i<notas.size();i++) {
				Nota notaRecuperada=notas.get(i);
				if(notaRecuperada.getMateria().getCodigo()==nuevaNota.getMateria().getCodigo()){
					notaExiste=true;
					break;
					
				}
		}
		if(!notaExiste && nuevaNota.getCalificacion()>=0 && nuevaNota.getCalificacion()<=10) {
			notas.add(nuevaNota);
		}
	}
		

		
	public void modificarNota(String codigo,double nuevaNota) {
		Nota notaRecuperada;
		for(int i=0;i<notas.size();i++) {
			notaRecuperada=notas.get(i);
			if(codigo.equals(notaRecuperada.getMateria().getCodigo()) &&(nuevaNota>=0&&
					nuevaNota<=10) ){
				notaRecuperada.setCalificacion(nuevaNota);
			}
		}
	}
	public double calcularPromedioNotasEstudiantes() {
		double prom=0;
		Nota notaRec;
		for(int i=0;i<notas.size();i++) {
			notaRec=notas.get(i);
			prom+=notaRec.getCalificacion();
		}
		prom/=notas.size();
		return prom;
	}
	public void mostrar() {
		Nota nota;
		for(int i=0;i<notas.size();i++) {
			nota=notas.get(i);
			System.out.println("Nombre: "+nombre+" ,Apellido: "+apellido
					+" ,Cedula:"+cedula+" ,Materia: "+nota.getMateria()+" ,Calificación: "+nota.getCalificacion());
		}
	}
}
