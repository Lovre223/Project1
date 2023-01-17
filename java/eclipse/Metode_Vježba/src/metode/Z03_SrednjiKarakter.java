package metode;

public class Z03_SrednjiKarakter {

	public static String srednji(String a) {

		int pozicija, duljina;

		if (a.length() % 2 == 0) {

			pozicija = a.length() / 2 - 1;

			duljina = 2;

		} else {

			pozicija = a.length() / 2;
			duljina = 1;

		}

		return a.substring(pozicija, pozicija + duljina);

	}

	public static void main(String[] args) {

		String rijec = "Zvonimir";

		System.out.println("Srednje slovo je " + Z03_SrednjiKarakter.srednji(rijec));
		System.out.println();
		System.out.println(rijec.length());

		System.out.println(rijec.substring(3, 5));

	}

}
