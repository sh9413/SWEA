import java.util.Scanner;

public class Solution3074 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] Immigration = new int[N];
			for(int i=0; i<N; i++) {
				Immigration[i] = sc.nextInt();
			}
			
			long start = 1;
			long end = (long)Math.pow(10, 18);
			while ( start <= end ) {
				long mid = (start+end)/2;
				long cnt = 0;
				for(int i=0; i<N; i++) {
					cnt += (mid/Immigration[i]);
				}
				if( cnt < M ) {
					start = mid+1;
				} else {
					end = mid-1;
				}
			}
			System.out.println("#"+tc+" "+start);
		}
				
	}
}
