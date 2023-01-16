package euler;

public class Z06 {
	
	
	public static void main(String[] args) {
		
		int suma1 = 0;
		int suma2 = 0;
		
		
			for (int i = 0; i <= 100; i++) {
				
				suma1 = suma1 + i*i;
				
				suma2 = suma2 + i;
			}
			
		
		System.out.println(suma2*suma2 - suma1);
		
		
		
		
	}

}
