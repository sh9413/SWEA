import java.util.Scanner;

public class Solution2005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = s.nextInt();
			System.out.println("#"+tc);
			for(int i=0; i<N; i++) {
				for(int j=0; j<=i; j++) {
				System.out.print(pascal(i,j)+" ");
				}
				System.out.println();
			}
		}
		
	}

	public static int pascal(int i,int j) {
		if(j == 0 || i == j) {
			return 1;
		}
		return pascal(i-1,j-1) + pascal(i-1,j);
	}

}
