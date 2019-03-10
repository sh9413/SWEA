import java.util.Scanner;

public class Solution1865 {
	static int N;
	static double[][] process;
	static int[] job;
	static double max;
	static boolean[] visit;

	// dfs ÀúÀå¿ë
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			process = new double[N][N];
			job = new int[N];
			visit = new boolean[N];
			max = 0.0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					process[i][j] = sc.nextInt() / 100.0;
				}
			}
			dfs(0, 1.0);
			System.out.printf("#%d %.6f", tc, max);
			System.out.println();
		}
	}

	public static void dfs(int depth, double sum) {
		if (sum * 100 <= max)
			return;
		if (depth == N) {
			if (sum * 100 > max) {
				max = sum * 100;
				return;
			}
		}

		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				dfs(depth + 1, sum * process[depth][i]);
				visit[i] = false;
			}
		}
	}

	public static void swap(int i, int j, int[] job) {
		int temp = job[j];
		job[j] = job[i];
		job[i] = temp;
	}
}
