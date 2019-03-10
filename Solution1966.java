import java.util.Arrays;
import java.util.Scanner;

public class Solution1966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = s.nextInt();
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = s.nextInt();
			}
			
			for(int i=0; i<N; i++) {
				for(int j=i+1; j<N; j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			System.out.print("#"+tc);
			for(int i=0; i<N; i++) {
				System.out.print(" "+arr[i]);
			}
			System.out.println();
		}
	}

}
