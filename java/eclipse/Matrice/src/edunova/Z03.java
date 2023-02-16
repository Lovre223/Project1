package edunova;

import java.util.Scanner;

public class Z03 {
	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int r = ulaz.nextInt();

		System.out.print("Unesite broj stupaca: ");
		int s = ulaz.nextInt();

		int mat[][] = new int[r][s];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < s; j++) {
				// System.out.print("Unesi broj u matricu: ");

				mat[i][j] = i;

			}

		}

		System.out.println();
		System.out.println("ISPIS MATRICE");

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < s; j++) {

				System.out.print(mat[i][j] + " ");

			}

			System.out.println();

		}

		System.out.println();

		System.out.println("ISPIS SUME");

		int suma = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < s; j++) {

				if (i == 2) {

					suma += mat[i][j];

				}

			}

		}

		System.out.println(suma);
		System.out.println();

		System.out.println("ARITMETIČKA SREDINA NA GLAVNOJ DIJAGONALI");
		double arit = 0;
		int count = 0;
		suma = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < s; j++) {

				if (i == j) {

					suma += mat[i][j];
					count++;

				}

			}

		}
		arit = suma / count;
		System.out.println("Aritmetička sredina iznosi: " + arit);

		System.out.print("Aritmetička sredina ispod sporedne dijagonale: ");
		count = 0;
		suma = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < s; j++) {

				if (i + j > mat.length - 1) {

					suma += mat[i][j];
					count++;
				}

			}

		}
		
		System.out.println(aritmetickasredina(suma,count));

	}

	private static double aritmetickasredina(double suma, int count) {
		double arit = 0;
		
		arit = suma/count;
		
		return arit;
	}

}
