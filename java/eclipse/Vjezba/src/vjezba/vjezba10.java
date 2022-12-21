package vjezba;

public class vjezba10 {

		public static void main(String[] args) {
			
			int br_boca = 10;
			
			String rijec = "boca";
			
			while (br_boca > 0) {
				
				if (br_boca == 1) {
					
					rijec = "bocu";
					
					}
				
				System.out.println(br_boca + " " + "zelenih " + rijec + " na zidu.");
				
				System.out.println("Jedna padne.");
				
				br_boca = br_boca -1;
				
				if(br_boca > 0) {
					
					System.out.println(br_boca + " Boce su na zidu.");
					
				}else {
					
					System.out.println("Nema vise boca.");
					
				}
				
				
			}
			
			
			
		}
}
