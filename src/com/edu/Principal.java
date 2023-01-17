package com.edu;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce tu nombre: ");
		Scanner sc=new Scanner(System.in);
		String nombre= sc.nextLine();
		System.out.println("Buenos días, " + nombre);
		
		
		boolean abierto = true;
		if (abierto) {
			System.out.println("Puede pasar.");
		}else {
			System.out.println("En otra ocasión.");
		}
		
		
		
		public static void main(String[] args) {
			int dia=0;
		
		
		
			System.out.println("INtroduce un día: ");
			Scanner scanner= new Scanner(System.in);
			String loquehaleido = scanner.nextLine();
			dia = Integer.valueOf(loquehaleido);
			if (dia==1) {
				System.out.println("Lunes");
			}else if(dia==2) {
				System.out.println("Martes");
			}else if(dia==3) {
				System.out.println("Miércoles");
			}else if(dia==4) {
				System.out.println("Jueves");
			}else if(dia==5) {
				System.out.println("Viernes");
			}else if(dia==6) {
				System.out.println("Sábado");
			}else if(dia==7) {
				System.out.println("Domingo");
			}else {
				System.out.println("El día introducido no es válido");
			}
		
		}


