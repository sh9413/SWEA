import java.util.Scanner;

public class Solution4406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			String line = sc.next();
			line =line.replaceAll("a","");
			line =line.replaceAll("e","");
			line =line.replaceAll("i","");
			line =line.replaceAll("o","");
			line =line.replaceAll("u","");
						
			System.out.println("#"+tc+" "+line);
		}
	}

}
