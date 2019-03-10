import java.util.Scanner;

public class Solution2068 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int tc=1; tc<=T; tc++) {
			int max = -1;
			for(int i=0; i<10; i++) {
				int input = s.nextInt();
				if(max<input) {
					max = input;
				}
			}
			System.out.println("#"+tc+" "+max);
		}
		
	}
}
