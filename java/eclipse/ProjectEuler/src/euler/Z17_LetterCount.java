package euler;

public class Z17_LetterCount {
	
	private static String getCharForNumber(int i) {
	    char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	    if (i > 25) {
	        return null;
	    }
	    return Character.toString(alphabet[i]);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(getCharForNumber(1));
		
		
	}

}
