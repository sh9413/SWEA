import java.util.Scanner;

public class Solution3975 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int b1 = sc.nextInt();
			int b2 = sc.nextInt();
			
			double a = (double)a1/a2;
			double b = (double)b1/b2;
			
			
			if( a > b ) {
				System.out.println("#"+tc+" ALICE");
			} else if ( a < b ) {
				System.out.println("#"+tc+" BOB");
			} else {
				System.out.println("#"+tc+" DRAW");
			}
		}
	}
}
