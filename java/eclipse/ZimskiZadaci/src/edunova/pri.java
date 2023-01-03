package edunova;



import javax.swing.JOptionPane;

public class pri {

	public static void main(String[] args) {
		
		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova: "));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca: "));
		
		
		int mat1[][] = new int[red][stupac];
		
			for (int i = red; i > 1;i--) {
				
				for (int j = 0; j<stupac;j++) {
					
					mat1[i][j] = i;
					
					System.out.print(mat1[i][j] + " ");
				}
				
				
				System.out.println();
			}
			
			
			
		
		
	}
	
	
}
