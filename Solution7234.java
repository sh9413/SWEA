import java.util.Scanner;

public class Solution7234 {
	static int[] dx = {1,-1,0,0,2,-2,0,0,0};
	static int[] dy = {0,0,1,-1,0,0,2,-2,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int B = sc.nextInt();
			int[][] map = new int[N][N];
			int[][] count = new int[N][N];
			for(int i=0; i<B; i++) {
				// y,x 순으로 주어짐.
				int y = sc.nextInt();
				int x = sc.nextInt();
				for(int dir=0; dir<9; dir++) {
					Point p = new Point(x+dx[dir],y+dy[dir]);
					if ( InRange(p,N) ) {
						count[p.Y][p.X]++; 
					}
				}
			}
			int max = 0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					max = max > count[i][j] ? max : count[i][j];
				}
			}
			System.out.println("#"+tc+" "+max);
		}
	}
	
	public static boolean InRange(Point p,int N) {
		if ( p.X >= 0 && p.Y >= 0 && p.X < N && p.Y < N ) {
			return true;
		}
		return false;
	}
	public static class Point {
		int X;
		int Y;
		public Point(int x,int y) {
			X=x;
			Y=y;
		}
	}
}
