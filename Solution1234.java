import java.util.Scanner;

public class Solution1234 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10; tc++) {
			int N = sc.nextInt();
			String s = sc.next();
			char[] ar = s.toCharArray();
			boolean check = true;
			while (check) {
				check = false;
				for(int i=0; i<s.length()-1; i++) {
					if ( s.charAt(i)== s.charAt(i+1) ) {
						s = s.substring(0,i)+s.substring(i+2,s.length());
						check = true;
					}
				}
			}
			System.out.println("#"+tc+" "+s);
		}	
	}
}
