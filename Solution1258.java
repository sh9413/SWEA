import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution1258 {
	static int[][] map;
	static int N;
	static ArrayList<matrix> m;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			map = new int[N + 1][N + 1];
			m = new ArrayList<>();
			for (int i = 1; i < N + 1; i++) {
				for (int j = 1; j < N + 1; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			for (int i = 1; i < N + 1; i++) {
				for (int j = 1; j < N + 1; j++) {
					int y = i;
					int x = j;
					if (map[i][j] != 0) {
						while (x+1<N+1 && map[y][x+1] != 0) {
							x = x + 1;
						}
						while (y+1<N+1 && map[y+1][x] != 0) {
							y = y + 1;
						}
						if (x - j + y - i > 0 ) {
							m.add(new matrix(x - j + 1, y - i + 1, (x - j + 1) * (y - i + 1)));
							for (int k = i; k < y + 1; k++) {
								for (int l = j; l < x + 1; l++) {
									map[k][l] = 0;
								}
							}
						}
					}
				}
			}
			Collections.sort(m, new Comparator<matrix>() {
				@Override
				public int compare(matrix o1, matrix o2) {
					if ( o1.RC > o2.RC ) { 
						return 1;
					} else {
						return -1;
					}
				}
			});
			
			System.out.print("#"+tc+" "+m.size());
			for(int i=0; i<m.size(); i++) {
				System.out.print(" "+m.get(i).C+" "+m.get(i).R);
			}
			System.out.println();
		}
	}

	public static void go(int x, int y) {

	}

	public static class matrix {
		int R;
		int C;
		int RC;

		public matrix(int r, int c, int rc) {
			R = r;
			C = c;
			RC = rc;
		}
	}
}
