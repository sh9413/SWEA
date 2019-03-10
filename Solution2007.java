import java.util.Scanner;

public class Solution2007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		 int T=s.nextInt();
	        for(int tc=1;tc<=T;tc++) {
	            System.out.print("#"+tc+" ");
	            String line=s.next();
	            String str="";
	            for(int y=30;y>0;y--) {
	                if(line.substring(0, y/2).equals(line.substring(y/2,y))) {
	                    str=line.substring(0,y/2);
	                }
	            }
	            System.out.println(str.length());
	        }
	}
}
