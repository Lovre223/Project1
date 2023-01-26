package euler;


public class Z14_CollatzSequence {

	public static void main(String[] args) {

		long a = 10, max = 0, brojaci = 0;

		for (long i = a; i <= 1000000; i++) {
                
			brojaci = metoda(i);
		
			if(brojaci>max) {
				
				max = brojaci;
				
				System.out.println(i);
				System.out.println(max);
				
				System.out.println();
				
				
			}
			
		  
			
			

		}

		System.out.println(max);
		
	}

	public static long metoda(long a) {
		long b = 0, brojac = 0;
		
		//System.out.println(a);

		while (a > 1) {

			if (a % 2 == 0) {

				b = a / 2;

				a = b;

				

				brojac++;

			} else {

				b = 3 * a + 1;
				a = b;
			

				brojac++;
			}
		}

		

		return (brojac+1);
		
	}


  

}









