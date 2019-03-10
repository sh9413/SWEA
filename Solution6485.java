import java.util.Scanner;

public class Solution6485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = s.nextInt();
			int[] counts = new int[5001];
			for(int i=0; i<N; i++) {
	            int A = s.nextInt();
	            int B = s.nextInt();
	            for(int j = A; j <= B; j++) {
	                counts[j]++;
	            }
		}
        System.out.print("#"+tc);
        int P = s.nextInt();
        for(int i = 0 ; i < P; i++) {
            int C = s.nextInt();
            System.out.print(" "+counts[C]);
        }
        System.out.println();
		}
	}
}
