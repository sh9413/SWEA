import java.util.Scanner;

public class Solution7193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			String SX = sc.next();
			
			long sum = 0;
			long NN = 1;
			for(int i=SX.length()-1; i>=0; i--) {
				sum += ((SX.charAt(i)-'0')*NN) % (N-1);
				NN = (NN*N)%(N-1);
			}
			System.out.println("#"+tc+" "+sum%(N-1));
		}
	}
}
