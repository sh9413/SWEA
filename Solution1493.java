import java.util.HashMap;
import java.util.Scanner;

public class Solution1493 {
	static int[][] map = new int[301][301];
	static String[] ar = new String[45000];
	public static void main(String[] args) {
		int num = 1;
		for(int i=1; i<300; i++) {
			for(int j=1, k=i; j<=i; j++,k--) {
					map[k][j] = num;
					ar[num++] = k+" "+j;
			}
		}
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int left = sc.nextInt();
			int right = sc.nextInt();
			int leftx = Integer.parseInt(ar[left].split(" ")[0]);
			int lefty = Integer.parseInt(ar[left].split(" ")[1]);
			int rightx = Integer.parseInt(ar[right].split(" ")[0]);
			int righty = Integer.parseInt(ar[right].split(" ")[1]);
			int res = map[leftx+rightx][lefty+righty];
			System.out.println("#"+tc+" "+res);
		}
	}
	
}
