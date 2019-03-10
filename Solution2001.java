import java.util.Scanner;

public class Solution2001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int tc=1; tc<=T; tc++) {
			int N = s.nextInt();
			int M = s.nextInt();
			
			int[][] map = new int[N][N];
			for(int i=0;i<N;i++) { 
				for(int j=0; j<N; j++) {
					map[i][j] = s.nextInt();
				}
			}
			int max = -1;
			for(int k=0; k<N-M+1; k++) {
				for (int l=0; l<N-M+1; l++) {
					int fly = 0;
					for(int i=k; i<M+k; i++) {
						for (int j=l; j<M+l; j++) {
							fly += map[i][j];
						}
					}
					if(fly > max) {
						max = fly;
					}
				}
			}
			System.out.println("#"+tc+" "+max);
			
		}
	}

}
