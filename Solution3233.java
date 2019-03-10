import java.util.Scanner;

public class Solution3233 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("#"+tc+" "+(long)(A/B)*(A/B));
		}
	}
}
