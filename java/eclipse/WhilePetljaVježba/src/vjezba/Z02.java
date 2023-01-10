package vjezba;

import javax.swing.JOptionPane;

//ISPIS RECIPROČNIH VRIJEDNOSTI PRVIH N BROJEVA
public class Z02 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj: "));
		double  i = 1;
		
		while(i < n ) {
			
			System.out.println("1/" + i + "=" + 1/i );
			
			i++;
			
			System.out.println();
		}
		
		
		
	}
	
}
