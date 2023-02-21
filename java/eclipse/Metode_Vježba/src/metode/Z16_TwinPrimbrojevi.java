package metode;

public class Z16_TwinPrimbrojevi {

	public static void main(String[] args) {

		for (int i = 2; i < 100; i++) {

			if (provjeraprimbrojeva(i) && provjeraprimbrojeva(i+2)) {

				System.out.println("(" + i + "," + (i + 2) + ")");

			}

		}

	}

	private static boolean provjeraprimbrojeva(int br) {

		int count = 0;

		for (int i = 1; i <= br; i++) {

			if (br % i == 0) {

				count++;

			}

		}

		if (count == 2) {

			return true;

		} else {

			return false;
		}

	}

}
