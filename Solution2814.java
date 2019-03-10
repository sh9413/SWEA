import java.util.Scanner;

public class Solution2814 {
	static int max;
	static boolean[] visit;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] edge = new int[11][11];
			visit = new boolean[11];
			for(int i=0; i<M;i++) {
				int s = sc.nextInt();
				int e = sc.nextInt();
				edge[s][e] = 1;
				edge[e][s] = 1;
			}
			
			max = 0;
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					visit[j] = false;
				}
				visit[i] = true;
				dfs(0,edge,0,M,N,i);
			}
			System.out.println("#"+tc+" "+(max+1));
		}
	}
	
	public static void dfs(int depth,int[][] edge,int len,int M,int N,int start) {
		if(depth == N ) {
			return ;
		}
		max = max > len ? max : len;
		for(int end=1; end<=N; end++) {
			if ( start == end ) 
				continue;
			if( edge[start][end] == 1 ) {
				if ( !visit[end] ) {
					visit[end] = true;
					dfs(depth+1,edge,len+1,M,N,end);
					visit[end] = false;
				} 
			}
		}
	}
}
