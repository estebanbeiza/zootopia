package Ejercicio2;

public class AnimalesVoladores extends Animales {
	private String colorPlumas;
	private int tamano;
	private boolean migrante;
	
	AnimalesVoladores () {
		super();
		this.colorPlumas = " ";
		this.tamano = 0;
		this.migrante = false;
		
	}

	AnimalesVoladores (String nombre, String paisOrigen, String fechaIngreso, String colorPlumas, int tamano, boolean migrante) {
		super(nombre, paisOrigen, fechaIngreso);
		this.colorPlumas = colorPlumas;
		this.tamano = tamano;
		this.migrante = migrante;
		
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public boolean isMigrante() {
		return migrante;
	}

	public void setMigrante(boolean migrante) {
		this.migrante = migrante;
	}

	@Override
	public String toString() {
		return super.toString() + " AnimalesVoladores [colorPlumas=" + colorPlumas + ", tamano=" + tamano + ", migrante=" + migrante + "]";
	}
	
	
	
}
