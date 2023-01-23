package euler;

import java.math.BigInteger;

public class Z20_Faktorijela {

	public static void main(String[] args) {

		int n = 100, f = 1, k = 1;

		BigInteger K = BigInteger.valueOf(k);

		BigInteger F = BigInteger.valueOf(f);

		BigInteger N = BigInteger.valueOf(n);

		for (BigInteger I = BigInteger.valueOf(n); I.compareTo(BigInteger.ONE) > 0; I = I.subtract(BigInteger.ONE)) {

			F = F.multiply(I.subtract(K));

		}

		BigInteger SUMA = F.multiply(N);

		System.out.println(SUMA);

		BigInteger r = BigInteger.valueOf(10);
		BigInteger sum = BigInteger.ZERO;

		BigInteger ZBROJ = BigInteger.ZERO;

		BigInteger digit = BigInteger.ZERO;

		while (SUMA.compareTo(sum) > 0) {

			digit = SUMA.remainder(r);

			ZBROJ = digit.add(ZBROJ);

			SUMA = SUMA.divide(r);

		}
		
		System.out.println(ZBROJ);

	}

}
