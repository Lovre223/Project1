package edunova;

import java.util.Scanner;

public class Z01 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.print("Učitaj veličinu niza: ");
		int n = ulaz.nextInt();

		int niz[] = new int[n];

		for (int i = 0; i < niz.length; i++) {

			System.out.print((i + 1) + ". član" + ": ");

			niz[i] = ulaz.nextInt();

		}

		try {
			for (int i = 0; i < niz.length; i++) {

				if ((niz[i] + niz[i + 1]) % 2 == 0) {

					System.out.println(niz[i] + " " + niz[i + 1]);

				}

			}

		} catch (Exception e) {
			System.out.println("Izašao si iz granica niza");
		}

	}

}
