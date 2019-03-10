import java.math.BigInteger;
import java.util.*;

public class Solution5607 {
    static long[] fact = new long[1000001];

    public static void main(String[] args) {
        fact[0] = 1;
        for(int i=1; i<fact.length; i++) fact[i] = fact[i-1]*i % 1234567891;
        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
            int N = sc.nextInt();
            int R = sc.nextInt();
            BigInteger res = nCr(N,R,1234567891);
            System.out.println("#"+tc+" "+res);
        }
    }

    static BigInteger nCr(int n, int r, int p) {
        BigInteger P = BigInteger.valueOf(p);
        BigInteger A = BigInteger.valueOf(fact[n]);
        BigInteger B = BigInteger.valueOf(fact[r]).modInverse(P).remainder(P);
        BigInteger C = BigInteger.valueOf(fact[n-r]).modInverse(P).remainder(P);
        return A.multiply(B).multiply(C).remainder(P);
    }
}