import java.util.Scanner;

public class Main1003 {
	static int[][] dp;
	static int a;
	static int b;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		dp = new int[41][2];
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		for(int i=2;i<41; i++) {
			dp[i][0] = dp[i-1][0] + dp[i-2][0];
			dp[i][1] = dp[i-1][1] + dp[i-2][1];
		}
		
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			System.out.println(dp[N][0]+" "+dp[N][1]);
		}
	}
	

}
