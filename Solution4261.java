import java.util.Scanner;

public class Solution4261 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			String input = sc.next();
			char[] s = input.toCharArray();
			int N = sc.nextInt();
			int count = 0;
			for(int i=0;i<N; i++) {
				char[] s2 = sc.next().toCharArray();
				for(int j=0; j<s2.length; j++) {
					if ( isOK(s[j],s2[j]) ) {
						if ( j == s2.length-1 ) {
							count++;
						}
					} else {
						break;
					}
				}
			}
			
			System.out.println("#"+tc+" "+count);
		}
	}
	
	public static boolean isOK(char c,char s) {
		if(c=='1') { return false; }
		else if(c=='2') { if(s == 'a' || s == 'b' || s == 'c') { return true; } }
		else if(c=='3') { if(s == 'd' || s == 'e' || s == 'f') { return true; }}
		else if(c=='4') { if(s == 'g' || s == 'h' || s == 'i') { return true; }}
		else if(c=='5') { if(s == 'j' || s == 'k' || s == 'l') { return true; }}
		else if(c=='6') { if(s == 'm' || s == 'n' || s == 'o') { return true; }}
		else if(c=='7') { if(s == 'p' || s == 'q' || s == 'r' || s == 's') { return true; }}
		else if(c=='8') { if(s == 't' || s == 'u' || s == 'v') { return true; }}
		else if(c=='9') { if(s == 'w' || s == 'x' || s == 'y' || s == 'z') { return true; }}
		return false;
	}
}
