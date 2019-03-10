import java.util.Scanner;

public class Solution4796_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int[] M = new int[N+1];
			int[] H = new int[N+1];
			for(int i=0; i<N;i++) {
				M[i] = sc.nextInt();
			}
			boolean asc = true;
			boolean b = true;
			int count = 0;
			int aa = 0;
			int bb = 0;
			int res = 0;
			for(int i=1;i<N;i++) {
				if ( asc ) {
					if(M[i-1] < M[i]) {
						count++;
					} else {
						asc = false;
						aa = count;
						count = 0;
						i--;
					}
				} else { 
					if(M[i-1] > M[i]) {
						count++;
					} else {
						asc = true;
						bb = count;
						res += aa*bb;
						count = 0;
						aa = 0;
						bb = 0;
					}
				}
			}
			System.out.println("#"+tc+" "+res);
		}
	}
}
