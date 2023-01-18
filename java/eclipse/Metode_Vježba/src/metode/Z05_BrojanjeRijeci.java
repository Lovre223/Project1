package metode;

public class Z05_BrojanjeRijeci {
	
	
	public static int brojanje(String str) {
		
		int count = 0;
		
		for(int i = 0;i<str.length();i++) {
			
			if(str.charAt(i) == ' ') {
				
				
				count ++;
				
			}
			
			
		}
		
		return count + 1;
	}

	
	public static void main(String[] args) {
		
		String rec = "Ja sam Lovre";
		
		
		System.out.println(Z05_BrojanjeRijeci.brojanje(rec));
		
		
	}
	
	
}
