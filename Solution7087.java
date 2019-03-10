import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution7087 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			boolean[] alpha = new boolean[27];
			alpha[0] = true;
			PriorityQueue<String> pq = new PriorityQueue<>();
			for(int i=0;i<N;i++) { 
				pq.add(sc.next());
			}
			int count=0;
			while(!pq.isEmpty()) {
				String s = pq.poll();
				if(alpha[s.charAt(0)-65]) {
					alpha[s.charAt(0)-64] = true;
				} else {
					break;
				}
			}
			
			for(int i=1; i<alpha.length; i++) {
				if(alpha[i]) {
					count++;
				} else {
					break;
				}
			}
			System.out.println("#"+tc+" "+count);
		}
	}
}
