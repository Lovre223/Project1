package edunova;

import java.util.Arrays;
import java.util.Scanner;

public class Z02 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesi broj redova: ");
		int r = ulaz.nextInt();

		System.out.print("Unesi broj stupaca: ");
		int s = ulaz.nextInt();

		int mat[][] = new int[r][s];

		for (int i = 0; i <= mat.length - 1; i++) {

			for (int j = 0; j <= mat[i].length - 1; j++) {

				System.out.print("Na položaj [" + i + "][" + j + "] unesi broj: ");
				mat[i][j] = ulaz.nextInt();

			}

		}

		System.out.println();

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.print(mat[i][j] + " ");

			}

			System.out.println();

		}
		System.out.println();

		int max = 0;
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				if ((i < mat.length - 1) && (j < mat[i].length - 1) && (i + j != mat.length - 1) && max < mat[i][j]) {
					
					max = mat[i][j];

				}

			}

		}

		System.out.println(max);
		
		
		
		
		
	}

}
