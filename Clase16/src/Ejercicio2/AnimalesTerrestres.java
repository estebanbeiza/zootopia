package Ejercicio2;

public class AnimalesTerrestres extends Animales {
	private int cantidadPatas;
	private String tipoAlimentacion;
	private int horasSueno;
	
	AnimalesTerrestres () {
		super();
		this.cantidadPatas = 0;
		this.tipoAlimentacion = " ";
		this.horasSueno = 0;
		
	}
	
	AnimalesTerrestres (String nombre, String paisOrigen, String fechaIngreso, int cantidadPatas, String tipoAlimentacion, int horasSueno) {
		super(nombre, paisOrigen, fechaIngreso);
		this.cantidadPatas = cantidadPatas;
		this.tipoAlimentacion = tipoAlimentacion;
		this.horasSueno = horasSueno;

	}

	public int getCantidadPatas() {
		return cantidadPatas;
	}

	public void setCantidadPatas(int cantidadPatas) {
		this.cantidadPatas = cantidadPatas;
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}

	public int getHorasSueno() {
		return horasSueno;
	}

	public void setHorasSueno(int horasSueno) {
		this.horasSueno = horasSueno;
	}

	@Override
	public String toString() {
		return super.toString() + " AnimalesTerrestres [cantidadPatas=" + cantidadPatas + ", tipoAlimentacion=" + tipoAlimentacion
				+ ", horasSueno=" + horasSueno + "]";
	}
	
	
	

}
