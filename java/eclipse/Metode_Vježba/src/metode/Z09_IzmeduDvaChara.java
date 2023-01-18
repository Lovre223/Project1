package metode;

public class Z09_IzmeduDvaChara {

	public static void printChar(char char1, char char2, int n) {
		
		for(int i = 1;char1<=char2; i++,char1++) {
			
			System.out.print(char1 + " ");  
			
			
			if(i%n == 0) {
				
				System.out.println("");
			}
			
			
			
		}
		
		System.out.println("");
		
	}
	
	public static void main(String[] args) {
		
		printChar('A', 'Z', 20);
		printChar('A','Z', 20);
		
	}

}
