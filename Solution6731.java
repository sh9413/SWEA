import java.util.Scanner;

public class Solution6731 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			char[][] map = new char[N][N];
			int[][] check = new int[N][N];
			for(int i=0; i<N;i++) {
				map[i] = sc.next().toCharArray();
			}
			int[] garo = new int[N];
			int[] sero = new int[N];
			for(int i=0; i<N; i++) {
				for(int j=0;j<N; j++) {
					if( map[i][j] == 'B' ) {
						garo[i]++;
					}
				}
			}

			for(int i=0; i<N; i++) {
				for(int j=0;j<N; j++) {
					if( map[j][i] == 'B' ) {
						sero[i]++;
					}
				}
			}

			int res = 0;
			for(int i=0;i<N; i++) {
				for(int j=0;j<N; j++) {
					if(map[i][j] == 'B') {
						check[i][j] = garo[i]+sero[j]-1;
						if(check[i][j]%2==1) {
							res++;
						}
					} else {
						check[i][j] = garo[i]+sero[j];
						if(check[i][j]%2==1) {
							res++;
						}
					}
				}
			}

			System.out.println("#"+tc+" "+res);
		}
	}
}
