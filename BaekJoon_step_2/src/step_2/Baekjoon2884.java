package step_2;

import java.util.*;

public class Baekjoon2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if (m < 45) {
			if ( h == 0 ) {
				h = 24;
			}
			h--;
			m = m + 60 - 45;
			System.out.println(h + " " + m);
		}
		
		else {
			m = m - 45;
			System.out.println(h + " " + m);
		}
	}

}
