import java.util.ArrayList;
import java.util.Scanner;

public class Solution5896 {
	static int[] prime;
	static int count;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[1001];
		for(int i=2; i<arr.length; i++) {
			arr[i] = i;
		}
		for(int i=2; i<arr.length; i++) {
			if(arr[i] == 0) 
				continue;
			for(int j=i+i; j<arr.length; j+=i) {
				arr[j] = 0;
			}
		}
		prime = new int[168];
		int index = 0;
		for(int i=2; i<arr.length; i++) {
			if(arr[i] != 0) {
				prime[index++] = i;
			}
		}
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			count = 0;
			go(N,0,0,0);
			System.out.println("#"+tc+" "+count);
			
		}
	}
	public static void go(int N,int sum,int depth,int j) {
		if (depth == 3) { 
			if ( sum == N ) {
				count++;
			} else if ( sum > N ) {
				return ;
			}
			return ;
		}
		for(int i=j; i<prime.length; i++) {
			if ( sum > N ) {
				break;
			}
			go(N,sum+prime[i],depth+1,i);
		}
		
	}
	
}
