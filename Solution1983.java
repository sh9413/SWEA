import java.util.Arrays;
import java.util.Scanner;

public class Solution1983 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		String[] grade = {"D0","C-","C0","C+","B-","B0","B+","A-","A0","A+"};
		for(int tc=1; tc<=T; tc++) {
			int N = s.nextInt();
			int k = s.nextInt();
			double[] score = new double[N];
			for(int i=0; i<N; i++) {
				score[i]= s.nextInt()*0.35*100 +s.nextInt()*0.45*100 + s.nextInt()*0.20*100;
			}
			double store = score[k-1];
			Arrays.sort(score);
			int index;
			for(int i=N-1; i>=0; i--) {
				if(score[i] == store) {
					index = i/(N/10);
					System.out.println("#"+tc+" "+grade[index]);
					break;
				}
			}
			

		}
	}

}
