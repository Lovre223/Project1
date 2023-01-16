package euler;

public class Z09_PitagorinTriplet {

	
	public static void main(String[] args) {
		
		int c;	
		 
		for(int a = 1; a<1000;a++) {
			
			for (int b = 1; b<1000;b++ ) {
				
				c = 1000 - a - b;
				
				if((a*a + b*b == c*c) && a>b) {
					
					
					System.out.println(a*b*c);
					
				}
				
				
				
			}
			
		}
		
		
		
	}	
	
}
