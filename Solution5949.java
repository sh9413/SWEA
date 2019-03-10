import java.util.ArrayList;
import java.util.Scanner;

public class Solution5949 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
		 char[] s = sc.next().toCharArray();
         char[] t = sc.next().toCharArray();
         ArrayList<Integer> sl = new ArrayList<>();
         ArrayList<Integer> tl = new ArrayList<>();
         long count = 0;
         for (int i = 0; i < s.length; i++) {
             if(s[i] == 'a') 
            	 sl.add(i);
             if(t[i] == 'a')
            	 tl.add(i);
         }
         for (int i = 0; i < sl.size(); i++) {
             count += (long)Math.abs(sl.get(i)-tl.get(i));
         }
         System.out.println("#"+tc+" "+count);
		}
	}

}
