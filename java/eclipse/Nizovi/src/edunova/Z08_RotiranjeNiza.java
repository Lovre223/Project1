package edunova;

import java.util.Arrays;

public class Z08_RotiranjeNiza {

	public static void main(String[] args) {

		int niz[] = { 1, 2, 3, 4, 5, 6 };
		
		System.out.println(niz[niz.length-1]);

		rotiranjeNiza(niz);

		System.out.println(Arrays.toString(niz));

	}

	private static void rotiranjeNiza(int[] niz) {
			
		
		int br = niz[niz.length-1];
		for (int i = niz.length-1; i > 0; i--) {
			
			niz[i] =niz[i-1];

		}

		niz[0] = br;

	}

}
