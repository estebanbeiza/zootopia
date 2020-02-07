package Ejercicio1;

public class TestHerencia3 {

	public static void main(String[] args) {
		ProductosFrescos pfrescos1 = new ProductosFrescos ("29-10-2020", 123, "China", "01-01-2020");
		System.out.println(pfrescos1.toString());
		
		ProductosFrescos pfrescos2 = new ProductosFrescos ("31-12-2020", 321, "SriLanka", "09-01-2020");
		System.out.println(pfrescos2.toString());
		
	
		ProductosRefrigerados prefrigerado1 = new ProductosRefrigerados("15-03-2020", 543, "Taiwan", "01-01-2020", 121212, 3.0);
		System.out.println(prefrigerado1.toString());
		
		ProductosRefrigerados prefrigerado2 = new ProductosRefrigerados("16-04-2020", 333, "Pakistan", "02-02-2020", 313131, 3.5);
		System.out.println(prefrigerado2.toString());
		
		ProductosRefrigerados prefrigerado3 = new ProductosRefrigerados("17-05-2020", 543, "Iran", "03-02-2020", 141414, 3.6);
		System.out.println(prefrigerado3.toString());
		
		ProductosCongelados pcongelado1 = new ProductosCongelados("23-04-2020", 565, "Afganistan", "15-01-202", -2.3);
		System.out.println(pcongelado1.toString());
	}

}
