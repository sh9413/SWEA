import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution5215 {
	static int cal;
	static int score;
	static int N;
	static int L;
	static int max;
	static Point[] arr;
	static boolean[] used;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T; tc++) {
			N = sc.nextInt();
			L = sc.nextInt();
			arr = new Point[N];
			max = -1;
			score = 0;
			cal = 0;
			for(int i=0; i<N;i++) {
				arr[i] = new Point(sc.nextInt(),sc.nextInt());
			}
			dfs(0,0,0);
			System.out.println("#"+tc+" "+max);
		}
	} 
		
	public static void dfs(int idx,int s,int c) {
		 	if(c>L) return;
		 	if(idx==N) {
	            max = Math.max(max, s);
	            return;
	        }
		 	
	        dfs(idx+1,s+arr[idx].score ,c+arr[idx].cal);
	        dfs(idx+1,s,c);
	}
	
	public static class Point {
		int score;
		int cal;
		public Point(int score,int cal) {
			this.score = score;
			this.cal = cal;
		}
	}
}
