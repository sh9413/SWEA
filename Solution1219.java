import java.util.Scanner;

public class Solution1219 {
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			int T  = sc.nextInt();
			int E = sc.nextInt();
			int[] a = new int[100];
			int[] b = new int[100];
			for(int i=0; i<100; i++) {
				a[i] = -1;
				b[i] = -1;
			}
			for(int i=0; i<E; i++) {
				int tmp = sc.nextInt();
				if( a[tmp] == -1 ) { 
					a[tmp] = sc.nextInt();
				} else {
					b[tmp] = sc.nextInt();
				}
			}
			ans = 0;
			dfs(0,a,b,E,0);
			System.out.println("#"+tc+" "+ans);
		}
	}
	
	
	public static void dfs(int depth,int[] a,int[] b,int E,int start) {
		if ( depth == E || start == -1) {
			return ;
		} 
		if ( start == 99 ) {
			ans = 1;
			return ;
		}
		dfs(depth+1,a,b,E,a[start]);
		dfs(depth+1,a,b,E,b[start]);
	}
}
