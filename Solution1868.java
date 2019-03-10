import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution1868 {
	static int N;
	static char[][] map;
	static int[][] countmap;
	static boolean[][] visit;
	static int[] dx = { 1, -1, 0, 0, 1, 1, -1, -1 };
	static int[] dy = { 0, 0, 1, -1, 1, -1, 1, -1 };
	static int res = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			map = new char[N][N];
			countmap = new int[N][N];
			visit = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				String s = sc.next();
				for (int j = 0; j < N; j++) {
					map[i][j] = s.charAt(j);
				}
			}
			count();
			Queue<Point> q = new LinkedList<>();
			res = 0;
			for (int y = 0; y < N; y++) {
				for (int x = 0; x < N; x++) {
					if (countmap[y][x] == 0 && !visit[y][x] && map[y][x] !='*') {
						q.add(new Point(x, y));
						res++;
						while (!q.isEmpty()) {
							Point p = q.poll();
							visit[p.Y][p.X]=true;
							for (int dir = 0; dir < 8; dir++) {
								int tempX = p.X + dx[dir];
								int tempY = p.Y + dy[dir];
								if (InRange(tempX, tempY) && !visit[tempY][tempX] && map[tempY][tempX] != '*') {
									visit[tempY][tempX] = true;
									if (countmap[tempY][tempX] == 0)
										q.add(new Point(tempX, tempY));
								}
							}
						}
						
					}
				}
			}
		for (int y = 0; y < N; y++) {
			for (int x = 0; x < N; x++) {
				if (map[y][x] != '*' && !visit[y][x]) {
					res++;
				}
			}
		}
		System.out.println("#"+tc+" "+res);
		}
	}

	public static void count() {
		for (int y = 0; y < N; y++) {
			for (int x = 0; x < N; x++) {
				for (int dir = 0; dir < 8; dir++) {
					int tempX = x + dx[dir];
					int tempY = y + dy[dir];
					if (InRange(tempX, tempY) && map[tempY][tempX] == '*') {
						countmap[y][x]++;
					}
				}
			}
		}
	}

	public static boolean InRange(int x, int y) {
		if (x >= 0 && y >= 0 && x < N && y < N) {
			return true;
		}
		return false;
	}

	public static class Point {
		int X;
		int Y;

		public Point(int x, int y) {
			X = x;
			Y = y;
		}
	}
}
