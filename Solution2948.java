import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution2948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			Set<String> set = new HashSet<>();
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			for(int i=0; i<A; i++) {
				set.add(sc.next());
			}		
			int count = 0;
			for(int j=0; j<B; j++) {
					if(set.contains(sc.next())) 
						count++;
			}
			System.out.println("#"+tc+" "+count);
		}
	}
}
