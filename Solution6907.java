import java.util.HashMap;
import java.util.Scanner;

public class Solution6907 {
	static HashMap<String, Integer> map;
	public static void main(String[] args) {
		map = new HashMap<>();
		String[] measure = {"yotta","zetta","exa","peta","tera","giga","mega","kilo","hecto",
				"deca","deci","centi","milli","micro","nano","pico","femto","ato","zepto","yocto"};
		Integer[] num = {+24,+21,+18,+15,+12,+9,+6,+3,+2,+1,
				-1,-2,-3,-6,-9,-12,-15,-18,-21,-24};
		for(int i=0; i<measure.length; i++) {
			map.put(measure[i], num[i]);
		}
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<T; tc++) {   
			String A = sc.next();
			String B = sc.next();
			boolean B_check = false;
			if ( map.containsKey(B) ) {
				B_check = true;
				String C = sc.next();
			} else {
				String C = B;
				sc.next();
			}
			for(int i=0; i<A.length(); i++) {
				if ( A.charAt(i) == '.' ) { // 소수점을 찾아 그 인덱스를 저장
					int index = i;
				}
			}
			
			
		}
	}

}
