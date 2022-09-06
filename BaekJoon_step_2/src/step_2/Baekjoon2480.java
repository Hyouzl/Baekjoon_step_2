package step_2;
import java.util.*;
public class Baekjoon2480 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = scan.nextInt();
		}


		int money = 0;
		int key = 0;
		int cnt = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (arr[i] == arr[j]) {
					cnt++;
					key = arr[i];
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		if (cnt == 3) {
			money = 10000 + arr[0] * 1000;
		}
		else if (cnt == 1) {
			money = 1000 + key * 100;
		}
		else {
			money = max * 100;
		}
		
		System.out.println(money);
	}

}
