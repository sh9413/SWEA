import java.math.BigInteger;
import java.util.Scanner;

public class Solution5549 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			BigInteger bigI = new BigInteger(sc.next());
			BigInteger odd = new BigInteger("2");
			BigInteger res = bigI.mod(odd);
			BigInteger zero = new BigInteger("0");
			
			if( res.equals(zero) ) {
				System.out.println("#"+tc+" Even");
			} else {
				System.out.println("#"+tc+" Odd");
			}
		}
	}

}
