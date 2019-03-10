import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution4672 {
	static PriorityQueue<Character> pq;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T =sc.nextInt();
		for(int tc=1;  tc<=T; tc++) {
			int count = 0;
			pq = new PriorityQueue<>();
			char[] c= sc.next().toCharArray();
			for(int i=0; i<c.length; i++) {
				pq.add(c[i]);
			}
			StringBuilder sb = new StringBuilder("");
			while(!pq.isEmpty()) {
				sb.append(pq.poll());
			}
			for(int i=0; i<sb.length(); i++) {
				for(int j=i; j<sb.length(); j++) {
					String sub = sb.substring(i,j+1);
					if(palindrome(sub)) {
						count++;
					}
				}
			}

			System.out.println("#"+tc+" "+count);
		}
	}
	public static boolean palindrome(String s) {
		for(int i=0; i<s.length(); i++) {
			if ( s.charAt(i) != s.charAt(s.length()-i-1) ) {
				return false;
			}
		}
		return true;
	}
}
