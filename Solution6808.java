import java.util.Scanner;

public class Solution6808 {
	static int[] ar;
	static int winCount;
	static int loseCount;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			winCount = 0;
			loseCount = 0;
			boolean[] deck = new boolean[19];
			ar = new int[9];
			int[] br = new int[9];
			for(int i=0; i<9; i++) {
				ar[i] = sc.nextInt();
				deck[ar[i]] = true;
			}
			int index = 0;
			for(int i=1; i<=18; i++) {
				if ( !deck[i] ) {
					br[index++] = i;
				}
			}
			
			perm(br,0,9,9);
			System.out.println("#"+tc+" "+winCount+" "+loseCount);
			
		}
	}
	public static boolean counting(int[] br,int[] ar) {
		int point_a = 0;
		int point_b = 0;
		int point;
		for(int i=0; i<9; i++) {
			point = br[i]+ar[i];
			if( br[i] > ar[i] ) {
				point_b += point;
			} else {
				point_a += point;
			}
		}
		// 0 이면 a.. 규영이가 이김.
		return point_a>point_b ? true : false;
	}
	
	
	public static void perm(int[] br, int depth, int n, int k) {
		if (depth == k) { 
			if ( counting(br,ar) ) // 규영이가 이겼을 경우에
				winCount++;
			else 
				loseCount++;
			return; 
			} 
		for (int i = depth; i < n; i++) { 
			swap(br, i, depth); 
			perm(br, depth + 1, n, k); 
			swap(br, i, depth); 
			} 
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; 
		}
	

}
