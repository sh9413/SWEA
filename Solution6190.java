import java.util.Scanner;

public class Solution6190 {
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int[] ar = new int[N];
			for(int i=0;i<N;i++) {
				ar[i] = sc.nextInt();
			}
			max = -1;
			go(0,ar,1,N,0);
			System.out.println("#"+tc+" "+max);
		}
	}
	public static boolean isOK(int num) {
		String s = (num+"");
		for(int i=1; i<s.length(); i++) {
			if ((s.charAt(i)-'0') - (s.charAt(i-1)-'0') < 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void go(int depth,int[] ar,int num,int N,int j) {
		if(depth==2) {
			if ( isOK(num) ) {
				max = max > num ? max : num;
			}
			return ;
		}
		
		for(int i=j; i<N; i++) {
			go(depth+1,ar,num*ar[i],N,i+1);
		}	
	}
}
