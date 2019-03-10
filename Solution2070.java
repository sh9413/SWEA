import java.util.Scanner;

public class Solution2070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int tc=1; tc<=T; tc++) {
			int a = s.nextInt();
			int b = s.nextInt();
			
			if( a == b ) {
				System.out.println("#"+tc+" "+"=");
			}
			else if( a > b ) {
				System.out.println("#"+tc+" "+">");
			}
			else if( a < b ) {
				System.out.println("#"+tc+" "+"<");
			}
		}
	}

}
