package vjezba;

import javax.swing.JOptionPane;

public class vjezba3 {

		public static void main(String[] args) {
			
			int br1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj: "));
			
			int br2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj: "));
			
			int sum = br1 + br2;
			
			if(sum>=10) {
				
				System.out.println(sum + " Osijek");
		
			}else {
				
				System.out.println("Edunova");
				
			}
			
		}
	
}
