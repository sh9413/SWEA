import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution1861 {
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static boolean[][] visit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int[][] map = new int[N][N];
			visit = new boolean[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					map[i][j] = sc.nextInt();
				}
			}
			int max = Integer.MIN_VALUE;
			Point res = null;
			ArrayList<Point> list = new ArrayList<>();
			for(int i=0;i<N;i++) { 
				for(int j=0; j<N; j++) {
					Queue<Point> q = new LinkedList<>();
					init(N);
					q.add(new Point(j,i,1));
					visit[i][j] = true;
					while(!q.isEmpty()) {
						Point p = q.poll();
						if( max <= p.len ) {
							max = p.len;
							list.add(new Point(j,i,p.len));
						} 
						for(int dir=0;dir<4;dir++) {
							int tempX = p.X + dx[dir];
							int tempY = p.Y + dy[dir];
							if( tempX < N && tempY < N && tempX >= 0 && tempY >= 0 &&
									map[p.Y][p.X] == (map[tempY][tempX]-1) && !visit[tempY][tempX]) {
								q.add(new Point(tempX,tempY,p.len+1));
								visit[tempY][tempX] = true;
							}
						}
					}
				}
			}
			Collections.sort(list, new Comparator<Point>() {
				@Override
				public int compare(Point o1, Point o2) {
					if ( o1.len > o2.len ) {
						return -1;
					} else if (o1.len < o2.len ){
						return 1;
					} else if ( map[o1.Y][o1.X] < map[o2.Y][o2.X] ) {
						return -1;
					} else {
						return 1;
					}
					
				}
			});
			System.out.println("#"+tc+" "+map[list.get(0).Y][list.get(0).X]+" "+max);
			
		}
	}
	
	public static void init(int N) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				visit[i][j] = false;
			}
		}
	}
	
	
	public static class Point {
		int X;
		int Y;
		int len;
		public Point(int x,int y,int len) {
			X=x;
			Y=y;
			this.len = len;
		}
		@Override
		public String toString() {
			return "Point [X=" + X + ", Y=" + Y + ", len=" + len + "]";
		}
		
	}
}
