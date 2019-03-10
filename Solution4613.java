import java.util.Scanner;

public class Solution4613 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			char[][] map = new char[M][N];
			for(int i=0; i<N; i++) {
				String line = sc.next();
				for(int j=0; j<M; j++) {
					map[j][i] = line.charAt(j);
				}
			}
			int count = 0;
			for(int i=0; i<M; i++) { // 흰색 칠하기
				if( map[i][0] != 'W' ) {
					map[i][0] = 'W';
					count++;
				}
			}
			for(int i=0; i<M; i++) { // 흰색 칠하기
				if( map[i][1] != 'B' ) {
					map[i][1] = 'B';
					count++;
				}
			}
			for(int j=2; j<N; j++) {
				for(int i=0; i<M; i++) { // 흰색 칠하기
					if( map[i][j] != 'R' ) {
						map[i][j] = 'R';
						count++;
					}
				}
			}
			
			System.out.println("#"+tc+" "+count);
		}
	}
}
