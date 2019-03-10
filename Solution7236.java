import java.util.Scanner;

public class Solution7236 {
	static int[] dx = { 1, -1, 0, 0, 1, 1, -1, -1 };
	static int[] dy = { 0, 0, 1, -1, -1, 1, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			String[][] map = new String[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.next();
				}
			}

			int max = -1;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j].equals("W")) {
						int count = 0;
						for (int dir = 0; dir < 8; dir++) {
							int tempX = j + dx[dir];
							int tempY = i + dy[dir];
							if (InRange(tempX, tempY, N)) {
								if (map[tempY][tempX].equals("W")) {
									count++;
								}
							}
						}
						max = max > count ? max : count;
					}
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}

	public static boolean InRange(int X, int Y, int N) {
		if (X >= 0 && Y >= 0 && X < N && Y < N) {
			return true;
		}
		return false;
	}
}
