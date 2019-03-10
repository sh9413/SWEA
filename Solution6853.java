import java.util.Scanner;

public class Solution6853 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int N = sc.nextInt();
			int out = 0;
			int in = 0;
			int fit = 0;
			
			for(int i=0; i<N; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				if (x1 < x && x < x2 && y1 < y && y < y2)  {
					in++;
				} else if ( (((x <= x1) || (x <= x2)) && (y1<=y && y<=y2)) &&  
						   (((y <= y1) || (y <= y2)) && (x1<=x && x<=x2)) ) {
					fit++;
				} else {
					out++;
				}
			}
			
			System.out.println("#"+tc+" "+in+" "+fit+" "+out);
		}
	}
}
