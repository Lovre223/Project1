package vjezba;

import javax.swing.JOptionPane;

//ZBROJ FAKTORIJELA

public class Z04 {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi raspon: "));
		
		int i = 1, p = 1, s=0;
		
		
		while(i<=n) {
			
			p = p*i;
			s = s + p;
			
			i++;
			
			
			
		}
		
		System.out.println(p);
		
		
	}
	
	

}
