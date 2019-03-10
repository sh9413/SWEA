import java.util.Scanner;

public class Solution6019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			double dis = (double)s.nextInt();
			double A = (double)s.nextInt();
			double B = (double)s.nextInt();
			double F = (double)s.nextInt();
			
			double d = dis/(A+B)*F;
			
			System.out.printf("#"+tc+" %.6f",d);
		}
	}

}

