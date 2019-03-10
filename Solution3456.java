import java.util.Scanner;

public class Solution3456 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
		
			int res;
			if( a == b) {
				res = c;
			} else if ( a == c) {
				res = b;
			} else {
				res = a;
			}
			System.out.println("#"+tc+" "+res);
		}
	}
}
