package edunova;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Z01_ElementiNaGlavnojDijagonali {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.print("Red: ");
		int r = ulaz.nextInt();

		System.out.print("Strupac: ");
		int s = ulaz.nextInt();

		int mat[][] = new int[r][s];

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.print("Na položaj [" + i + "][" + j + "] upiši broj:  ");
				mat[i][j] = ulaz.nextInt();

			}

		}
		System.out.println();
		System.out.println("ISPIS MATRICE");

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.print(mat[i][j] + "\t");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("ISPIS GLAVNE DIJAGONALE");

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				if (i == j) {

					System.out.print(mat[i][j] + " ");

				}
				
				
			}
			
		}

		System.out.println();
		System.out.println("ISPIS MATRICE SA PPRAZNINOM");

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				if (i == j) {

					System.out.print(" " + " ");

				} else {

					System.out.print(mat[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("ISPIS SPOREDNE DIJAGONALE");

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {
				
				if(i + j == mat.length - 1) {
					
					System.out.print(mat[i][j] + " ");
					
				}else {
					
					System.out.print(" " + " " );
					
				}
				
				

			}
			System.out.println();
		}
		
	}

}
