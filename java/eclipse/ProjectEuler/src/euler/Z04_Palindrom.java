package euler;

public class Z04_Palindrom {
	
	public static void main(String[] args) {
		
		      int umno = 1, br = 0, digit = 0;
		      int max = 0;
		
		      boolean palindrom = true;
		      
	        for(int i = 100; i<=999;i++) {
	        	
	        	
	        	for (int j = 100; j<=i; j++) {
	        		
	        		 umno = i*j;
	        		
	        		 
	        	int	novi_broj = 0;
	        		 
	        	
	        	
	        	br = umno;
	        
	        		while(br>0) {
	        			
	        			digit = br%10;
	        			
	        			novi_broj = novi_broj*10 + digit;
	        			
	        			br = br/10;
	        			
	        			}
	        		
	        	       
	        		while(novi_broj == umno) {
	        			
	        		      if(novi_broj>max)	{
	        		    	  
	        		    	  max = novi_broj;
	        		    	  
	        		    }else {
	        		    	palindrom = false;
	        		    	break;
	        		    	
	        		    }
	        		      
	        		      
	        		      
	        		 }
	        			 
	        		 }
	        			      		
	        	
                           }	        			
	        			
	        			System.out.println(max);
	        			
	        	}
	        		
	             
	        		
	     	}	        	

		
	        
	
		
		
	
	

