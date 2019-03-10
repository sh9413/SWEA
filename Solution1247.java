import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class Solution1247 {
    static int N;
    static member[] m;
    static boolean[] visited;
    static ArrayList<member> list = new ArrayList<>();
    static int home_x,home_y,office_x,office_y;
    static int min;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
            N = sc.nextInt();
            m = new member[N];
            visited = new boolean[m.length];
            office_x = sc.nextInt();
            office_y = sc.nextInt();
            home_x = sc.nextInt();
            home_y = sc.nextInt();
            min = Integer.MAX_VALUE;
            for(int i=0; i<N; i++) {             
                m[i] = new member(sc.nextInt(),sc.nextInt());
            }
             
            dfs(0);
             
            System.out.println("#"+tc+" "+min);
        }
         
    }
     
    public static int findmin(ArrayList<member> list) {
        int dis = Math.abs(office_x-list.get(0).x) + Math.abs(office_y-list.get(0).y);
        for(int i=1; i<list.size(); i++) {
            dis += Math.abs(list.get(i-1).x-list.get(i).x) + Math.abs(list.get(i-1).y-list.get(i).y);
        }
        dis += Math.abs(list.get(list.size()-1).x-home_x) + Math.abs(list.get(list.size()-1).y-home_y);
         
        if( min > dis ) {
            min = dis;
        }
         
        return min;
    }
     
     
    public static void dfs(int d) {
        if ( d == m.length ) {
//          for(int i=0; i<list.size(); i++) {
//              System.out.print(list.get(i).x + " " + list.get(i).y+ " ||| ");
//          }
//          System.out.println();
            min = findmin(list);
            return ;
        }
         
        for(int i=0; i<m.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                list.add(m[i]);
                dfs(d+1); 
                list.remove(m[i]);
                visited[i] = false;
            } 
        }
         
    }
     
    public static class member{
        int x;
        int y;
        public member(int x,int y) {
            this.x=x;
            this.y=y;
        }
    }
}