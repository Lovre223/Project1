package edunova;

public class Z06_SumaDvajuElemanata {
	
	public static void main(String[] args) {
				
			int niz[] = {1,2,3,4,5,6};
			int br = 6;
			
			for(int i = 0;i<niz.length; i++) {
				for(int j = 0; j<i; j++) {
					
					if(niz[i]+niz[j] == br) {
						
						System.out.println(niz[i] + " " + niz[j]);
						
					}
					
					
				}
				
				
			}
		
		
	}

}
