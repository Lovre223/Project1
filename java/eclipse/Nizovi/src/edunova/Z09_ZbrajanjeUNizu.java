package edunova;

import java.util.Arrays;
import java.util.Scanner;

public class Z09_ZbrajanjeUNizu {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		System.out.print("Koliko brojeva želiš unijeti: ");

		int br = ulaz.nextInt();
		int br1 = 0;

		int niz[] = new int[br];

		int count = 0;
		int suma = 0;

		while (count < br) {

			System.out.print("Unesi " + (count + 1) + ". broj: ");

			br1 = ulaz.nextInt();

			while (br1 > 500) {

				System.out.print("Broj mora bit manji od 500, ponovno unesi: ");
				br1 = ulaz.nextInt();

			}
			if (br1 < 500) {

				niz[count] = br1;
				
				suma += niz[count];

			}

			count++;

		}
		
		System.out.println("Ispisani niz: " + Arrays.toString(niz) + " i njegova suma: " + suma);

	}

}
