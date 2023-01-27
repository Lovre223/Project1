package euler;

import java.math.BigInteger;

public class Z16_PowerDigitSum {

	public static void main(String[] args) {

		int suma = 0, digit = 0, br = 2, ex = 1000, result = 0;

		BigInteger R = BigInteger.valueOf(result);

		BigInteger BR = BigInteger.valueOf(br);

		BigInteger S = BigInteger.valueOf(suma);

		BigInteger D = BigInteger.valueOf(digit);
		
		BigInteger ZERO = BigInteger.ZERO;
		
		BigInteger T = BigInteger.valueOf(10);
		
		R = BR.pow(ex);
		
		System.out.println(R);
		
		System.out.println();
		
		
		while(R.compareTo(ZERO) > 0) {
			
			 D = R.remainder(T);
			 
			 S = D.add(S);
			
			 R = R.divide(T);
			
			
		}
		
		System.out.println(S);
		
		

	}

}
