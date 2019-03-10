import java.util.Scanner;

public class Solution1945 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = s.nextInt();
			int[] prime = {2,3,5,7,11};
			int[] count = new int[5]; // {2,3,5,7,11}
			for(int i=0; i<5; i++) {
				while( N%prime[i] == 0 ) {
					N = N/prime[i];
					count[i]++;
				}
			}
			
			System.out.println("#"+tc+" "+count[0]+" "+count[1]+" "+count[2]+" "+count[3]+" "+count[4]);
		}
	}

}
