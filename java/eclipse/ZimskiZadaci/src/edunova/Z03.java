package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {
		
	 int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj: "));
	 
	 int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj: "));
	 
	
	 boolean prim = true;
		
	 for (int i = a; i<b;i++) {
		 
		int brojac = 0;
		 
		 for (int j = 2 ; j<i;j++) {
			 
			  if (i%j == 0) {
				  
				  prim = false;
				  break;
				  
				  }
	    
	
			  

	}
		 if (prim) {
			 
			 System.out.println(i);
			 
		 }
		 
			  
			   }
			  
		     }   
	 
		 
	     }	
	 
		 

		
		
	


