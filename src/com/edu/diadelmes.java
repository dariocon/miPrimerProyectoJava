package com.edu;

import java.util.Scanner;

public class diadelmes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes=0;
		int annyo;
		
		
		
		System.out.println("Introduce el mes: ");
		Scanner scannner= new Scanner(System.in);
		String loquehaleido = scannner.nextLine();
		edad = Integer.valueOf(loquehaleido);
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
			if (edad>65) {
				System.out.println("Eres un anciano");
			}else {
				System.out.println("Eres un adulto");
			}
		}else {
			System.out.println("No eres mayor de edad. Eres un niño");
		}
	}

}
