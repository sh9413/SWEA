import java.util.Scanner;

public class Solution3750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			String N = sc.next();
			int sum = 0;
			while (true) {
				for(int i=0; i<N.length(); i++) {
					sum += N.charAt(i)-'0';
				}
				if( sum < 10 ) {
					break;
				}
				N = sum + "";
				sum = 0;
			}
			System.out.println("#"+tc+" "+sum);
		}
		
	}
}
