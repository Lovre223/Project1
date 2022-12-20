package vjezba;

import javax.swing.JOptionPane;

public class vjezba2 {

		public static void main(String[] args) {
			
			int br = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj: "));
			
			if (br<=10) {
				
				System.out.println("Osijek");
			
			}else {
				
				System.out.println("Donji Miholjac");
				
			}
			
			
			
			
		}
}
