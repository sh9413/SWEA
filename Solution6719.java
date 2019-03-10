import java.util.Arrays;
import java.util.Scanner;

public class Solution6719 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt(); // K개의 강좌를 보겠다.
			int[] M = new int[N]; 
			for(int i=0; i<N; i++) {
				M[i] = sc.nextInt(); // 강좌의 수준
			}
			Arrays.sort(M);
			double grade = 0;
			int start = (N-K) < 0 ? 0 : N-K;
			for(int i=start; i<start+K; i++) {
				grade = (grade+M[i])/2.000000;
			}

			System.out.printf("#%d %.6f\n",tc,grade);
			
		}
	}
}
