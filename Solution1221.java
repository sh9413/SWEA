import java.util.Scanner;

public class Solution1221 {
/* 결과 텍스트가 너무 많아 이클립스에서 제대로출력되지않음, 정답 제출하면 정답 처리 됨. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] number = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			s.next();
			int N = s.nextInt();
			String[] arr = new String[N];
			for(int i=0; i<N; i++) {
				arr[i] = s.next();
			}
			System.out.print("#"+tc+" ");
			for(int index=0; index<10; index++) {
				for(int i=0; i<N; i++) {
					if(arr[i].equals(number[index])) {
						System.out.print(arr[i]+" ");
					}
				}
			}
			System.out.println();
		}
	}
}