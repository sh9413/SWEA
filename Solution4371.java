import java.util.ArrayList;
import java.util.Scanner;

public class Solution4371 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int[] ar = new int[N];
			ar[0] = sc.nextInt();
			ar[1] = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			list.add(ar[1]-ar[0]);
			for(int i=2; i<N; i++) {
				ar[i] = sc.nextInt();
				boolean check = true;
				for(int j=0; j<list.size(); j++) {
					if( (ar[i]-ar[0])%list.get(j) == 0) { 
						break;
					}
					if ( j+1 == list.size() ) {
						check = false;
					}
				}
				if ( !check ) {
					list.add(ar[i]-ar[0]);
				}
			}
			System.out.println("#"+tc+" "+list.size());			
		}
	}

}
