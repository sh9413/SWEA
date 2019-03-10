import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution5948 {
	static int[] ar;
	static ArrayList<Integer> list;
	static boolean[] used;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			ar = new int[7];
			list = new ArrayList<>();
			used = new boolean[7];
			for(int i=0; i<7; i++) {
				ar[i] = sc.nextInt();
			}
			
			dfs(0,0);
			Collections.sort(list);
			System.out.println("#"+tc+" "+list.get(list.size()-5));
		}
	}
	
	public static void dfs(int depth,int sum) {
		if ( depth == 3 ) {
			if ( !list.contains(sum) )
				list.add(sum);
			return ;
		}
		
		for(int i=0; i<7; i++) {
			if(!used[i]) {
				used[i] = true;
				dfs(depth+1,sum+ar[i]);
				used[i] = false;
			}
		}
		
	}
}
