import java.util.Scanner;

public class Solution6782 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			long N = sc.nextLong();
			long count = 0;
			while( N!=2 ) {
				double tmp = Math.sqrt(N);
				if( tmp == (long)tmp ) {
					count++;
					N = (long) tmp;
				} else {
					long M = (long)tmp+1;
					count += (M*M)-N+1;
					N = M;
				}
			}
			System.out.println("#"+tc+" "+count);
		}
	}
}
