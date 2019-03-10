import java.util.Scanner;

public class Solution4301 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int count = 0;
			boolean[][] visit = new boolean[M+3][N+3];
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if ( !visit[i][j] ) {
						System.out.println(i+ "  "+ j);
						visit[i][j] = true;
						visit[i+2][j] = true;
						visit[i][j+2] = true;
						count++;
					}
				}
			}
			System.out.println("#"+tc+" "+count);
		}
	}
}
