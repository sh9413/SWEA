import java.util.*;
 
public class Solution4366{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc= 1; tc<=T; tc++) {
            String binary = sc.next();
            String three = sc.next();
            for (int i = 0; i < binary.length(); i++) {
                StringBuilder bin = new StringBuilder(binary);
                int index = bin.length() - 1 - i;
                if (bin.charAt(index) == '0') {
                    bin.setCharAt(index, '1');
                } else {
                    bin.setCharAt(index, '0');
                }
                long dec = Long.parseLong(bin.toString(), 2);
                String trp = Long.toString(dec, 3);
 
                int count = 0;
                if (three.length() == trp.length()) {
                    for (int j = 0; j < three.length(); j++) {
                        if (three.charAt(j) != trp.charAt(j))
                            count++;
                    }
                    if (count == 1) {
                        System.out.println("#"+tc+" "+dec);
                        break;
                    }
                }
            }
        }
 
    }
}