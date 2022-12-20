package vjezba;

import javax.swing.JOptionPane;

public class vjezba5 {

	public static void main(String[] args) {
		
		int br1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj: "));
		
		int br2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi  broj: "));
		
		int br3 = Integer.parseInt(JOptionPane.showInputDialog("Upiši treći  broj: "));
		
		if (br1 > br2 & br1>br3) {
			
			System.out.println("Najveći broj je: " + br1);
		
		}else if (br2 > br1 & br2 > br3) {
			
			System.out.println("Najveći broj je: " + br2);
		
		}else if (br3 > br1 & br3 > br2) {
			
			System.out.println("Najveći broj je: " + br3);
		
		
		}
		
	}
	
	
}
