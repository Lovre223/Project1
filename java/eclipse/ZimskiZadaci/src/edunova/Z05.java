package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {
		
		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova: "));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca: "));
		
		
		int mat1[][] = new int[red][stupac];
		
		int PrviRed = 0;
		int ZadnjiRed = red - 1;
		
		
		int PrviStupac = 0;
		int ZadnjiStupac = stupac - 1;
		
		
		int polje = 1;
		
		while (polje<= red*stupac) {
			
			for (int i = ZadnjiStupac ; i>=PrviStupac; i--  ) {
				
				mat1[ZadnjiRed][i] = polje++;
				
			}
			
			
			for (int i = ZadnjiRed - 1; i>=PrviRed; i-- ) {
				
				mat1[i][PrviStupac] = polje++; 
				
			}
			
			for (int i = PrviStupac + 1 ; i <= ZadnjiStupac  ; i++) {
				
				mat1[PrviRed][i] = polje++;
				
				
			}
			
			for(int i = PrviRed + 1 ; i<=ZadnjiRed - 1 ; i++) {
				
				mat1[i][ZadnjiStupac] = polje ++;
				
				
			}
			
			
			
			
			ZadnjiRed = ZadnjiRed - 1;
			ZadnjiStupac = ZadnjiStupac - 1;
			
			PrviStupac = PrviStupac + 1;
			PrviRed = PrviRed + 1;
			
			
			
			
		}
		
		
		for (int i = 0; i < red;i++) {
			
			for (int j = 0;j<stupac;j++) {
				
				System.out.print(mat1[i][j] + " \t ");
				
			}
			
			System.out.println();
			
			
		}
		
		
		
			
			
		
		
	}
	
	
}
