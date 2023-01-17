package metode;

import javax.swing.JOptionPane;

public class Z01_NajmanjiBroj {
 
     public static void main(String[] args) {
		
    	 double br1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj: "));
    	 
    	 double br2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj: "));
    	 
    	 double br3 = Integer.parseInt(JOptionPane.showInputDialog(" Unesi treći broj: "));
    	 
    	 
    	// System.out.println(Z01_NajmanjiBroj.NajmanjiBroj(br1, br2, br3));
    	 System.out.println(Z02_Prosjek.avg(br1, br2, br3));
    	 
	}	
	
	
	
	
	
	public static int NajmanjiBroj(int a, int b, int c) {
		
		if(a<b && a<c) {
			
			return a;
		}
		
		if(b<c && b<a) {
			
			return b;
		}
		
		
		return c;
	}
	
	
	
	
	
}








