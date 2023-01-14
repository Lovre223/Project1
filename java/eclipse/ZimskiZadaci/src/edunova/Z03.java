package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {
		
	 int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj: "));
	 
	 int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj: "));
	 
	
	 for (int i = a; i<b;i++) {
		 
		int brojac = 0;
		 
		 for (int j = 2 ; j<i;j++) {
			 
			  if (i%j == 0) {
				  
				  brojac ++;
				  break;
				  
				  }
	    
	
			  

	}
		 if (brojac == 2) {
			 
			 System.out.println(i);
			 
		 }
		 
			  
			   }
			  
		     }   
	 
		 
	     }	
	 
		 

		
		
	


