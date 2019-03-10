import java.util.Scanner;

public class Solution1265 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T =sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int P = sc.nextInt();
			int[] ar= new int[P];
			for(int i=0; i<P;i++) {
				ar[i] = N/P;
			}
			int mod = N%P;
			for(int i=0; i<mod; i++) {
				ar[i]++;
			}
			double res = 1;
			for(int i=0; i<P; i++) {
				res *= ar[i];
			}
			System.out.printf("#%d %.0f",tc,(double)res);
			System.out.println();
		}
	}
}
