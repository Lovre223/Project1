package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
		
		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova: "));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca: "));
		
		
		int mat1[][] = new int[red][stupac];
		
		int mat2[][] = new int[red][stupac];
		
		int mat3[][] = new int [red][stupac];
		
		//PRVA MATRICA
		for (int i = 0 ; i<red; i++) {
			
			for(int j = 0; j<stupac;j++) {
				
				mat1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj u matricu: ")); 
				
				System.out.print(mat1[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("");
		
	//DRUGA MATRICA	
	for (int i = 0 ; i<red; i++) {
			
			for(int j = 0; j<stupac;j++) {
				
				mat2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj u matricu: ")); 
				
				System.out.print(mat2[i][j] + " ");
			}
			
			System.out.println();
		}

	System.out.println("");
	
	
	//ZBRAJANJE MATRICA
	for (int i = 0; i<red;i++) {
		
		for (int j = 0; j<stupac;j++) {
			
			mat3[i][j] = mat1[i][j] + mat2[i][j];
			
			System.out.print(mat3[i][j] + " ");
		}
		
		System.out.println();
	}
	
	
	}
	
}
