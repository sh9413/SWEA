import java.util.Arrays;
import java.util.Scanner;

public class Solution1984 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int[] arr = new int[10];
			for(int i=0; i<10; i++) {
				arr[i] = s.nextInt();
			}
			Arrays.sort(arr);
			int sum = 0;
			for(int i=1; i<9; i++) {
				sum += arr[i];
			}
			double avg = Math.round(sum/8.0);
			System.out.println("#"+tc+" "+(int)avg);
		}
	}

}
