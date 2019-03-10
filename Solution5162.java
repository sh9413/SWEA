import java.util.Scanner;

public class Solution5162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int A = s.nextInt();
			int B = s.nextInt();
			int C = s.nextInt();
			int res = 0;
			if (A>B) {
				res = C/B;
			}
			else
				res = C/A;
			
			System.out.println("#"+tc+" "+res);
		}
	}

}
