package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z01 {
	
	public static void main(String[] args) {
		
		int br = Integer.parseInt(JOptionPane.showInputDialog("Unesi veličinu niza: "));
		
		int max_br = 0;
		int suma = 0;
		int niz[] = new int[br];
		
		
		for (int i = 0; i< niz.length;i++) {
			
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj na " + (i+1) + ". mjesto"));
			
			System.out.println("Broj u nizu je: " + niz[i]);
			
			if (niz[i] > max_br) {
				
				 max_br = niz[i];
				
			}
			
				suma = suma + niz[i];
			
			}
	 	
		System.out.println();
		System.out.println("Niz izgleda ovako: " + Arrays.toString(niz));
		System.out.println();
		System.out.println("Najveći broj u nizu iznosi: " + max_br);
		System.out.println("Suma brojeva iznosi: " + suma);
		
		
		
	}

}
