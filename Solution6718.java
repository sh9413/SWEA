import java.util.Scanner;

public class Solution6718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T= s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = s.nextInt();
			int result = -1;
			if(N<100) {
				result = 0;
			}
			else if(N>=100 && N<1000) {
				result = 1;
			}
			else if(N>=1000 && N<10000) {
				result = 2;
			}
			else if(N>=10000 && N<100000) {
				result = 3;
			}
			else if(N>=100000 && N<1000000) {
				result = 4;
			}
			else if(N>=1000000) {
				result = 5;
			}
			System.out.println("#"+tc+" "+result);
		}
	}

}
