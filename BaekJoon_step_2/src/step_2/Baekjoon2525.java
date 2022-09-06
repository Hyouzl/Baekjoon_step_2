package step_2;

import java.util.*;



public class Baekjoon2525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
	
		int t = scan.nextInt();
		
		if (t < 60) {
			if (m + t >= 60) {
				h++;
				if (h == 24) {
					h = 0;
				}
				if (h > 24) {
					h = h -24;
				}
				m = m + t - 60;
				System.out.println(h + " " + m);
			}
			else {
				m += t;
				System.out.println(h + " " + m);
			}
		}
		else if (t >= 60) {
				int a = t / 60;
				int r = t % 60;
				
				h += a;
			
				if (m + r >= 60) {
					h++;
					m = m + r - 60;
				}
				else {
					m = m + r;
				}
				
				if (h == 24) {
					h = 0;
				}
				
				if (h > 24) {
					h = h -24;
				}
				System.out.println(h + " " + m);
		}
		
	}

}
