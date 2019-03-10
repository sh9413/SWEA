import java.util.Scanner;

public class Solution2050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			System.out.print((int)str.charAt(i)-64+" ");
		}
	}

}
