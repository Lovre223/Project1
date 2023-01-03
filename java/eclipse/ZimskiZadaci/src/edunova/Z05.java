package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {
		
		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova: "));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca: "));
		
		
		int mat1[][] = new int[red][stupac];
		
			for (int i = 0   ; i <= red - 1;i++) {
				
				for (int j = stupac - 1 ; j >= 0;j--) {
					
					
					
					
					mat1[i][j] = j + 1 ;
					
					
					
					
					
					
				}
				
				
				
				System.out.println();
			}
			
			
			
		System.out.print(Arrays.deepToString(mat1));
		
	}
	
	
}
