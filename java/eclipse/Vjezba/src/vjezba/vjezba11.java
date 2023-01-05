package vjezba;

import javax.swing.JOptionPane;

//PRIKAZANJE BROJA U OBRNUTOM REDOSLIJEDU I NJIHOVA SUMA
public class vjezba11 {
	
	public static void main(String[] args) {
		
		int br = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj: "));
		
		int rev = 0;
		
		int suma = 0;
		
		while (br != 0) {
			
			int digit = br%10;
			
			suma = suma + digit;
			rev =(rev*10) + digit;
			
			br = br/10;
			
			
		}
		
		System.out.println("Obrnuti broj iznosi: " + rev);
		System.out.println("Suma brojeva iznosi: " + suma);
	}

}
