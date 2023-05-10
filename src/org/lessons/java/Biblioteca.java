package org.lessons.java;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Biblioteca {
	public static void main(String[] args) {
		
//		Libro l1 = null;
//		try {
//			
//			l1 = new Libro("prvoaTitolo", 10, "provaautore", "provaeditore");
//			
//		} catch (Exception e) {
//			
//			System.out.println("errore " + e.getMessage());
//			
//		} 
//		
//		System.out.println(l1);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("qunati libri vuoi inserire");
		int userNumber = sc.nextInt();
		
		Libro l = null;
		
		Libro[] libri = new Libro[userNumber];
		
		
		for (int i = 0; i < libri.length; i++) {
			
			System.out.println("inserisci il titolo");
			String userTitolo = sc.next();
			System.out.println("inserisci il numero di pagine");
			int userPagine = sc.nextInt();
			System.out.println("inserisci l'autore");
			String userAutore= sc.next();
			System.out.println("inserisci l'editore");
			String userEditore = sc.next();
			
			
			
			try {
				
				l = new Libro(userTitolo, userPagine, userAutore, userEditore);
				
			} catch (Exception e) {
				
				System.out.println("errore " + e.getMessage());
				
			}
			
			libri[i] = l;
			
			
		}
		
		sc.close();
		
		try {
            FileWriter writer = new FileWriter("C:\\Users\\irrer\\MyFile.txt");
            writer.write("");
    
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		for (int i = 0; i < libri.length; i++) {
			
//			System.out.println(libri[i] + "\n");
		
			try {
	            FileWriter writer = new FileWriter("C:\\Users\\irrer\\MyFile.txt", true);
	            writer.write(libri[i].toString() + "\n");
	    
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		}
		
		
		 try {
	            FileReader reader = new FileReader("C:\\\\Users\\\\irrer\\\\MyFile.txt");
	            int character;
	 
	            while ((character = reader.read()) != -1) {
	                System.out.print((char) character);
	            }
	            reader.close();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
