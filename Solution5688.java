import java.util.Scanner;

public class Solution5688 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1;tc<=T; tc++) {
			long N = s.nextLong();
			long res = -1;
			if ( (long)Math.cbrt(N) == Math.cbrt(N) ) {
				res = (long)Math.cbrt(N);
			}
			System.out.println("#"+tc+" "+res);
		}
	}

}
