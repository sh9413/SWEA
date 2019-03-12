import java.util.Scanner;

public class Main2579 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] step = new int[N];
		int[] dp = new int[N];
		for(int i=0; i<N;i++) {
			step[i] = sc.nextInt();
		}
		dp[0] = step[0];
		dp[1] = Math.max(step[0]+step[1], step[1]);
		dp[2] = Math.max(step[0]+step[2],step[1]+step[2]);
		for(int i=3; i<N; i++) {
			dp[i] = Math.max(dp[i-3]+step[i]+step[i-1], dp[i-2]+step[i]);
		}
		
		System.out.println(dp[N-1]);
	}
}
