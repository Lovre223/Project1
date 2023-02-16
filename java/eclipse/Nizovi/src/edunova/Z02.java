package edunova;

import java.util.Scanner;

public class Z02 {

	public static void main(String[] args) {
		
		Scanner ulaz = new 	Scanner(System.in);
		
		
		System.out.print("Upiši veličinu niza: ");
		int n = ulaz.nextInt();
		
		int niz[]= new int[n];
		
		for(int i = 0;i<niz.length;i++ ) {
			System.out.print( (i+1) + ". član niza: ");
			
			niz[i] = ulaz.nextInt();
			
			
		}
		
		System.out.println();
		
		System.out.println("ISPIS U OBRNUTOM REDOSLIJEDU");
		for(int i = niz.length - 1; i>=0; i--) {
			
			System.out.print(niz[i] + " ");
			
		}

	}

}
