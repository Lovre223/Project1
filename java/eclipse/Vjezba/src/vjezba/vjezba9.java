package vjezba;


//ZAMJENA VARIJABLI
// TEMP - PRAZNA VARIJABLA KOJU KORISTIMO KAO ZAMJENU

public class vjezba9 {
	
	public static void main(String[] args) {
		
		int a = 34 , b = 42, temp, br1 = 100011;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a + " " + b + " " + (br1%10));
		
		
	}

}
