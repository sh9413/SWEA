import java.util.Scanner;

public class Solution7102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] count = new int[N+M+2];
			int max = -1;
			for(int i=1; i<N+1; i++) {
				for(int j=1; j<M+1; j++) {
					count[i+j]++;
					max = max > count[i+j] ? max : count[i+j];
				}
			}
			
			System.out.print("#"+tc);
			for(int i=0;i<count.length;i++) {
				if(max == count[i]) {
					System.out.print(" "+i);
				}
			}
			System.out.println();
		}
	}
}
