import java.util.Scanner;
import java.util.Arrays;
class Solution1959 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for( int t=1; t<=T; t++) {
            int n, m, i, k;
            n = sc.nextInt();
            m = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            for( i=0; i<n; i++) a[i] = sc.nextInt();
            for( i=0; i<m; i++) b[i] = sc.nextInt();
            int sum, max = 0;
            for( k=0; k<m-n+1; k++ ) {
                sum = 0;
                for( i=0; i<n; i++) sum += a[i] * b[i+k];
                if( sum > max ) max = sum;
            }
            for( k=0; k<n-m+1; k++ ) {
                sum = 0;
                for( i=0; i<m; i++) sum += a[i+k] * b[i];
                if( sum > max ) max = sum;
            }
            System.out.format("#%d %d\n", t, max );
        }
    }
}