import java.util.Scanner;

public class Solution1259 {
	static int N;
	static NASA[] nasa;
	static String ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			nasa = new NASA[N];
			for(int i=0; i<N; i++) {
				int M = sc.nextInt();
				int F = sc.nextInt();
				nasa[i] = new NASA(M,F);	
			}
			
			for(int i=0; i<N; i++) {
				StringBuilder sb = new StringBuilder("");
				ans = "";
				dfs(1,nasa[i].M,nasa[i].F,sb);
				if ( !ans.equals("") ) {
					System.out.println("#"+tc+ans);
					break;
				}
			}
		}
	}
	
	public static void dfs(int depth,int M,int F,StringBuilder sb) {
		sb.append(" "+M+" "+F);
		if ( depth == N ) {
			ans = sb.toString();
			return ;
		}
		for(int i=0; i<N; i++) {
			if(F == nasa[i].M) {
				dfs(depth+1,nasa[i].M,nasa[i].F,sb);
				break;
			}
		}
		return ;
	}
	public static class NASA {
		int M;
		int F;
		public NASA(int m,int f) {
			this.M = m;
			this.F = f;
		}
		public String toString() {
			return this.M+" "+this.F;
		}
		
		
	}
}
