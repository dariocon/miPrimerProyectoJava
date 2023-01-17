package com.edu;

import java.util.Scanner;

public class EJERCICIOS {

	public static void main(String[] args) {
		
		
		System.out.println("Introduce el mes: ");
		Scanner scanner= new Scanner(System.in);
		int mes= Integer.valueOf(scanner.nextLine());
		System.out.println("Introduce el anno: ");
		Scanner scannneer= new Scanner(System.in);
		int annyo= Integer.valueOf(scanner.nextLine());
		switch (mes) {
		case 1,3,5,7,8,10,12: {
			System.out.println("31");
			break;
		}case 2: {
			System.out.println("28 o 29");
			break;
		}case 4,6,11,9: {
			System.out.println("30");
			break;
		}default: {
			System.out.println("introduce un mes valido");
			break;
		}
		
		}
		
		


	}

}
