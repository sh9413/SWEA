import java.util.Scanner;

public class Solution4676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			StringBuilder sb = new StringBuilder("");
			String l = sc.next();
			int N = sc.nextInt();
			int[] count = new int[l.length()+1];
			for(int i=0; i<N; i++) {				
				count[sc.nextInt()]++;
			}
			sb.append("#"+tc+" ");
			for(int i=0; i<count[0]; i++) 
				sb.append("-");
			
			for(int i=1; i<=l.length(); i++) {
				sb.append(l.charAt(i-1));
				for(int j=0; j<count[i]; j++) 
					sb.append("-");
			}
			System.out.println(sb);
		}
	}
}