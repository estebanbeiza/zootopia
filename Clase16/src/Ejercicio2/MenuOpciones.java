package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;


public class MenuOpciones {
	static ArrayList <AnimalesTerrestres> animalTerrestre = new ArrayList<AnimalesTerrestres>();
	static ArrayList <AnimalesAcuaticos> animalAcuatico = new ArrayList<AnimalesAcuaticos>();
	static ArrayList <AnimalesVoladores> animalVolador = new ArrayList<AnimalesVoladores>();
	
	static int tipoAnimal;
	static int hrsSueno;
	static int cantidad;
	static int nivel;
	static int tamano;
	static String tipo;
	static String nombre;
	static String pais;
	static String fechaIngreso;
	static String plumas;
	static int migrante;
	static boolean mig;
	static int sumTerrestre = 0, sumAcuatico = 0, sumVolador = 0;
	
	static Scanner read = new Scanner(System.in);
	
	public static void ingresarTerrestre () {
		System.out.println("Ingrese cantidad de patas");
		cantidad = read.nextInt();
		System.out.println("Ingrese tipo de alimentación");
		tipo = read.next();
		System.out.println("Ingrese Horas de sueño");
		hrsSueno = read.nextInt();
		animalTerrestre.add(new AnimalesTerrestres(nombre, pais, fechaIngreso, cantidad, tipo, hrsSueno));
	}
	
	public static void ingresarAcuatico () {
		System.out.println("Es de agua: (dulce o salada)");
		tipo = read.next();
		System.out.println("cantidad aletas");
		cantidad = read.nextInt();
		System.out.println("nivel agresivida (1, 2 ó 3)");
		nivel = read.nextInt();
		animalAcuatico.add(new AnimalesAcuaticos(nombre, pais, fechaIngreso, tipo, cantidad, nivel));
	}
	
	public static void ingresarVolador () {
		System.out.println("Color de plumas");
		plumas = read.next();
		System.out.println("tamaño");
		tamano = read.nextInt();
		System.out.println("Selccione: (0 = No Migrante | 1 = Migrante)");
		migrante = read.nextInt();
		if (migrante == 1) 
			mig = true;
		else 
			mig = false;
		
		animalVolador.add(new AnimalesVoladores(nombre, pais, fechaIngreso, plumas, tamano, mig));
	}
	
	public static void ingresarAnimal () {
		System.out.println("Ingrese Nombre del animal");
		nombre = read.next();
		System.out.println("Ingrese País de origen");
		pais = read.next();
		System.out.println("Fecha de ingreso");
		fechaIngreso = read.next();
	}
	
	public static void mostrarAnimales (int op) {
		System.out.println("Opcion 2 seleccionada");
		if (op == 1) {
			for (AnimalesTerrestres e : animalTerrestre) {
				System.out.println(e);
			}
		} else if (op == 2) {
			for (AnimalesAcuaticos e : animalAcuatico) {
				System.out.println(e);
			}
		} else {
			for (AnimalesVoladores e : animalVolador) {
				System.out.println(e); 
				}
		}
		System.out.println();
	}
	
	public static void contarAnimales () {
		
			for (AnimalesTerrestres e : animalTerrestre) {
				sumTerrestre++;
			}
			
			for (AnimalesAcuaticos e : animalAcuatico) {
				sumAcuatico++;
			}
	
			for (AnimalesVoladores e : animalVolador) {
				sumVolador++; 
				}
			
			System.out.println("animales terrestres " + sumTerrestre);
			System.out.println("animales acuaticos " + sumAcuatico);
			System.out.println("animales voladores " + sumVolador);
		}
	
	
	public static void main(String[] args) {
	int op = 0;
		
		while (op != 4) {
			do {
				System.out.println("--------------------------------------");
				System.out.println("|         Menú Principal             |");
				System.out.println("--------------------------------------");
				System.out.println("| 1.- Agregar animal                 |");
				System.out.println("| 2.- Mostrar Animales por categoria |");
				System.out.println("| 3.- Resumen                        |");
				System.out.println("| 4.- Salir                          |");
				System.out.println("--------------------------------------");
				System.out.print("| Escriba opcion: ");

				op = read.nextInt();
					
			} while (op < 1 || op > 4);
			
			switch (op) {
			case 1:
				System.out.println("");
				System.out.println("Opcion Menu 1 ");
				System.out.println("Seleccione tipo de animal");
				System.out.println(" 1.- Animal Terrestre");
				System.out.println(" 2.- Animal Acuatico");
				System.out.println(" 3.- Animal Volador");
				tipoAnimal = read.nextInt();
				
				ingresarAnimal();
				
				if (tipoAnimal == 1) {
					ingresarTerrestre();
				} else if (tipoAnimal == 2) {
					ingresarAcuatico();
				} else {
					ingresarVolador();
				}
				break;
			case 2:
				System.out.println("ingrese Categoria a mostrar");
				System.out.println(" 1.- Animales Terrestres");
				System.out.println(" 2.- Animales Acuaticos");
				System.out.println(" 3.- Animales voladores");
				int opcion = read.nextInt();
				
				mostrarAnimales(opcion);
				break;
			case 3: 
				System.out.println("Opcion 3 seleccionada");
				contarAnimales();
				break;
			case 4:
				System.out.println("Opcion 4 seleccionada fin del programa");
				break;
			default:
				break;
			}
		}
		read.close();


	
	}
	



}

