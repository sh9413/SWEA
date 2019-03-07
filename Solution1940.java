import java.util.Scanner;

public class Solution1940 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = s.nextInt();
			int dis = 0;
			int acc = 0;
			for(int i=0; i<N; i++) {
				int m = s.nextInt();
				int a= 0;
				if( m!=0 ) {
					a = s.nextInt();
				}
				switch (m) {
					case 1: {
						acc = acc+a;
						break;
					}
					case 2: {
						acc = acc-a;
						if( acc < 0 ) {
							acc = 0;
						}
						break;
					}
				}
				dis = dis + acc;
			}
			System.out.println("#"+tc+" "+dis);
		}
	}

}
