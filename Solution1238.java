import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution1238 {
	public static int[][] map;
	public static boolean[] visit;
	public static int N, M;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			int start = sc.nextInt();

			map = new int[101][101]; // 1번부터 쓰느거라 인덱스 +1 해놓기
			visit = new boolean[101];
			for (int i = 0; i<(N/2); i++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				map[from][to] = 1;
			}

			Queue<Integer> q = new LinkedList<>();
			Queue<Integer> q2 = new LinkedList<>();
			q.add(start);
			visit[start] = true;
			int max = -1;
			int max_s= 0;
			while (!q.isEmpty() || !q2.isEmpty()) {
				max = -1;
				while (!q2.isEmpty()) {
					int from2 = q2.poll();
					for (int to = 1; to < 101; to++) {
						if (map[from2][to] == 1) {
							if (!visit[to]) {
								visit[to] = true;
								q.add(to);
								max = max > to ? max : to;
								max_s = max;
							}
						}
					}
					
				}
				max = -1;
				while(!q.isEmpty()) {
					int from = q.poll();
					for (int to = 1; to < 101; to++) {
						if (map[from][to] == 1) {
							if (!visit[to]) {
								visit[to] = true;
								q2.add(to);
								max = max > to ? max : to;
								max_s = max;
							}
						}
					}
				}
			}
			
			if( max == -1 ) {
				System.out.println("#"+tc+" "+max_s);
			} else {
				System.out.println("#"+tc+" "+max);
			}
		}
	}
}