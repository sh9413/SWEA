import java.util.Scanner;

public class Solution1210 {
	public static void main(String[] args) {
		int x=0;
		int y=0;
		int[] dx = {0,0,-1}; // 왼쪽,오른쪽,위로
		int[] dy = {-1,1,0};
		Scanner s = new Scanner(System.in);
		for(int tc=1; tc<=10; tc++) {
			int T = s.nextInt();
			int[][] map = new int[100][100];
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					map[i][j] = s.nextInt();
					if(map[i][j] == 2) {
						x = i;
						y = j;
					}
				}	
			}
	
	
	boolean finish = false;
	while ( !finish ) {
		if (x == 0) {
			finish = true;
		}
		for(int d=0; d<3; d++) {
			if( x+dx[d] >= 0 && x+dx[d] < 100 && y+dy[d] >= 0 && y+dy[d] < 100 && map[x+dx[d]][y+dy[d]] == 1) {
				map[x][y] = 0;
				x += dx[d]; 
				y += dy[d];
				break;
			}
		}
	}
	
	
	int result = y;
	System.out.println("#"+T+" "+result);
	}

	}
}
	
	

