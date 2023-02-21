package metode;

import java.util.Scanner;

public class Z11_IspravnaLozinka {

	public static void main(String[] args) {

		while (true) {

			System.out.print("Unesi lozinku: ");
			Scanner ulaz = new Scanner(System.in);

			String p = ulaz.next();

			if (provjeralozinke(p)) {

				System.out.println("Lozinka je valjana");
				break;
			} else {

				System.out.println("Lozinka nije valjana");
				continue;

			}
		}
	}

	private static boolean provjeralozinke(String p) {

		int countSlova = 0;

		int countBrojeva = 0;

		if (p.length() < 8) {

			return false;

		}

		for (int i = 0; i < p.length(); i++) {

			char znak = p.charAt(i);

			if (znakJeBroj(znak)) {

				countBrojeva++;

			} else if (znakJeSlovo(znak)) {

				countSlova++;

			}

		}

		if (countBrojeva >= 2) {

			return true;

		}

		else {

			return false;

		}

	}

	private static boolean znakJeBroj(char znak) {
		if (znak >= '0' && znak <= '9') {

			return true;
		} else {
			return false;

		}
	}

	private static boolean znakJeSlovo(char znak) {

		if ((znak >= 'a' && znak <= 'z') || (znak >= 'A' && znak <= 'Z')) {

			return true;

		} else {

			return false;

		}

	}

}
