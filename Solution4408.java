import java.util.Scanner;
public class Solution4408 {
    public static void main(String...msg) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1;tc<=T; tc++) {
            int N = sc.nextInt();
            int[] room = new int[201];
            int ans = 0;
            for(int i=0; i<N; i++) {
                int src = sc.nextInt();
                int des = sc.nextInt();
                if(src > des) {
                    int tmp = des;
                    des = src;
                    src = tmp;
                }
                for(int j = (src-1)/2; j<=(des-1)/2;j++) {
                    room[j]++;
                    ans = room[j] >= ans ? room[j] : ans;
                }
            }
            System.out.println("#"+tc+" "+ans);
        }
    }
}