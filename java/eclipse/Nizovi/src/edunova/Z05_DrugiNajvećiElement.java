package edunova;

import java.util.ArrayList;
import java.util.List;

public class Z05_DrugiNajvećiElement {
	public static void main(String[] args) {

		int niz[] = { 1, 9, 3, 8, 5, 10 };
	    List<Integer> max = new ArrayList<>();
	    int max1 = 0;
	    
	    
		for (int i = 0; i < niz.length ; i++) {
			
			System.out.println(i + 1);

			if (niz[i] > max1) {

				max1 = niz[i];
				max.add(niz[i]);
			
			}

		}

		System.out.println(max.get(0));

	}

}
