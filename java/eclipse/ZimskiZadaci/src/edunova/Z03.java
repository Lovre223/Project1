package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {
		
	 int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj: "));
	 
	 int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj: "));
	 
		int min = a<b ? a:b;
		int max = a>b ? a:b;
	 
	 for (int i = min; i<max;i++) {
		 
		 	if(i%2 != 0) {
		 		
		 		System.out.println(i);
		 	}
		 
	 }
		
		
	}

}
