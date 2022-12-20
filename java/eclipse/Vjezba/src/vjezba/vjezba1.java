package vjezba;

import javax.swing.JOptionPane;

public class vjezba1 {
	
	public static void main(String[] args) {
		
		int br = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj: "));
		
		
		if (br %2 == 0) {
			
			System.out.println("Broj je paran");
			
		}else {
			
			
			System.out.println("Broj nije paran");
			
			
		}
		
		
	}

	
	
	

}



