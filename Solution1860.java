import java.util.Scanner;

public class Solution1860 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			int[] people = new int[N];
			for(int i=0; i<N; i++) {
				people[i] = sc.nextInt();
			}
			int boong = 0;
			int time = 0;
			int num = 0;
			boolean res = true;
			while ( res ) {
				if(time % M == 0 &&  time != 0) { // M초마다..
					boong += K;
				}
				for(int i=0; i<N; i++) {
					if (people[i] == time) {
						if ( boong < 1 ) {
							res = false;
						}
						num++;
						boong--;
					}
				}
				if(num == N) {
					break;
				}
				
				time++;
			}
			
			if (res) {
				System.out.println("#"+tc+" Possible");
			} else {
				System.out.println("#"+tc+" Impossible");
			}
			
		}
	}
}
