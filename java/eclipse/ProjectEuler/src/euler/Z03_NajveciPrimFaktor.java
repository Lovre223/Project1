package euler;

public class Z03_NajveciPrimFaktor {
	
	public static void main(String[] args) {
		
		long br = 600851475143l;
		
		long new_num = 0;
		
		for(long i = 2; i<=br;i++) {
			
			if (br%i == 0) {
				
				new_num = i;
				
				int brojac = 0;
				
				for (long j = new_num; j>=1;j--) {
					
					if(new_num % j == 0) {
						
					      brojac ++;
						
					}
					
				
					
				}
				
			     if(brojac == 2) {
			    	 
			    	 System.out.println(new_num);
			    	 
			     }
				
				
			}
			
			
		}   
		
	}

}
