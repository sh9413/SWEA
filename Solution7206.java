     import java.util.Scanner;
 
public class Solution7206 {
    static int max = 0;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            max = -1;
            String s = N + "";
            dfs(0, s);
             
            System.out.println("#" + tc + " " + max);
        }
    }
 
    public static void dfs(int depth, String N) {
        if (N.length() == 1) {
            max = max > depth ? max : depth;
            return;
        }
 
        for (int i = 1; i < N.length(); i++) {
            int A = Integer.parseInt(N.substring(0, i));
            int B = Integer.parseInt(N.substring(i));
            dfs(depth + 1, A * B + "");
        }
 
        if (N.length() >= 4) {
            int A[] = new int[3];
            for (int j = 1; j < N.length() - 1; j++) {
                for (int k = j + 1; k < N.length(); k++) {
                    A[0] = Integer.parseInt(N.substring(0, j));
                    A[1] = Integer.parseInt(N.substring(j, k));
                    A[2] = Integer.parseInt(N.substring(k));
                    dfs(depth + 1, A[0] * A[1] * A[2] + "");
                }
            }
            if (N.length() == 4) {
                dfs(depth + 1,
                        (N.charAt(0) - '0') * (N.charAt(1) - '0') * (N.charAt(2) - '0') * (N.charAt(3) - '0') + "");
            }
        }
        if (N.length() >= 5) {
            int A[] = new int[4];
            for (int j = 1; j < N.length() - 2; j++) {
                for (int k = j + 1; k < N.length() - 1; k++) {
                    for (int l = k + 1; l < N.length(); l++) {
                        A[0] = Integer.parseInt(N.substring(0, j));
                        A[1] = Integer.parseInt(N.substring(j, k));
                        A[2] = Integer.parseInt(N.substring(k, l));
                        A[3] = Integer.parseInt(N.substring(l));
                        dfs(depth + 1, A[0] * A[1] * A[2] * A[3] + "");
 
                    }
                }
            }
            if (N.length() == 5) {
                dfs(depth + 1, (N.charAt(0) - '0') * (N.charAt(1) - '0') * (N.charAt(2) - '0') * (N.charAt(3) - '0')
                        * (N.charAt(4) - '0') + "");
            }
        }
 
    }
}
 
                                    