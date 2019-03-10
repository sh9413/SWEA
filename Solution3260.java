import java.math.BigInteger;
import java.util.Scanner;

public class Solution3260 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			BigInteger A = new BigInteger(sc.next());
			BigInteger B = new BigInteger(sc.next());

			System.out.println("#"+tc+" "+A.add(B));
		}
	}
}
