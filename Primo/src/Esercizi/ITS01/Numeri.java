package Esercizi.ITS01;

import java.util.Scanner; 

import java.util.Random;

public class Numeri {

	public static void main(String[] args) {
		
		//----------PARI DISPARI------------
//		Scanner elemento = new Scanner(System.in); 
//		System.out.println("inserisci numero intero ");
//		int numero = elemento.nextInt();
//		if (numero >= 0 )
//			if (numero % 2 == 0)
//			System.out.println("il numero è pari");
//		else
//			System.out.println("il numero è dispari");
//		else 
//			System.out.println("il numero non è intero");
		//--------------------------------------
		
		//-----------SOMMA 5 NUMERI-----------
//		Scanner elemento = new Scanner(System.in);
//		int i = 0; 
//		int somma = 0;
//		while (i < 5) {
//			System.out.println("Inserisci il " + (i+1) +  " numero");
//			int numero = elemento.nextInt();
//			somma = somma + numero;
//			i++; 		
//		}
//		 
//		System.out.println("la somma è " + somma);
		//--------------------------------------
		
		//-----------NUMERO RANDOM--------------
//		Scanner elemento = new Scanner(System.in);
//		Random casuale = new Random();
//		int numeroCasuale = casuale.nextInt(100)+1;
//		System.out.println("indovina il numero generato da 1 a 100: ");
//		int tentativo = elemento.nextInt();
//		while (tentativo != numeroCasuale) {			
//			if (tentativo < 1 || tentativo > 100)
//				System.out.println("sei fuori range");
//			else			
//				if (tentativo < numeroCasuale) 
//					System.out.println("il numero indicato è inferiore a quello generato");
//				else
//					System.out.println("il numero indicato è superiore a quello generato");
//			tentativo = elemento.nextInt();
//		}
//		System.out.println("Hai indovinato!");
		//--------------------------------------
		
		//-------------FATTORIALE---------------		
//		Scanner elemento = new Scanner(System.in);
//		System.out.println("inserisci numero per il calcolo del suo fattoriale: ");
//		int numero = elemento.nextInt();
//		int fattoriale = 1;
//		for (int i = 1; i <= numero; i++) 
//			fattoriale = i*fattoriale;
//		System.out.println("il risultato è: " + fattoriale);		
		//--------------------------------------
		
		//------------NUMERO PRIMO--------------		
//		Scanner elemento = new Scanner(System.in);
//		System.out.println("inserisci numero per verificare se è primo o meno:");
//		boolean primo = true;
//		int numero = elemento.nextInt();
//		for (int i = 2; i <= Math.sqrt(numero); i++) {
//			if(numero % i == 0)
//				primo = false ;						
//		}
//		if (primo)
//			System.out.println("il numero inserito è primo");
//		else
//			System.out.println("il numero inserito non è primo");
	}	 
}