import java.util.Scanner;

public class Solution3314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int sum = 0;
			for(int i=0; i<5; i++) {
				int tmp = sc.nextInt();
				sum += tmp < 40 ? 40 : tmp;
			}
			System.out.println("#"+tc+" "+sum/5);
		}
	}
}
