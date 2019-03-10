import java.util.Scanner;
public class Solution3347 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] ai = new int[N];
			int[] count = new int [N];
			int max = -1;
			int index = -1;
			for(int i=0; i<N; i++) {
				ai[i] = sc.nextInt();
			}
			
			for(int i=0; i<M; i++) {
				int b = sc.nextInt();
				for(int j=0; j<N; j++) {
					if( ai[j] <= b ) {
						count[j]++;
						if ( max < count[j] ) {
							max = count[j];
							index = j;
						}
						break;
					}
				}
			}
			
			System.out.println("#"+tc+" "+(index+1));
			
		}
	}
}
