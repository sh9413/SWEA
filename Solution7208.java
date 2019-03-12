import java.util.Scanner;

public class Solution {
	static int[][] map;
	static int[] nara;
	static int N;
	static int cnt;
	static int[] input;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			map = new int[N][N];
			nara = new int[N];
			input = new int[N];
			for(int i=0; i<N; i++) {
				int in = sc.nextInt();
				nara[i] = in;
				input[i] = in;
			}
			cnt = Integer.MAX_VALUE;
			for(int y=0;y<N;y++) {
				for(int x=0; x<N; x++) {
					map[y][x] = sc.nextInt();
				}
			}
			
			go(0);
			System.out.println("#"+tc+" "+cnt);
		}
	}
	public static void go(int depth) {
		if ( dif() ) {
			int tmp = count();
			cnt = cnt < tmp ? cnt : tmp;
		}
		if ( depth == N ) {
			return ;
		}
		
		for(int i=0; i<N; i++) {
			int temp = nara[depth];
			nara[depth] = i;
			go(depth+1);
			nara[depth] = temp;
		}
		
	}
	
	public static int count() {
		int count = 0;
		for(int i=0; i<N; i++) {
			if (  nara[i] != input[i] ) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean dif() {
		for(int i=0; i<N; i++) {
			for(int j= i+1; j<N; j++) {
				if ( map[i][j] == 1 ) {
					if ( nara[i] == nara[j] ) { 
						return false;
					}
				}
			}
		}
		return true;
	}
}
