import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution1249 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0}; // ¿ìÁÂ»óÇÏ
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int[][] map = new int[N][N];
			boolean[][] visit = new boolean[N][N];
			int[][] dis = new int[N][N];
			for(int i=0;i<N;i++) {
				String[] s = sc.next().split("");
				for(int j=0; j<N; j++) {
					map[i][j] = Integer.parseInt(s[j]);
				}
			}
			Queue<Point> queue = new LinkedList<>();
			queue.add(new Point(0,0));
			visit[0][0] = true;
			int res = 0;
			while(!queue.isEmpty()) {
				Point p = queue.poll();
				int tempdis = Integer.MAX_VALUE;
				for(int dir=0;dir<4;dir++) {
					int tempX = p.X+dx[dir];
					int tempY = p.Y+dy[dir];
					if(tempX >= 0 && tempY >= 0 && tempX < N && tempY < N) {
						if( dis[tempY][tempX] > map[tempY][tempX] + dis[p.Y][p.X] ) {
							dis[tempY][tempX] = map[tempY][tempX] + dis[p.Y][p.X];
							tempdis = dis[tempY][tempX];
							visit[tempY][tempX] = true;
							queue.add(new Point(tempX,tempY));
						}
						if(!visit[tempY][tempX] && tempdis >= dis[tempY][tempX] ) {
						dis[tempY][tempX] = map[tempY][tempX] + dis[p.Y][p.X];
						tempdis = dis[tempY][tempX];
						visit[tempY][tempX] = true;
						queue.add(new Point(tempX,tempY));
						}
					}
				}
			}
			System.out.println("#"+tc+" "+dis[N-1][N-1]);
		}
	}
	
	static class Point {
		int X;
		int Y;
		public Point(int x,int y) {
			X=x;
			Y=y;
		}
	}
}
