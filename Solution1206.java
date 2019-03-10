import java.util.Scanner;

public class Solution1206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			int R = sc.nextInt();
			int[] ar = new int[R];
			for(int i=0;i<R;i++) {
				ar[i] = sc.nextInt(); 
			}
			int count = 0;
			for(int i=2; i<R-2; i++) {
				if ( ar[i] > ar[i-2] && ar[i] > ar[i-1] && ar[i] > ar[i+1] && ar[i] > ar[i+2] ) {
					int left = Math.max(ar[i-2],ar[i-1]);
					int right = Math.max(ar[i+2],ar[i+1]); 
					int max = Math.max(left, right);
					count += ar[i]-max;
				}
			}
			System.out.println("#"+tc+" "+count);
		}
	}
}
