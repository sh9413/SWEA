import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution2 {
	static int[] dx = { 0, 1, 1 };
	static int[] dy = { 1, 0, 1 };
	static int N;
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			map = new int[N][N];
			boolean[][] visit = new boolean[N][N];
			for (int y = 0; y < N; y++) {
				for (int x = 0; x < N; x++) {
					map[y][x] = sc.nextInt();
				}
			}
			Queue<Point> q = new LinkedList<>();
			//q.add(new Point(0, 0, 1)); // 시작점 .. dir = 0 -> 아래방향을 보고 있음 , 즉 y+1을 차지하고 있음
			// 1 -> 오른쪽 방향을 보고있음 . 즉 x+1을 차지하고 있음
			q.add(new Point(0,0,0));
			q.add(new Point(0,0,1));
			int cnt = 0;
			while (!q.isEmpty()) {
				Point p = q.poll();
				//System.out.println();
				//System.out.println("현재 버스의 좌표:" +p.X+" "+p.Y+" "+p.dir);
				if (p.dir == 0) { // 아래방향을 보고있다면 y좌표가 하나 더필요
					if (p.X == N - 1 && p.Y + 1 == N - 1) {
						cnt++;
					}
				} else if (p.dir == 1) {
					if (p.X + 1 == N - 1 && p.Y == N - 1) {
						cnt++;
					}
				}
				int tempX = p.X + dx[p.dir];
				int tempY = p.Y + dy[p.dir];
				if (InRange(tempX, tempY, p.dir) && map[tempY][tempX] == 0) {
					if (p.dir == 0) {
						if (map[tempY + 1][tempX] == 0) {
							q.add(new Point(tempX, tempY, p.dir));
							//System.out.println("추가 경로:" +tempX+" "+tempY+" "+p.dir);
						}
					} else {
						if (map[tempY][tempX + 1] == 0) {
							q.add(new Point(tempX, tempY, p.dir));
							//System.out.println("추가 경로:" +tempX+" "+tempY+" "+p.dir);
						}
					}
				}
				if(InRange(p.X+1,p.Y+1) && map[p.Y+1][p.X]== 0 && map[p.Y+1][p.X+1]== 0 && map[p.Y][p.X+1]== 0) {
					if ( InRange(p.X+1,p.Y+2) && map[p.Y+2][p.X+1]== 0 ) {
						q.add(new Point(p.X+1,p.Y+1,0));
						//System.out.println("대각추가경로 :"+(p.X+1)+" "+(p.Y+1)+" 0");
					}
					else if ( InRange(p.X+2,p.Y+1) && map[p.Y+1][p.X+2]== 0 ) {
						q.add(new Point(p.X+1,p.Y+1,1));
						//System.out.println("대각추가경로 :"+(p.X+1)+" "+(p.Y+1)+" 1");
					}
				}
		}

		System.out.println("#" + tc + " " + cnt);
	}

	}
	public static boolean InRange(int x, int y) {
		if (x >= 0 && y >= 0 && x < N && y < N ) {
			return true;
		}
		return false;
	}
	public static boolean InRange(int x, int y, int bus) {
		if (bus == 0) { // 방향이 아래일경우,y좌표를 하나 더가짐
			bus = y + 1;
		} else {
			bus = x + 1;
		}

		if (x >= 0 && y >= 0 && bus >= 0 && x < N && y < N && bus < N) {
			return true;
		}
		return false;
	}

	public static class Point {
		int X;
		int Y;
		int dir;

		public Point(int x, int y, int dir) {
			X = x;
			Y = y;
			this.dir = dir;
		}
	}
}
