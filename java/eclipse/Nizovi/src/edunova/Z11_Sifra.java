package edunova;

import java.util.Scanner;

public class Z11_Sifra {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesi riječ: ");

		String rijec = ulaz.next();

		System.out.println(sifrirano(rijec));
		
		System.out.println('a' + 5);

	}

	private static String sifrirano(String rijec) {

		String kodiranaRijec = "";

		for (char slovo : rijec.toCharArray()) {

			int rotacijaSlova = slovo + 5;

				if(rotacijaSlova > 122) {
					
					kodiranaRijec += (char)(rotacijaSlova - 26);
					
				}else {

				kodiranaRijec += (char) rotacijaSlova;
				}
		}

		return kodiranaRijec;
	}

}
