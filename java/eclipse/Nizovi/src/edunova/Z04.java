package edunova;

public class Z04 {
	public static void main(String[] args) {

		int niz[] = { 25, 38, 42, 3, 2, 23, 1 };

		System.out.println("38 je na položaju " + pronadiIndex(niz, 38));
		
		
		
	}

	private static int pronadiIndex(int[] niz, int br) {
		
		for(int i = 0; i<niz.length;i++) {
			
			if(niz[i] == br) {
				
				
				return (i+1);
			}
			
			
		}
		
		
		return -1;
	}

}
