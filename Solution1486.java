import java.util.Scanner;

public class Solution1486 {
	static int fit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int B = sc.nextInt();
			int[] p = new int[N];
			for(int i=0;i<N;i++) {
				p[i] = sc.nextInt();
			}
			fit = Integer.MAX_VALUE;
			
			go(0,p,N,0,B);
			System.out.println("#"+tc+" "+(fit-B));
		}
	}
	
	public static void go(int depth,int[] p,int N,int sum,int B) {
		if(depth==N) {
			if ( sum >= B && sum-B < fit-B) {
				fit = sum;
			}
			return ;
		}
		
		go(depth+1,p,N,sum+p[depth],B);
		go(depth+1,p,N,sum,B);
		
	}
}
