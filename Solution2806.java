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
		for(int i=0; i<d; i++) { // ���� �׽�Ʈ�� �� ���� ������ ��ġ�� ���鼭 �������� �Ǵ��ϱ�. 
			if (result[d] == result[i] || Math.abs(d-i) == Math.abs(result[d]-result[i])) {
				return false;
			}
		}
		return true;
	}
	
   
}
