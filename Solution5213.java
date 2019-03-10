import java.util.Scanner;

public class Solution5213 {
	public static void main(String[] args) {
		int[] dp = new int[1000001];
		for (int i = 1; i <= 1000000; i++) {
			for (int j = 1; j <= 1000000 / i; j++) {
				if(i%2==1) 
					dp[i * j] += i; 
			} 
		}
		long[] total = new long[1000001];
		total[0] = dp[0];
		for(int i=1; i<1000001; i++) {
			total[i] = dp[i] + total[i-1];
		}

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			long sum = 0;
			sum = total[R]-total[L-1];
			System.out.println("#"+tc+" "+sum);
		}
	}
}
