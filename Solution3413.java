import java.util.Scanner;

public class Solution3413 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			String A = sc.next();
			String B = sc.next();
			int count = 0;
			while (A.contains(B)) {
				A = A.replaceFirst(B, "");
				count++;
			}
			System.out.println("#"+tc+" "+(count+A.length()));
		}
	}
}
