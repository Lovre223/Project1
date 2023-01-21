package edunova;

import javax.swing.JOptionPane;

public class Metode {

	public static int count(String s, char a) {

		if (s.length() == 0) {

			return 0;
		}

		if (s.charAt(0) == a) {

			return 1 + count(s.substring(1), a);
		}

		else {

			return count(s.substring(1), a);
		}

	}

	public static String obavezanUnosStringa(String poruka) {

		String s = "";

		while (s.length() == 0) {

			s = JOptionPane.showInputDialog(poruka);

			if (s.length() > 0) {

				return s;

			}

		}

		return "";

	}
	
	
	

		
		
		
		
	}
	
	
	

}
