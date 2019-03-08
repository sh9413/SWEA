import java.util.*;
public class Solution4789 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
            String s = sc.next();
            int add = 0;
            int cur = 0;
            int count = 0;
            for(int i=0; i<s.length(); i++) {
                add = s.charAt(i)-48;
                if( cur >= i ) {
                    cur += add;
                } else {
                    count += i - cur;
                    cur = i + add;
                }
            }
            System.out.println("#"+tc+" "+count);
        }
    }
}