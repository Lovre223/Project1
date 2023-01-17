package vjezba;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj: "));
		
		int k = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj: "));
		
		int i = 1, suma = 0;
		
		while (i<=n) {
			
			suma = (i/(k+(i-1))) + suma;
			
			i++;
			
		}
		
		System.out.println(suma);
		
	}
	
}
