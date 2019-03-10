import java.util.Scanner;

public class Solution1946 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = s.nextInt();
			int space = 10;
			for(int i=0; i<N; i++) {
				String str = s.next();
				int n = s.nextInt();
				if ( space - n >= 0 ) {
					space = space - n;
					for(int j=0; j<n; j++) {
						System.out.print(str);
					}
				}
				else {
					for(int j=0; j<n; j++) {
						System.out.print(str);
					}
					space = space - n;
					for(int j=0; j<space; j++) {
						System.out.print(str);
					}
				}
				if( space <= 0 ) {
					space = 10;
					System.out.println();
				}
				
			}
		}
	}

}
