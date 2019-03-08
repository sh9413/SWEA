import java.util.Arrays;
import java.util.Scanner;

public class Solution4050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int[] ar= new int[N];
			for(int i=0; i<N; i++) {
				ar[i] = sc.nextInt();
			}
			int price = 0;
			
			Arrays.sort(ar);
			int r = ar.length%3;
			
			for(int i=0; i<r; i++) {
				price += ar[i];
			}
			for(int i=0; i<N-r; i++) {
				if ( i%3 == 0 ) {
					continue;
				}
				price += ar[i+r];
			}
			
			System.out.println("#"+tc+" "+price);
			
		}
	}
}
