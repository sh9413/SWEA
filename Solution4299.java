import java.util.Scanner;

public class Solution4299 {
	    public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	         
	        for(int tc = 1; tc <= T; tc++) {
	            int d = (sc.nextInt()-11) * 24 * 60;
	            int h = (sc.nextInt()-11) * 60;
	            int m = sc.nextInt() - 11;
	             
	            System.out.println("#" + tc + " " + ( ( (d+h+m) > -1) ? d+h+m : -1) );
	        }
	    }
	}
