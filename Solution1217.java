import java.util.Scanner;

public class Solution1217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		for(int tc=1; tc<=10; tc++) {
			int T = s.nextInt();
			int N = s.nextInt();
			int M = s.nextInt();
			int num = 1;
			for(int i=0; i<M; i++) {
				num = num * N;
			}
			
			System.out.println("#"+T+" "+num);
		}
	}

}
