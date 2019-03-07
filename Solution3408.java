import java.util.Scanner;

public class Solution3408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			long N = sc.nextInt();
			long S1 = 0;
			S1 = (1+N)*(N/2);
			if ( N%2 == 1 ) { // 홀수라면..? 
				S1 += N/2+1;
			}
			
			long res = S1*2;
			System.out.println("#"+tc+" "+S1+" "+(res-N)+" "+res);
		}
	}
}
