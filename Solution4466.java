import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution4466 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			 int N = sc.nextInt();
			 int K = sc.nextInt();
			 Integer[] ar = new Integer[N];
			 for(int i=0; i<N; i++) {
				 ar[i] = sc.nextInt();
			 }
			 
			 Arrays.sort(ar,Collections.reverseOrder());
			 int sum = 0;
			 for(int i=0; i<K; i++) {
				 sum += ar[i];
			 }
			 System.out.println("#"+tc+" "+sum);
		}
	}

}
