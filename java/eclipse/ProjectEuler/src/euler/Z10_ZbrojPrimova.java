package euler;

public class Z10_ZbrojPrimova {
	
	public static void main(String[] args) {



		long suma = 0;
		
		  for( int i = 2 ; i <=2000000  ; i++) {
			  if(Z10_ZbrojPrimova.prim(i)) {
				  
				  suma = suma + i;
				  
			  }
			
	}
	
	System.out.println(suma);
	
}

	
	public static boolean prim(long n) {
		
		
		
	    for (int i = 2;i< n;i++) {
	       	
	         if(n%i ==0) {
	        	 
	        	 return false;
	        	 
	         }
	    
	    
	    }
	
	        return true;
	}	
	

}