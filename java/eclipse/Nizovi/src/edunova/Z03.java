package edunova;

import java.util.Scanner;

public class Z03 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.print("Upiši veličinu niza: ");

		int n = ulaz.nextInt();
		int count = 0;
		int suma = 0;
		int niz[] = new int[n];

		for (int i = 0; i < niz.length; i++) {
			System.out.print("Upiši " + (i+1) +". član niza: ");
			niz[i] = ulaz.nextInt();
			
			suma += niz[i];
			count++;

		}
		System.out.println();
		
		System.out.println("Aritmetička sredina iznosi: " + aritmetickasredina(suma, count));
		
		System.out.println("ISPIS BROJEVA VEĆIH OD ARITMETIČKE SREDINE");
		int suma1 = 0, count1 = 0;
		for(int i = 0; i<niz.length; i++) {
			
			if(niz[i] > aritmetickasredina(suma, count)) {
				
				System.out.print(niz[i] + " ");
				suma1 +=niz[i];
				count1++; 
				
				
			}
			
			
			
		}
		
		System.out.println();
		System.out.println("Aritmetička sredina većih brojeva je: " + aritmetickasredina(suma1, count1));
		
	}

	private static double aritmetickasredina(int suma, double count) {

		return suma / count;
	}

}
