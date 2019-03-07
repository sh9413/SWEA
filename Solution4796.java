import java.util.Scanner;
 
public class Solution4796 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc=1; tc<=T;tc++) {
            int N = sc.nextInt();
            int[] M = new int[N];
            for (int i = 0; i<N; i++) {
                M[i] = sc.nextInt();
            }
            int ans = 0;
            for (int j=1; j<M.length-1; j++) {
                int left = 0;
                int right = 0;
                if (M[j-1] < M[j] && M[j+1]<M[j]) {
                    int index = j;
                    while (index <= M.length-2 && M[index+1] < M[index]) {
                        left++;
                        index++;
                    }
                    int index2 = j;
                    while (index2 >= 1 && M[index2] > M[index2-1]) {
                        right++;
                        index2--;
                    }
                    ans += (left * right);
                }
            }
            System.out.println("#"+tc+" "+ans);
        }
    }
}