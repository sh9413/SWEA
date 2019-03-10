import java.util.ArrayList;
import java.util.Scanner;

public class Solution1494 {
	static warms[] warms;
	static boolean[] used;
	static int N;
	static ArrayList<warms> fix;
	static ArrayList<warms> unfix;
	static long min;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			N = sc.nextInt();
			count = 0;
			min = Long.MAX_VALUE;
			warms = new warms[N];
			used = new boolean[N];
			
			for(int i=0; i<N; i++) {
				warms[i] = new warms(sc.nextInt(),sc.nextInt());
			}
			
			dfs(0,0);
			
			System.out.println("#"+tc+" "+min);
		}
		
	}

	public static void dfs(int idx,int depth) {
		if ( depth == N/2 ) {
			calVector();
			return ;
		} 
		for (int i = idx; i < N; i++) {
			if (!used[i]) {
				used[i] = true;
				dfs(i+1, depth+1);
				used[i] = false;
			}
		}
	}
	
	public static void calVector() {
		fix = new ArrayList<>(); 
		unfix = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			if( used[i] ) {
				fix.add(warms[i]);
			} else {
				unfix.add(warms[i]);
			}
		}
		
		long x = 0;
		long y = 0;
		
		for(int i=0; i<N/2; i++) {
			x += (fix.get(i).x - unfix.get(i).x);
			y += (fix.get(i).y - unfix.get(i).y);
		}
		if ( min > x*x + y*y ) {
			min = x*x + y*y;
		}
	}
	
	
	public static class warms {
		int x;
		int y;
		public warms(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
}
