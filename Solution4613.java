import java.util.Scanner;

public class Solution4613 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			char[][] map = new char[N][M];
			for(int i=0; i<N; i++) {
				String line = sc.next();
				for(int j=0; j<M; j++) {
					map[i][j] = line.charAt(j);
				}
			}
			int min = Integer.MAX_VALUE;
			
			for(int w=0; w<N-2; w++) {
				for(int b=w+1; b<N-1; b++) {
					for(int r=b+1; r<N; r++) {
						min = Math.min(min, color(w,b,r,N,M,map));
					}
				}
			}
			System.out.println("#"+tc+" "+(min));
		}
	}
	
	public static int color(int w,int b, int r,int N,int M,char[][] map) {
		int count = 0;
		for(int i=0; i<=w; i++) {
			for(int j=0; j<M; j++) {
				if( map[i][j] != 'W' ) 
					count++;
			}
		}
		for(int ii=w+1; ii<=b; ii++) {
			for(int jj=0; jj<M; jj++) {
				if( map[ii][jj] != 'B' ) 
					count++;
			}
		}
		for(int iii=b+1; iii<N; iii++) {
			for(int jjj=0; jjj<M; jjj++) {
				if( map[iii][jjj] != 'R' ) 
					count++;
			}
		}
		return count;
	}
	
}
