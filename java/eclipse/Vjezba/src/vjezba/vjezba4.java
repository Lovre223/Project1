package vjezba;

import javax.swing.JOptionPane;

public class vjezba4 {

	public static void main(String[] args) {
		
		int br1 = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj: "));
		
		int br2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi  broj: "));
		
		
		if (br1<br2) {
			
			System.out.println(br2);
		
		}else if (br1>br2) {
			
			System.out.println(br1);
			
		}else {
			
			System.out.println(0);
		}
		
		
	}
		
	
}
