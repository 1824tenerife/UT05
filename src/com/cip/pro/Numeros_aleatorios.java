package com.cip.pro;

import java.util.Scanner;

public class Numeros_aleatorios {

	

	public static void main(String[] args) {

		int numeroAleatorio = (int) Math.round(Math.random() * 100);
		//System.out.println(numeroAleatorio);
	
		
		int numeroelegido =0;
		int numerodeintentos=0;
		
		while (numeroelegido != numeroAleatorio ) {
			
			numerodeintentos ++;
			
			System.out.println( "Por favor introduce un numero entre el 1 y el 100 para comprobar si es el mismo que eligio la maquina");
			numeroelegido = new Scanner(System.in).nextInt();
			if (numeroelegido > numeroAleatorio) {
				System.out.println("El numero introducido es mayor que el numero elegido por la maquina");

			}
			if (numeroelegido < numeroAleatorio) {
				System.out.println("El numero introducido es menor que el numero elegido por la maquina");
			}
		}
			System.out.println(" ¡¡¡ Felicidades has hacertado el numero !!! y lo has ralizado en " + numerodeintentos +" intentos ");

		}

	}


