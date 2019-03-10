import java.util.Scanner;

public class Solution3142 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			System.out.println("#"+tc+" "+(M*2-N)+" "+(M-(M*2-N)));
		}
	}
}
