import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution1257 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			String s = sc.next();
			Set<String> set = new HashSet<>();
			for(int i=0; i<s.length(); i++) {
				for(int j=i; j<=s.length(); j++) {
					set.add(s.substring(i, j));
				}
			}
			String[] ss = new String[set.size()];
			ss = set.toArray(ss);
			Arrays.sort(ss);
			if( N >= ss.length ) {
				System.out.println("#"+tc+" none");
			} else {
				System.out.println("#"+tc+" "+ss[N]);
			}
		}
	}

}
