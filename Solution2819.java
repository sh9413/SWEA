import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution2819 {
	static int[][] map;
	static Set<String> set;
	static String s = "";
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			map = new int[4][4];
			set = new HashSet<>(); 
			for(int i=0;i<4;i++) {
				for(int j=0; j<4; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<4; i++) {
				for(int j=0; j<4; j++) {
					dfs(i,j,1,map[i][j]+"");
				}
			}
			System.out.println("#"+tc+" "+set.size());
		}
	}
	
	public static void dfs(int x,int y,int depth,String s) {
		if ( depth == 7 ) {
			set.add(s);
			return ;
		}
		
		for (int d = 0; d < 4; d++)
		{
			int nX = x + dx[d];
			int nY = y + dy[d];
			if (is_safe(nX, nY))
			{
				dfs(nX, nY, depth+1, s+map[nX][nY]+"");
			}
		}
		
	}
	
	public static boolean is_safe(int nX,int nY) {
		if ( nX < 0 || nX > 3 || nY < 0 || nY > 3) {
			return false;
		}
		return true;
	}
}
