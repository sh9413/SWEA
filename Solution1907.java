import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution1907 {
	static int[] dx = {1,-1,0,0,1,1,-1,-1};
	static int[] dy = {0,0,-1,1,1,-1,1,-1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			char[][] map = new char[H][W];
			boolean[][] visit = new boolean[H][W];
			for(int y=0; y<H; y++) {
				String s = sc.next();
				for(int x=0; x<W; x++) {
					map[y][x] = s.charAt(x);
				}
			}
			Queue<Point> q = new LinkedList<>();
			for(int y=1; y<H-1; y++) {
				for(int x=1; x<W-1; x++) {
					if ( map[y][x] != '.' && crush(map,y,x) ) {
						q.add(new Point(x,y,1));
						visit[y][x] = true;
						
					}
				}
			}

			int res = 0;
			while(!q.isEmpty()) {
				Point p = q.poll();
				map[p.Y][p.X] = '.';
				res = p.cnt;
				for(int i=0; i<8; i++) {
					if ( !visit[p.Y+dy[i]][p.X+dx[i]] && map[p.Y+dy[i]][p.X+dx[i]] != '.' && crush(map,p.Y+dy[i],p.X+dx[i]) ) {
						q.add(new Point(p.X+dx[i],p.Y+dy[i],p.cnt+1));
						visit[p.Y+dy[i]][p.X+dx[i]] = true;
					}
				}
				
			}
			
			System.out.println("#"+tc+" "+res);
		}
	}
	
	
	public static boolean crush(char[][] map,int y,int x) {
		int count = 0;
		for(int i=0; i<8; i++) {
			if ( map[y+dy[i]][x+dx[i]] == '.' ) {
				count++;
			}
		}
		if ( count >= map[y][x]-'0' ) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static void print(char[][] map,int H,int W) {
		for(int i=0;i<H; i++) {
			for(int j=0;j<W;j++) {
				System.out.print(map[i][j]+" ");
			}System.out.println();
		}System.out.println();
	}
	
	public static class Point {
		int X;
		int Y;
		int cnt;
		public Point(int x,int y,int C) {
			X=x;
			Y=y;
			cnt = C;
		}
	}
}
