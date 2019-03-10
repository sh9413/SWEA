import java.util.Scanner;

public class Solution1284 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int tc=1; tc<=T; tc++) {
			int P = s.nextInt();
			int Q = s.nextInt();
			int R = s.nextInt();
			int S = s.nextInt();
			int W = s.nextInt();
			
			// P * W // A»ç
			// Q or Q + S * W // B»ç
			int A;
			int B;
			A = P*W;
			if( W <= R ) {
				B = Q;
			}
			else {
				B = Q + ( S * (W-R) );
			}
			int cost = (A < B) ? A : B;
			System.out.println("#"+tc+" "+cost);
		}
		
	}
}
