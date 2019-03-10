import java.util.Scanner;

public class Solution1986 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = s.nextInt();
			int result;
			if(N%2==1) {//홀수이면
				result = N/2 + 1;
			}
			else {
				result = -(N/2);
			}
			System.out.println("#"+tc+" "+result);
		}
	}

}
