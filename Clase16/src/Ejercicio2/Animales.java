package Ejercicio2;

public class Animales {
	private String nombre;
	private String paisOrigen;
	private String fechaIngreso;
	
	public Animales () {
		this.nombre = " ";
		this.paisOrigen = " ";
		this.fechaIngreso = " ";
	}
	
	
	public Animales (String nombre, String paisOrigen, String fechaIngreso) {
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
		this.fechaIngreso = fechaIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", paisOrigen=" + paisOrigen + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
	
	
}
