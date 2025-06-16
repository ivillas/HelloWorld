package com.curso;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		System.out.println("In english: Hello World!");
		System.out.println("In english: By World!");
		System.out.println("En español: Hola Mundo!");
		System.out.println("En español: Adios Mundo!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserta tu nombre: ");
        String name = scanner.nextLine();

        System.out.println("Hola, " + name + "!");

        scanner.close();
	}

}
// This is a simple Java program that prints greetings in English and Spanish.