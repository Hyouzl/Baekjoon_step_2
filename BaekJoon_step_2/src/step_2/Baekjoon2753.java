package step_2;

import java.util.*;

public class Baekjoon2753 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if (n % 100 != 0 && n % 4 == 0 || n % 400 == 0) {
			System.out.println("1");
		}

		else {
			System.out.println("0");
		}
	}

}
