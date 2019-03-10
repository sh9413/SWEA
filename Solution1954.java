import java.util.Scanner;

public class Solution1954 {
	static int[][] arr;
	static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			N = s.nextInt();
			arr = new int[N][N];
			snail();
			print();
		}
	}
	public static void snail() {
		int count = 1;
		for(int i=0; i<N; i++) {
			if(arr[0][i] == 0) { 
				arr[0][i] = count++;
			}
		}
		for(int i=0; i<N; i++) {
			if(arr[i][N-1] == 0) {
				arr[i][N-1] = count++;
			}
		}
		for(int i=N-1; i>=0; i--) {
			if (arr[N-1][i] == 0) {
				arr[N-1][i] = count++;
			}
		}
		for(int i=N-1; i>=0; i--) {
			if (arr[i][0] == 0 ) {
				arr[i][0] = count++;
			}
		}
	}

	public static void print() {
		for(int i=0; i<N;i++) {
			for(int j=0; j<N; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
