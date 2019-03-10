import java.util.Scanner;

public class Solution2805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int[][] ar = new int[N][N];
			for(int i=0; i<N; i++) {
				String s = sc.next();
				for(int j=0; j<N; j++) {
				ar[i][j] = s.charAt(j)-'0';
				}
			}
			
			int sum = 0;
			for(int i=0; i<N; i++) {
				for(int j=Math.abs(N/2-i); j<N-Math.abs(N/2-i); j++) {
					sum += ar[i][j];
				}
			}
			System.out.println("#"+tc+" "+sum);
		}
	}
}
