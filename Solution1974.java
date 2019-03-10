import java.util.Scanner;

public class Solution1974 {
	static int N = 9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int[][] map = new int[N][N];
			
			for(int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					map[i][j] = s.nextInt();
				}
			}
			int i;
			int j;
			boolean isC = true;
			for (i = 0; i < 9; i++) {
				int check = 0;
				for (j = 0; j < 9; j++) {
					check += map[i][j];
				}
				if( check != 45 ) {
					isC = false;
				}
			}
			
			for (i = 0; i < 9; i++) {
				int check = 0;
				for (j = 0; j < 9; j++) {
					check += map[j][i];	
				}
				if( check != 45 ) {
					isC = false;
				}
			}
			
			for(int l=0; l<3; l++) {
				for(int k=0; k<3; k++) {
					int check = 0;
					for (i = 0+(k*3); i < 3+(k*3); i++) {
						for (j = 0+(l*3); j < 3+(l*3); j++) {
							check += map[i][j];
						}
					}
					if( check != 45 ) {
						isC = false;
					}
				}
			}
			
			if(isC) {
				System.out.println("#"+tc+" "+1);
			}
			else {
				System.out.println("#"+tc+" "+0);
			}
		}
	}

}
