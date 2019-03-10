import java.util.Scanner;

public class Solution6913 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] p = new int[N];
			for(int i=0; i<N; i++) {
				p[i] = 0;
			}
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if ( sc.nextInt() == 1 ) {
						p[i] += 1;
					}
				}
			}
			int max = -1;
			for(int i=0; i<N; i++) {
				if ( max < p[i]) {
					max = p[i];
				}
			}
			int count = 0;
			for(int i=0; i<N; i++) {
				if ( max == p[i] ) {
					count++;
				}
			}
			
			System.out.println("#"+tc+" "+count+" "+max);
		}
	}
}
