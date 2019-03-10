import java.util.Scanner;

public class Solution4579 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			char[] c = sc.next().toCharArray();
			boolean check = true;
			for(int i=0; i<c.length; i++) {
				if(c[i] != c[c.length-1-i] && c[i] != '*' && c[c.length-1-i] != '*') {
					check = false;
					break; 
				} else if ( c[i] == '*' || c[c.length-1-i] == '*') {
					break;
				}
			}
			
			if(check) {
				System.out.println("#"+tc+" Exist");
			} else {
				System.out.println("#"+tc+" Not exist");
			}
			
		}
	}
}
