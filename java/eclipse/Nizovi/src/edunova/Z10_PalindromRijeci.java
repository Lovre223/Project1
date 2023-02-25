package edunova;

import java.util.Scanner;

public class Z10_PalindromRijeci {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		String rijec = ulaz.next();
		
		System.out.println(rijec.length());

		if (rijecJePalindrom(rijec)) {

			System.out.println("Riječ je pakindrom!!!");

		} else {

			System.out.println("Riječ nije palindrom");

		}

	}

	private static boolean rijecJePalindrom(String rijec) {

		int brojac = 0;

		char niz[] = new char[rijec.length() + 1];

		for (int i = rijec.length() - 1; i > 0; i--) {

			niz[i] = rijec.charAt(i);

		}

		for (int i = 0, j = rijec.length() - 1; i < rijec.length(); i++, j--) {

			if (niz[i] == rijec.charAt(j)) {

				brojac++;

			}

		}

		if (brojac == rijec.length() - 1) {

			return true;
		} else {

			return false;
		}

	}

}
