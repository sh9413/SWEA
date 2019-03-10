import java.util.Scanner;

public class Solution1213 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(int tc=1; tc<=10; tc++) {
			int T = s.nextInt();
			String f = s.next();
			int len = f.length();
			String str = s.next();
			int count =0;
			
			for(int i=0; i<str.length()-len+1; i++) {
				//System.out.println(str.substring(i,i+len));
				if(f.equals(str.substring(i, i+len))) {
					count++;
				}
			}
			
			System.out.println("#"+T+" "+count);
		}
	}
}
