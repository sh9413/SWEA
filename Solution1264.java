import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution1264{
	static Set<String> set;
	static int N;
	static char[] ar;
	static char[] br;
	static double maxlen;
	static StringBuilder sb;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T =sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			set = new HashSet<>();
			ar = sc.next().toCharArray();
			br = sc.next().toCharArray();
			sb = new StringBuilder("");
			maxlen = 0;
			for(int i=0; i<N; i++) {
				go(i);
			}
			for(int i=0; i<N; i++) {
				go2(i);
			}
			System.out.println(maxlen);
		}
	}
	
	public static void go(int depth) {
		if(depth==N) {
			return ;
		}
		set.add(sb.toString());
		for(int i=depth; i<N; i++) {
			sb.append(ar[depth]);
			go(depth+1);
			sb.deleteCharAt(sb.length()-1);
		}
	}
	
	public static void go2(int depth) {
		if(depth==N) {
			return ;
		}
		if( maxlen > sb.length() && set.contains(sb.toString()) ) {
			maxlen = sb.length();
		}
		for(int i=depth; i<N; i++) {
			sb.append(br[depth]);
			go(depth+1);
			sb.deleteCharAt(sb.length()-1);
		}
	}
	

}
