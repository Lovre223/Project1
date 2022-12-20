package vjezba;

import javax.swing.JOptionPane;

public class vjezba7 {
	
	public static void main(String[] args) {
		 
            int br1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj: "));
            
            int br2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj: "));
            
            
            if (br1 %2 == 0 & br2 %2 == 0) {
            	
            	System.out.println("Zbroj iznosi: " + (br1 + br2));
            	
            } else {
            	
            	System.out.println("Razlika: " + (br1 - br2));
            	
            }
		
	}

}
