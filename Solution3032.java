import java.util.Scanner;

public class Solution3032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		for(int tc=1; tc<=T; tc++) {
			long A = sc.nextLong();
			long B = sc.nextLong();
			long x; long y;
			x = Extended_Euclid(A, B);
			y = (1-B*x)/A;
			if (x != 0) { 
				System.out.println("#"+tc+" "+y+" "+x);
			} else {
				System.out.println("#"+tc+" -1");
			}
		}
	}
    private static long Extended_Euclid(long r1, long r2) {
        long r, q = 0, s, s1 = 1, s2 = 0, t, t1 = 0, t2 = 1, tmp = r1;
 
        while (r2 != 0) {
            q = r1 / r2;
            r = r1 % r2;
            s = s1 - q * s2;
            t = t1 - q * t2;
 
            r1 = r2;
            r2 = r;
            s1 = s2;
            s2 = s;
            t1 = t2;
            t2 = t;
        }
        if (r1 != 1) // 역원이 있음
           return 0;
 
        return t1;
    }

}