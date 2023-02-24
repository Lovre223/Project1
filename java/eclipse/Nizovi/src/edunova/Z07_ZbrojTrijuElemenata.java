package edunova;

public class Z07_ZbrojTrijuElemenata {

	public static void main(String[] args) {

		int niz[] = { 1, -2, 0, 5, -1, -4 };
		
		int br = 2;
		
		
		for(int i = 0;i<niz.length;i++) {
			for(int j = 0; j<niz.length;j++) {
				for(int k = 0; k<niz.length;k++) {
					
					if( (niz[i] + niz[j] + niz[k] == br) && (niz[i]<niz[j] && niz[j]<niz[k] && niz[i] < niz[k]) ) {
						
						System.out.println(niz[i] + " " + niz[j] + " " + niz[k]);
						
					}
					
					
				}
				
				
			}
		}
		

	}

}
