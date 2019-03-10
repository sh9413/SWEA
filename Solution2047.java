import java.util.Scanner;

public class Solution2047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		String str = "";
		for(int i=0; i<line.length(); i++) {
			if ( (int)line.charAt(i) >= 97 && 122 >= (int)line.charAt(i) ) {
				str += (char)((int)line.charAt(i) - 32);
			}
			else {
				str += line.charAt(i);
			}
		}
		System.out.println(str);
	}
}
