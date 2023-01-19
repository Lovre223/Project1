package edunova;

import java.util.Arrays;

public class Zadatak {


	public static void main(String[] args) {

		String par = Metode.obavezanUnosStringa("Unesite imena ali sa malim brojem slova primjer 'IVA IVO'");
		String par2 = par.replace(" ", "");

		int suma = 0;
		int suma1 = 0;

		int konacan_postotak = 0;
		
		int[] niz = new int[par2.length()];
		int[] niz2 = new int[par2.length() / 2];
		int[] niz3 = new int[(niz2.length / 2) + 1];

		for (int i = 0; i <= niz.length - 1; i++) {

			niz[i] = Metode.count(par2, par2.charAt(i));

		}

		System.out.println(Arrays.toString(niz));

		System.out.println();

		for (int i = 0; i < niz.length / 2; i++) {

			suma = niz[i] + niz[niz.length - 1 - i];

			niz2[i] = suma;
		}

		System.out.println(Arrays.toString(niz2));

		for (int i = 0; i < niz2.length / 2; i++) {

			if (i == 0) {

				niz3[1] = niz2[1];

			}
			
			suma1 = niz2[i] + niz2[niz2.length - 1 - i];

			niz3[i] = suma1;

		}

		System.out.println(Arrays.toString(niz3));
		
		System.out.println();
		
		
	    for(int i = 0; i < niz3.length; i++) {
	    	
	    	konacan_postotak = konacan_postotak * 10 + niz3[i];
	    	
	    	
	    }
	    
	    System.out.println("Vole se " + konacan_postotak + "%");
	    
	    
		
	}

}
