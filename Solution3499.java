import java.util.Scanner;

public class Solution3499 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			String[] prev;
			if(N%2==1) {
				prev= new String[N/2+1];// if 3 ... 2 4 ... 2
			} else {
				prev = new String[N/2];
			}
			String[] next = new String[N/2];// if 3 ... 1 4 ... 2
			for(int i=0; i<prev.length; i++) {
				prev[i] = sc.next();
			}
			for(int i=0; i<next.length; i++) {
				next[i] = sc.next();
			}
			System.out.print("#"+tc+" ");
			for(int i=0; i<next.length; i++) {
				System.out.print(prev[i]+" ");
				System.out.print(next[i]+" ");
			}
			
			if(N%2==1) {
				System.out.print(prev[N/2]);
			}			
			System.out.println();
			
		}
	}
}
