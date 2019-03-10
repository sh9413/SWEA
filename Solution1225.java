import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution1225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int tc=1; tc<=10; tc++) {
			sc.nextInt();
			Queue<Integer> q = new LinkedList<Integer>();
			for(int i=0; i<8; i++) {
				q.offer(sc.nextInt());
			}
			boolean check = true;
			while ( check ) {
				for(int i=1; i<=5; i++) {
					int tmp = q.poll()-i;
					
					if ( tmp <= 0 ) {
						q.offer(0);
						check = false;
						break;
					}
					q.offer(tmp);
				}
			}
			System.out.print("#"+tc+" ");
			for(int i=0; i<8; i++) {
				System.out.print(q.remove()+" ");
			}
			System.out.println();
		}
		
	}

}

