import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution6855 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			ArrayList<Integer> list = new ArrayList<>();
			int N = sc.nextInt();
			int K = sc.nextInt();
			int sum = 0;
			int[] ar = new int[N];
			for(int i=0;i<N; i++) {
				ar[i] = sc.nextInt();
			}
			for(int i=0; i<N-1; i++) {
				int temp = ar[i+1] - ar[i];
				list.add(temp);
				sum += temp;
			}
			Collections.sort(list, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					if( o1 < o2 ) {
						return 1;
					} else {
						return -1;
					}
				}
			});
			for(int i=0; i<K-1 && i<N-1; i++) {
				sum -= list.get(i);
			}
			System.out.println("#"+tc+" "+sum);
		}
	}
}
