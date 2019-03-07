import java.util.Scanner;

public class Solution6026 {
	static int M;
	static int N;
	static final int O = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			M = sc.nextInt();
			N = sc.nextInt();
			int sum = 0;
			for(int i=0; i<M; i++) {
				if (i%2==0) {
					sum += ((comb(i) * (int)Math.pow(M-i, N))) ;
				} else {
					sum -= ((comb(i) * (int)Math.pow(M-i, N))) ;
				}
			}
			
			System.out.println("#"+tc+" "+sum);
		}
	}
	
	public static int comb(int a) {
		int res = 1;
		for(int i=0; i<a; i++) {
			res = res * (M-i)/(i+1);
		}
		return res;
		
	}
}
