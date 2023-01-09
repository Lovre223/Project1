package vjezba;



// PRIKAZ SVIH INTEGERA IZMEĐU 100 I 150 ČIJA SUMA ZNAMENKI JE PARAN BROJ
public class vjezba12 {

	public static void main(String[] args) {
		
		for (int i = 100; i<150; i++) {
			
			int br = i;
			
			int sum = 0;
			
			while (br!=0) {
				
				int digit = br%10;
				
				sum = sum + digit;
				
				br = br/10;
				
				
			}
			
			if (sum%2==0) {
				
				System.out.println(i);
				
			}
			
			
		}
			
	}
		
		
}
	

