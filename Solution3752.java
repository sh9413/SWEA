import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution3752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			boolean[] ar = new boolean[10001];
			ar[0] = true;
			int max = 0;
			for(int i=0; i<N; i++) {
				int input = sc.nextInt();
				max = max + input;
				for(int j=max; j>=0;j--) {
					if(ar[j] && input+j < 10001) {
						ar[input+j] = true;
					}
				}
			}
			int count = 0;
			for(int i=0; i<10001; i++) {
				if(ar[i]) {
					count++;
				}
			}
			
			System.out.println("#"+tc+" "+count);
		}
	}
	
}
