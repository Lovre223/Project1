package metode;

public class Z04_BrojanjeSamoglasnika {

	public static int brojac(String a) {

		int count = 0;
	
		for (int i = 0; i< a.length();i++) {
			
			if( a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
				
				count++;
				
				
			}
			
			
			
		}
		
		
		
		return count;

	}

	public static void main(String[] args) {

		String rijec = "slovo";
		
		System.out.println("Broj samoglasnika iznosi " + Z04_BrojanjeSamoglasnika.brojac(rijec));
	
	
	}

}
