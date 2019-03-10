import java.util.Scanner;

public class Solution6730 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int[] wall = new int[N];
			for(int i=0; i<N; i++) {
				wall[i] = sc.nextInt();
			}
			int up = 0;
			int down = 0;
			for(int i=0; i<N-1; i++) {
				if ( (wall[i] - wall[i+1]) > 0 ) { // 왼쪽 벽이 더 클 경우
					down = (down > wall[i] - wall[i+1]) ? down : wall[i]-wall[i+1];
				} else {
					up = (up > wall[i+1]-wall[i]) ? up : wall[i+1]-wall[i];
				}
			}
			
			System.out.println("#"+tc+" "+up+" "+down);
		}
	}
}
