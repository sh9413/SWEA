import java.util.Scanner;

public class Solution1215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int tc=1; tc<10; tc++) {
			int N = sc.nextInt();
			char[][] map = new char[8][8];
			for(int i=0; i<8; i++) {
					map[i] = sc.next().toCharArray();
				}
			boolean check = true;
			int count = 0;
			for(int i=0; i<8; i++) {
				for(int j=0; j<8-N+1; j++) {
					check = true;
					for(int k=0; k<N/2; k++) {
						if ( map[i][j+k] != map[i][j+(N-1-k)] ) {
							check = false;
							break;
						}
					}
					if (check) {
						count++;
					}
				}
			}
			
			for(int j=0; j<8; j++) {
				for(int i=0; i<8-N+1; i++) {
					check = true;
					for(int k=0; k<N/2; k++) {
						if ( map[i+k][j] != map[i+(N-1-k)][j] ) {
							check = false;
							break;
						}
					}
					if (check) {
						count++;
					}
				}
			}
			
			System.out.println("#"+tc+" "+count);
		}
	}
}
