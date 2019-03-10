import java.util.Scanner;

public class Solution4751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			StringBuilder sb1 = new StringBuilder(".");
			StringBuilder sb2 = new StringBuilder(".");
			StringBuilder sb3 = new StringBuilder("#");
			
			String s = sc.next();
			for(int i=0; i<s.length(); i++) {
				sb1.append(".#..");
				sb2.append("#.#.");
				sb3.append("."+s.charAt(i)+".#");
			}
			
			System.out.println(sb1);
			System.out.println(sb2);
			System.out.println(sb3);
			System.out.println(sb2);
			System.out.println(sb1);
			
		}
	}
}
