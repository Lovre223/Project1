package vjezba;

public class Z03 {

//PRORACUN ARITMETICKE SREDINE
	
	public static void main(String[] args) {
		
			int i = 0;
			int br = 3;	
			int suma = 0;

			int sredina = 0; 
			
			while(br <=8) {
				
				suma = suma + br;
				i++;
				br++;
				
				
			}
			
		sredina = suma/i;
		
		System.out.println(sredina);
		
	}
	
	
}
