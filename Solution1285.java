import java.util.Scanner;

public class Solution1285 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int tc=1; tc<=T; tc++) {
			int N = s.nextInt();
			int min = 10000000;
			int[] array = new int[N];
			for(int i=0; i<N; i++) {
				array[i] = Math.abs(s.nextInt());
				if( min > array[i] ) {
					min = array[i];
				}
			}
			int count = 0;
			for(int i=0; i<N; i++) {
				if ( min == array[i] ) {
					count++;
				}
			}
			
			System.out.println("#"+tc+" "+min+" "+count);
		}
	}
}
