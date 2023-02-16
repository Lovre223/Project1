package euler;

import java.util.Arrays;

public class Z02_FibonacciParnihBrojeva {
	
	public static void main(String[] args) {
		
		
		int suma1 = 0, suma2 = 0;
		                 
		
		
		int a = 1 , b = 0;
		
		
	  while (a < 4000000) {
		   suma1 = a + b;
			
			a = b ; 
			
			b = suma1;
			
		
			
			
			if( suma1 %2 == 0 ) {
				
				suma2 = suma2 + suma1;
				
				
				
				
			}
			
		
			
		}
		
		System.out.println(suma2);
		
		
		
	}

}
