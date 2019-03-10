import java.util.Scanner;

public class Solution1220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] dy = {0,1,-1}; //  
		Scanner s = new Scanner(System.in);
		for(int tc=1; tc<=10; tc++) {
			int N = s.nextInt();
			int[][] table = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					table[i][j] = s.nextInt();
				}
			}
			int count = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if( i+1 < 100 && table[i][j] == 1 ) {
						if( table[i+1][j] == 0) {
						table[i][j] = 0;
						table[i+1][j] = 1; 
						}
						else if( table[i+1][j] == 2) {
							table[i][j] = 3; // 이미  교착상태
							count++;
						}
					}
				}
			}
			
			
			
			System.out.println("#"+tc+" "+count);
			
		}
	}

}
