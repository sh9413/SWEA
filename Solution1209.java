import java.util.Scanner;

public class Solution1209 {
	final static int N = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		for(int tc=1; tc<=10; tc++) {
			int T = s.nextInt();
			int sum = 0;
			int max = -1;
			int[][] arr =new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = s.nextInt();
				}
			}
			for(int i=0; i<N; i++) {
				sum = 0;
				for(int j=0; j<N; j++) {
					sum += arr[i][j];
				}
				if ( sum > max ) {
					max = sum;
				}
			}
			for(int i=0; i<N; i++) {
				sum = 0;
				for(int j=0; j<N; j++) {
					sum += arr[j][i];
				}
				if ( sum > max ) {
					max = sum;
				}
			}
			System.out.println("#"+T+" "+max);
		}
	}

}
