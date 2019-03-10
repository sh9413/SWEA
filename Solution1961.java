import java.util.Scanner;

public class Solution1961 {
	static int[][] arr;
	static int N;
	static int[][] temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			N = s.nextInt();
			arr = new int[N][N];
			temp = new int[N][N];
			int count = 1;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = count++;
				}
			}
			int[][] result = new int[N][N*N];

			rotate(arr,temp);
			rotate(temp,arr);
			rotate(arr,temp);
			for(int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					result[i][j] = temp[i][j];
				}
			}
			rotate(temp,arr);
			rotate(arr,temp);
			rotate(temp,arr);
			for(int i=0; i<N; i++) {
				for (int j=N; j<N*(N-1); j++) {
					result[i][j] = arr[i][j-N];
				}
			}
			rotate(arr,temp);
			rotate(temp,arr);
			rotate(arr,temp);
			for(int i=0; i<N; i++) {
				for (int j=N*(N-1); j<N*N; j++) {
					result[i][j] = temp[i][j-N*(N-1)];
				}
			}
			
			
			print(result,N);
		}
	}
	
	public static void print(int[][] arr,int N) {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N*N; j++) {
				System.out.print(arr[i][j]);
				if( j%N == N-1 ) {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		System.out.println();
	}
	
	public static void rotate(int[][] arr,int[][] temp) {
		for(int j=0; j<N; j++) {
			for(int i=0; i<N; i++) {
				temp[N-(j+1)][i] = arr[i][j];
			}
		}
	}
}
