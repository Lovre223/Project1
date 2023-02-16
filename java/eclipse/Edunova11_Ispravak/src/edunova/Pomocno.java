package edunova;

import java.math.BigDecimal;
import java.util.Scanner;

public class Pomocno {

	public static Scanner ulaz;
	public static boolean DEV;

	public static int unosBrojRaspon(String poruka, int min, int max) {
		int i;

		while (true) {

			try {

				System.out.println(poruka);

				i = Integer.parseInt(ulaz.nextLine());
				if (i < min || i > max) {

					System.out.print("Broj mora biti između " + min + " i " + max);
					continue;

				}

				return i;

			} catch (Exception e) {
				System.out.println("Niste unijelei broj");
			}

		}

	}

	public static String unosTeksta(String poruka) {

		String s;

		while (true) {

			System.out.println(poruka);

			s = ulaz.nextLine();

			if (s.trim().isEmpty()) {

				System.out.println("Obavezan unos");
				continue;
			}
			return s;
		}

	}

	public static boolean unesiboolean(String poruka) {

		System.out.println(poruka);

		String string = ulaz.next();

		while (true) {
			if (string == "Da") {

				return true;

			}
			if (string == "Ne") {

				return false;

			} else {

				continue;
			}
		}

	}

	public static BigDecimal unosdecimala(String poruka) {
		
		System.out.println(poruka);
		
		BigDecimal d = ulaz.nextBigDecimal();	
		
		return d;
	}
}
