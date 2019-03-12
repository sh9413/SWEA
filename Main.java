import java.util.Scanner;

public class Main {
    static long[][] unit = {{1, 1}, {1, 0}};
    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();
    	while ( n != -1 ) { 
	        if (n <= 1) {
	            System.out.println(n);
	        } else{
	            long [][] ans = search(n);
	            if (ans[0][1]%10000 == 0) {
	            	System.out.println("0'");
	            } else {
	            	System.out.println(ans[0][1] % 10000);
	            }
	        }
	        n = sc.nextLong();
    	}
    }
    
    static long[][] matrixTime(long[][] a, long[][] b) {
        long[][] result = new long[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += (a[i][k] * b[k][j])%10000;
                }
            }
        }
        return result;
    }

    static long[][] search(long n) {
        if (n <= 1) return unit;
        long[][] sub = search(n / 2); // n/2 재귀
        long[][] out = matrixTime(sub,sub);
        if(n % 2 ==1) // 홀수라면, 한번 더 계산
            out = matrixTime(out, unit);

        return out;

    }
}