package Ejercicio2;

import java.util.Scanner;

public class MenuOpciones {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("|         Menú de Opciones           |");
		System.out.println("--------------------------------------");
		System.out.println("| 1.- Agregar animal                 |");
		System.out.println("| 2.- Mostrar Animales por categoria |");
		System.out.println("| 3.- Resumen                        |");
		System.out.println("| 4.- Salir                          |");
		System.out.println("--------------------------------------");
		System.out.print("| Escriba opcion: ");
		
		int op = read.nextInt();
		
		read.close();
	}

}

