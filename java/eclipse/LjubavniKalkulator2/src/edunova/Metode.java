package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Metode {

	public static int count(String s, char a) {

		if (s.length() == 0) {

			return 0;
		}

		if (s.charAt(0) == a) {

			return 1 + count(s.substring(1), a);
		}

		else {

			return count(s.substring(1), a);
		}

	}

	public static String obavezanUnosStringa(String poruka) {

		String s = "";

		while (s.length() == 0) {

			s = JOptionPane.showInputDialog(poruka);

			if (s.length() > 0) {

				return s;

			}

		}

		return "";

	}

	public static int[] zbrajanjekrajeva(int[] a) {

		if (a.length == 2) {

			return a;

		} else {

			if (a.length % 2 == 0) {

				int[] a2 = new int[a.length / 2];

				for (int i = 0; i < a2.length; i++) {

					a2[i] = a[i] + a[a.length - 1 - i];

				}

				System.out.println(Arrays.toString(makniViseznamenkaste(a2)));

				return zbrajanjekrajeva(makniViseznamenkaste(a2));

			} else {

				int[] a2 = new int[(a.length / 2) + 1];

				for (int i = 0; i < a2.length; i++) {

					if (i == a2.length - 1) {

						a2[i] = a[(a.length / 2)];

					} else {

						a2[i] = a[i] + a[a.length - 1 - i];

					}

				}

				System.out.println(Arrays.toString(makniViseznamenkaste(a2)));

				return zbrajanjekrajeva(makniViseznamenkaste(a2));

			}

		}

	}

	public static int[] makniViseznamenkaste(int[] unos) {
		int counter = 0;
		for (int i : unos) {
			if (i >= 10) {
				counter++;
			}
		}
		int[] bezViseznamenkastih = new int[unos.length + counter];

		for (int i = 0, j = 0; i < unos.length; i++) {
			if (unos[i] < 10) {
				bezViseznamenkastih[j++] = unos[i];
			} else {
				bezViseznamenkastih[j++] = (unos[i] / 10);
				bezViseznamenkastih[j++] = (unos[i] % 10);

			}
		}

		return bezViseznamenkastih;

	}

}
