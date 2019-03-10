import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution1808 {
	static boolean[] visit;
	static int N;
	static ArrayList<Integer> list;
	static int min;
	static boolean[] numpad;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			numpad = new boolean[10];
			for (int i = 0; i < 10; i++) {
				int temp = sc.nextInt();
				if (temp == 1) {
					numpad[i] = true;
				}
			}
			list = new ArrayList<>();
			N = sc.nextInt();
			init();
			Collections.sort(list, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					if ( o1 < o2 ) {
						return 1;
					} else if (o1>o2) {
						return -1;
					} else {
						return 0;
					}
				}
			});
			//System.out.println(list);
			min = Integer.MAX_VALUE;
			dfs(N, 0, 0);
			if (min == Integer.MAX_VALUE) {
				min = -1;
			}
			if ( N == 1 ) {
				min = 2;
			}
			System.out.println("#" + tc + " " + min);
		}
	}
	public static void init() {
		String s = String.valueOf(N);
		for (int i = 1; i < 10; i++) {
			if (numpad[i]) {
				list.add(i);
			}
		}
		for(int k=1; k<s.length(); k++) {
			int size=list.size();
			for(int i=0; i<size; i++) {
				for (int j = 0; j < 10; j++) {
					if (numpad[j]) {
						String temp = list.get(i)+""+j; 
						int input = Integer.parseInt(temp);
						if( input <= N) {
							list.add(input);		
						}
					}
				}
			}
		}
	}
	public static void dfs(int N, int cnt, int index) {
		if ( min <= cnt ) {
			//System.out.println("cut :" +N+" "+cnt);
			return;
		}
		if (N == 1) {
			//System.out.println("N=1 :" +N+" "+cnt);
			min = min < cnt ? min : cnt;
			return;
		}

		for (int i = index; i < list.size(); i++) {
			int temp = list.get(i);
			if (N >= temp  && (N / temp) * temp == N && temp != 1) {
				//System.out.println("IN FOR :"+ N+" "+temp+" "+cnt);
				dfs(N/temp, cnt + String.valueOf(list.get(i)).length() + 1, i);
			}
		}
	}
}
