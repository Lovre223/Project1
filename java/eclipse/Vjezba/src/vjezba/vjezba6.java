package vjezba;

import javax.swing.JOptionPane;

public class vjezba6 {

		public static void main(String[] args) {
			
			int br = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 1 i 999: "));
			
			
			if (br > 1 & br < 999 ) {
				
				System.out.println("Broj " + br +  " je u tom raspon.");
				
				if (br > 1 & br < 99) {
					
					System.out.println(br/10);
				
				} else {
					
					System.out.println(br/100);
				}
				
			}else {
				
				System.out.println(br +" Greška");
				
			}
			
		}
	
}
