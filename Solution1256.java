import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution1256 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			PriorityQueue<String> pq = new PriorityQueue<String>();
			int N = sc.nextInt();
			String s = sc.next();
			for(int i=0; i<s.length(); i++) {
				pq.add(s.substring(i,s.length()));
			}
			for(int i=0; i<N-1; i++) {
				pq.poll();
			}
			System.out.println("#"+tc+" "+pq.poll());
		}
	}
}

