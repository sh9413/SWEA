import java.util.Scanner;

public class Solution3431 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int L = sc.nextInt(); // L분 이상
			int U = sc.nextInt(); // U분 이하 운동을 해야한다.
			int X = sc.nextInt(); // 이번주 운동량은 X만큼했다
			// X - L 
		int res;
		if( X > U ) {
			res = -1;
		} else if ( L < X ) {
			res = 0;
		} else {
			res = L-X;
		}
		
		System.out.println("#"+tc+" "+res);
		}
		
		
	}
}
