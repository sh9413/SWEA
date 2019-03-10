import java.util.Scanner;

public class Solution3809 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int[] ar = new int[N];
			boolean[] check = new boolean[1000];
			for(int i=0; i<N; i++) {
				ar[i] = sc.nextInt();
			}
			check[ar[0]] = true;
			
			for(int i=1; i<N; i++) {
				int a = Integer.parseInt(ar[i-1]+""+ar[i]);
				check[ar[i]] = true;
				check[a] = true;
			}
			for(int i=2; i<N; i++) {
				int a = Integer.parseInt(ar[i-2]+""+ar[i-1]+""+ar[i]);
				check[a] = true;
			}
			check[ar[N-1]] = true;
			
			for(int i=0; i<1000; i++) {
				if(!check[i]) {
					System.out.println("#"+tc+" "+i);
					break;
				}
			}
			
		}
	}
}
