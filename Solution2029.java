import java.util.Scanner;

public class Solution2029 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int i=1; i<=T; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println("#"+i+" "+a/b+" "+a%b);
		}
	}
}
