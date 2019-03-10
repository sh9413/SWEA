import java.util.Scanner;

public class Solution5789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1;tc<=T; tc++) {
			int N = s.nextInt();
			int Q = s.nextInt();
			int[] ar = new int[N];
			for(int i=0; i<Q; i++) {
				int L = s.nextInt()-1;
				int R = s.nextInt()-1;
				for(int j=L; j<=R; j++) {
					ar[j] = i+1;
				}
			}
			
			System.out.print("#"+tc+" ");
			for(int i=0; i<N; i++) {
				System.out.print(ar[i]+" ");
			}
			System.out.println();
		}
	}

}
