import java.util.Scanner;

public class Solution1970 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
        int m[] = {50000,10000,5000,1000,500,100,50,10};
		for(int tc=1; tc<=T; tc++) { 	     
	            int N = s.nextInt();
	            System.out.println("#"+tc);
	            for (int j = 0; j < m.length; j++) {
	                System.out.print((N/m[j]) + " ");
	                N %= m[j];
	            }
	            System.out.println(); 
	        }
		}
	}
