import java.util.Scanner;

public class Solution1989 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int isP = 0;
		for(int tc=1; tc<=T; tc++) {
			String word = s.next();
			int len = word.length();
			for(int i=0; i<len/2; i++) {
				char temp = word.charAt(i);
				char temp_end = word.charAt(len-i-1);
				if(temp == temp_end) {
					isP = 1;
				}
				else {
					isP = 0;
					break;
				}
			}
			System.out.println("#"+tc+" "+isP);
		}
	}
}
