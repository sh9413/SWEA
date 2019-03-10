import java.util.*;
public class Solution1244 {
	static int[] data;
	static int max;
	static int res;
	static String s;
	static int R; 
	
	public static void swap(int a, int b,int i,int j) {
		data[j] = a;
		data[i] = b;
	}
	
	public static void dfs(int depth, int now) {
		if( depth == R ) {
			String data_s = "";
			for(int i=0; i<data.length; i++) {
				data_s = data_s + data[i];
			}
			if ( res < Integer.parseInt(data_s) ) {
				res = Integer.parseInt(data_s);
			}
			return ;
		}
		
		for(int i=now; i<data.length; i++) {
			for(int j=i; j<data.length; j++) {
				if (i==j) continue;
					swap(data[i],data[j],i,j);
					dfs(depth+1,i);
					swap(data[i],data[j],i,j);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			res = 0;
			int N = sc.nextInt();
			R = sc.nextInt();
			s = N+"";
			int len = (int)Math.log10(N)+1;
			data = new int[len];
			for(int i=0; i<len; i++) {
				data[i] = Integer.parseInt(s.substring(i,i+1));
			}
			dfs(0,0);
			System.out.println("#"+tc+" "+res);
		}
	}
	
}