package metode;

public class Z06_SumaZnamenki {

	public static int zbroj(int i) {
			
			int digit = 0, zbroj =0;
					
			while(i>0) {
				
				digit = i%10;
				
				zbroj = zbroj + digit; 
				
				i = i/10;
				
				
			}
			
			return zbroj;
			
		}

	
	public static void main(String[] args) {
		
		System.out.println(Z06_SumaZnamenki.zbroj(321));
		
	}
	
	
}
