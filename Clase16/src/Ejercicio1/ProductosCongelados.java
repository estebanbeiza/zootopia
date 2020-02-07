package Ejercicio1;

public class ProductosCongelados extends Productos {
	private double temperaturaMantenimiento;

	ProductosCongelados (String fechaCaducidad, int numeroLote, String paisOrigen, String fechaEnvasado, double temperaturaMantenimiento) {
		super (fechaCaducidad, numeroLote, paisOrigen, fechaEnvasado);
		this.temperaturaMantenimiento = temperaturaMantenimiento;	
	}

	
	public double getTemperaturaMantenimiento() {
		return temperaturaMantenimiento;
	}

	public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}


	@Override
	public String toString() {
		return super.toString() + " ProductosCongelados [temperaturaMantenimiento=" + temperaturaMantenimiento + "]";
	}
	
	
	
}
