import java.util.Scanner;

public class Solution3459 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] a = new long[60];
		for(int i=0; i<60; i++) {
			a[i] = (long)Math.pow(2, i);
		}
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			long A = sc.nextLong();
			int count = 0;
			for(int i=59; i>=0; i--) {
				if ( i == 1 ) 
					continue;
				if ( a[i] <= A ) {
					A = A-a[i];
					count++;
				}
			}
			if ( A > 1 ) {
				count++;
			}
			if(count%2==1) {
				System.out.println("#"+tc+" Bob");
			} else {
				System.out.println("#"+tc+" Alice");
			}
		}
	}
}
