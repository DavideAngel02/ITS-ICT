package Esercizi.ITS01;

import java.util.Scanner;
public class stringhe {

	public static void main(String[] args) {
		
		//---------CONTA VOCALI E CONSONANTI----------		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Scrivi qualcosa: ");
//		String parola = input.nextLine();
//		parola = parola.toLowerCase();
//		int vocali = 0;
//		int consonanti = 0;
//		for (int i = 0; i < parola.length(); i++) {
//			if ((Character.isLetter(parola.charAt(i))) && (parola.charAt(i) == 'a' || parola.charAt(i) == 'e' || parola.charAt(i) == 'i' || parola.charAt(i) == 'o' || parola.charAt(i) == 'u')) 
//				vocali++;
//			else if (Character.isLetter(parola.charAt(i)))
//				consonanti++;
//			}
//			System.out.println("ci sono " + vocali + " vocali");
//			System.out.println("ci sono " + consonanti + " consonanti");
		
		//--------------------------------------------
		
		//---------INVERSIONE----------		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Inserisci parola da convertire: ");
//		String parola = input.nextLine();
//		String invertita = "";
//        for (int i = parola.length() - 1; i >= 0; i--)
//            invertita = invertita + parola.charAt(i);    
//        System.out.println(invertita);
        
// 		altro metodo usando gli array        
//		char[] caratteri = parola.toCharArray();
//		char[] invertita = new char[caratteri.length];
//		for (int i = 0; i < parola.length(); i++) {
//			invertita[i] = caratteri[caratteri.length - 1 - i];
//		}
//			System.out.println(invertita); //dubbio sull'array di caratteri, l'intera parola è in invertita[0]?			
		//------------------------------
        
        //----------PALINDROMO-----------
//		Scanner input = new Scanner(System.in);
//		System.out.println("Inserisci parola: ");
//		String parola = input.nextLine().toLowerCase();
//		int x = 1;
//		boolean palindromo = true;
//		for (int i = 0; i < parola.length() / 2; i++) {
//			if (parola.charAt(i) != parola.charAt(parola.length()- x)) { 
//				palindromo = false;
//				break;
//			}
//				x++;
//		}
//			if (palindromo)
//				System.out.println("la parola è palindroma");
//			else
//				System.out.println("la parola non è palindroma");
		//-------------------------------
		
		//----------SOSTITUZIONE----------
//		Scanner input = new Scanner(System.in);
//		System.out.println("Scrivi qualcosa: ");
//		String stringa = input.nextLine();
		
		//1 modo
//		char[] nuovaStringa = new char[stringa.length()];
//		for (int i = 0; i < stringa.length(); i++)
//			if (stringa.charAt(i)== ' ')
//				nuovaStringa[i] = '-';
//			else
//				nuovaStringa[i] = stringa.charAt(i);
//		String finale = new String(nuovaStringa); //costruttore
//		System.out.println(finale);
		
		//2 modo usando metodo replace()
//		String finale = stringa.replace(' ', '-');
//		System.out.println(finale);
		
		//----------------------------------
		
		//---------CONTA PAROLE-----------
//		Scanner input = new Scanner (System.in);
//		System.out.println("Scrivi qualcosa: ");
//		String stringa = input.nextLine().trim(); //trim() toglie spazi iniziali e finali
//		int c = 1;
//		for (int i = 0; i <  stringa.length(); i++ )
//			if (stringa.charAt(i)== ' ' )
//				c++;
//		System.out.println("ci sono " + c + " parole");
		
		//--------------------------------
		
		//--------RICERCA SOTTOSTRINGA---------
//		Scanner input = new Scanner(System.in);
//        System.out.println("Scrivi qualcosa: ");
//        String stringa = input.nextLine();
//        System.out.println("Inserire la sottostringa da cercare: ");
//        String sottoStringa = input.nextLine();
        
        //1 modo
//        boolean trovata = false;
//        int inizio = -1;
//        int fine = -1;
//        for (int i = 0; i <= stringa.length() - sottoStringa.length(); i++) {
//            if (stringa.charAt(i) == sottoStringa.charAt(0)) {
//                trovata = true;
//                inizio = i;
//                fine = i + sottoStringa.length() - 1;
//                for (int x = 0; x < sottoStringa.length(); x++) {
//                    if (stringa.charAt(i + x) != sottoStringa.charAt(x)) {
//                        trovata = false;
//                        break;
//                    }
//                }
//                if (trovata) 
//                    break;                
//            }
//        }         
//        if (trovata) 
//            System.out.println("La sottostringa ricercata inizia alla posizione " + inizio + " e finisce alla posizione " + fine);
//        else 
//            System.out.println("Sottostringa non trovata.");
                
        //2 modo con metodo indexOf
//        int inizio = stringa.indexOf(sottoStringa);
//        if (inizio != -1) {
//        	int fine = inizio + sottoStringa.length() - 1;
//        	System.out.println("La sottostringa ricercata inizia alla posizione " + inizio + " e finisce alla posizione " + fine);
//        } else 
//        	System.out.println("Sottostringa non esistente");
        
	}

}
