import java.util.Scanner;

public class Solution2806 {

	static int count;
	static int[] result;
	static int N;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T; tc++) {
			N = sc.nextInt();
			result = new int[N];
			count = 0;
			NQueen(0);
			System.out.println("#"+tc+" "+count);
		}
	}
	
	static void NQueen(int d) {
		if ( d == N ) {
			count++;
			return ;
		}
		
		for(int i=0; i<N; i++) {
			result[d] = i;
			if( isOk(d) ) {
				NQueen(d+1);
			}
		}
	}
	
	static boolean isOk(int d) {
		for(int i=0; i<d; i++) { // 지금 테스트할 퀸 이전 퀸들의 위치들 보면서 괜찮은지 판단하기. 
			if (result[d] == result[i] || Math.abs(d-i) == Math.abs(result[d]-result[i])) {
				return false;
			}
		}
		return true;
	}
	
   
}
