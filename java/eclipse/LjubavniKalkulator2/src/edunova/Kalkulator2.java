package edunova;

import java.util.Arrays;

public class Kalkulator2 {
	public static void main(String[] args) {

		String ime1 = Metode.obavezanUnosStringa("Unesi ime: ");
		String ime2 = Metode.obavezanUnosStringa("Unesi drugo ime: ");

		String par = ime1 + ime2;

		int[] niz1 = new int[par.length()];

		for (int i = 0; i < niz1.length; i++) {

			niz1[i] = Metode.count(par, par.charAt(i));

		}

		System.out.println(Arrays.toString(niz1));
         
        int[] niz2 = Metode.zbrajanjekrajeva(niz1);
         
        System.out.println();
        
		System.out.println(ime1 + " i " + ime2 + " se vole " + niz2[0] + niz2[1] + "%");
        
        
	}	

}
