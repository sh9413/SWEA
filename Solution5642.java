import java.io.BufferedReader;
import java.util.Scanner;

public class Solution5642 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T; tc++) {
			int N = sc.nextInt();
			int[] ar = new int[N];
			int[] dp = new int[N];
			for(int i=0;i<N;i++) {
				ar[i] = sc.nextInt();
			}
			int max = Integer.MIN_VALUE;
			dp[0] = ar[0];
			for(int i=1; i<N;i++) {
				dp[i] = ar[i] > dp[i-1]+ar[i] ? ar[i] : dp[i-1]+ar[i];
				max = max > dp[i] ? max : dp[i];
			}
			System.out.println("#"+tc+" "+max);
		}
	}
}
