import java.util.Scanner;

public class Solution2072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int sum = 0;
			for(int i=0; i<10; i++) {
				int input = s.nextInt();
				if(input%2==1) {
					sum += input;
				}
			}
			System.out.println("#"+tc+" "+sum);
		}

	}

}
