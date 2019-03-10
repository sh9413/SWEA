import java.util.Scanner;

public class Solution2817 {
	static int[] ar;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			ar = new int[N];
			for(int i=0; i<N;i++) {
				ar[i] = sc.nextInt();
			}
			count = 0;
			go(0,N,0,K);
			System.out.println("#"+tc+" "+count);
		}
		
	}
	
	public static void go(int depth,int N,int sum,int K) {
		if(depth==N) {
			if (sum == K) {
				count++;
			}
			return ;
		}
		go(depth+1,N,sum+ar[depth],K);
		go(depth+1,N,sum,K);
	}
	
}
