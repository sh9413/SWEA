import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution5515 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int M = sc.nextInt();
			int D = sc.nextInt();
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(1, 0);
			map.put(2, 31);
			map.put(3, 60);
			map.put(4, 91);
			map.put(5, 121);
			map.put(6, 152);
			map.put(7, 182);
			map.put(8, 213);
			map.put(9, 244);
			map.put(10, 274);
			map.put(11, 305);
			map.put(12, 335);
			int day = map.get(M)+D;
			System.out.println("#"+tc+" "+(day+3)%7);
		}
	}
}
