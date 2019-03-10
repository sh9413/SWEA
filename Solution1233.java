import java.util.Scanner;
 
public class Solution1233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1;tc<=10;tc++) {
            int res = 1;
            int n = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++) {
                String[] s = sc.nextLine().split(" ");
                if(s.length!=4) 
                	if(s[1].charAt(0) < 48)
                    	res = 0;
            }
            System.out.print("#"+tc+" "+res);
            System.out.println();
        }
    } 
}   