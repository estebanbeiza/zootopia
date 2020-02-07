package Ejercicio2;

public class AnimalesAcuaticos extends Animales {
	private String tipoAmbiente; //agua dulce o salada
	private int cantidadAletas;
	private int nivelAgresividad; //1,2 ó 3
	
	AnimalesAcuaticos () {
		super();
		this.tipoAmbiente = "agua dulce";
		this.cantidadAletas = 2;
		this.nivelAgresividad = 1;
	}
	
	AnimalesAcuaticos (String nombre, String paisOrigen, String fechaIngreso, String tipoAmbiente, int cantidadAletas, int nivelAgresividad) {
		super(nombre, paisOrigen, fechaIngreso);
		this.tipoAmbiente = tipoAmbiente;
		this.cantidadAletas = cantidadAletas;
		this.nivelAgresividad = nivelAgresividad;
	}

	public String getTipoAmbiente() {
		return tipoAmbiente;
	}

	public void setTipoAmbiente(String tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public int getNivelAgresividad() {
		return nivelAgresividad;
	}

	public void setNivelAgresividad(int nivelAgresividad) {
		this.nivelAgresividad = nivelAgresividad;
	}

	@Override
	public String toString() {
		return super.toString() + " AnimalesAcuaticos [tipoAmbiente=" + tipoAmbiente + ", cantidadAletas=" + cantidadAletas
				+ ", nivelAgresividad=" + nivelAgresividad + "]";
	}
	
	
	
}
