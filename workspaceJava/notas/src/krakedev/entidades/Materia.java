package krakedev.entidades;

public class Materia {
	private String codigo;
	private String nombre;
	
	
	
	public Materia(String nombre, String codigo) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
