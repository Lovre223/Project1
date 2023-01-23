package euler;

public class Z12_TriangularniBroj {

	public static void main(String[] args) {

		int n = 1, br = 0;

		while (n >= 1) {

			br = n * (n + 1) / 2;

			if (brojac(br) >= 500) {

				break;

			}

			n++;

		}

		System.out.println(br);

	}

	public static int brojac(int a) {

		int brojac = 0;

		for (int i = 1; i < a + 1; i++) {

			if (a % i == 0) {

				brojac++;
			}

		}

		return brojac;

	}

}
