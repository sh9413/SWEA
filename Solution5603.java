import java.util.Scanner;

public class Solution5603 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int[] ar = new int[N];
			int sum = 0;
			for(int i=0; i<N; i++) {
				ar[i] = sc.nextInt();
				sum += ar[i];
			}
			int avg = sum/N;
			int res = 0;
			for(int i=0; i<N; i++) {
				if ( ar[i] < avg ) {
					res += (avg-ar[i]);
				}
			}
			
			System.out.println("#"+tc+" "+res);
			
		}
	}
}
