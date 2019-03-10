import java.util.Scanner;

public class Solution2693 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1000; i<10000; i++) {
			String tmp = i+"";
			int a = tmp.charAt(0)-'0';
			int b = tmp.charAt(1)-'0';
			int c = tmp.charAt(2)-'0';
			int d = tmp.charAt(3)-'0';
			if ( a+b == c+d ) {  
				if( a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
					System.out.println(tmp);
				}
			}
		}
	}
}
