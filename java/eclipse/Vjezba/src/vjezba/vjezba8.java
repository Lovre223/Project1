package vjezba;

import javax.swing.JOptionPane;

//DODATNI ZADACI - ispiši tablicu množenja za broj koji korisnik unese

public class vjezba8 {

	public static void main(String[] args) {
		
		int br = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj: "));
		
		
		for (int i = 0; i <=10; i++ ) {
			
			System.out.println(br + " * " + i + " = " + (br*i));
			
		}
		
		
	}
	
}
