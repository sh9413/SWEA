import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution3064_2 {
   public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   public static ArrayList<Integer> res;
   public static int N, M;
   public static int tree[];
   public static int start;

   public static void run(int C, int A, int B) {
       if(C == 1) {
           add(A, B);
       }
       if(C == 2) {
           sum(A, B);
       }
   }

   public static void sum(int s, int e) {
       int r = 0;
       int sidx = s+ start-1;
       int eidx = e+ start;
       int sSum=tree[sidx];
       int eSum=tree[eidx];
       while(eidx>1) {
           if(eidx%2 ==0) {
           }else {
               eSum += tree[eidx-1];
           }
           eidx/=2;
       }

       if(s == 1) {
           r = eSum;
       }else {
           while(sidx>1) {
               if(sidx%2 == 0) { //짝수 인덱스에서 올라갈땐 내가 나를 올림
                   //sSum = sSum;
               }else { //홀수 인덱스에서 올라갈 땐 형제를 더해서 올림
                   sSum+=tree[sidx-1]; //형제를 더한다
               }
               sidx/=2;
           }
           r = eSum-sSum;
       }

       //아무튼 결과를 res에 add시킨다
       res.add(r);
   }

   public static void add(int idx, int n) {
       int index = start+idx;

       tree[index] += n;

       //부모들 업데이트
       index /=2;
       while(index>0) {
           tree[index] +=n;
           index/=2;
       }
   }

   public static void init() throws IOException {
       StringTokenizer st = new StringTokenizer(br.readLine());
       res = new ArrayList<>();

       N = Integer.parseInt(st.nextToken());
       M = Integer.parseInt(st.nextToken());

       int log = (int)(Math.log10(N)/Math.log10(2)); 
       int size = (int)Math.pow(2, log+1); 
       int len = 0;
       int n = size;
       while(n >0) {
           len +=n;
           n/=2;
       }
       tree = new int[len+1];
       start = len+1 - size;

       st= new StringTokenizer(br.readLine());
       for(int i =1; i<=N; i++) {
           add(i, Integer.parseInt(st.nextToken()));
       }
       for(int i =0; i<M; i++) {
           st = new StringTokenizer(br.readLine());

           int c = Integer.parseInt(st.nextToken());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           run(c,a,b);
       }
   }

   public static void main(String[] args) throws IOException {
       int T = Integer.parseInt(br.readLine().trim());
       for(int tc=1; tc<=T; tc++) {
           init();
           System.out.print("#"+tc);
           printRes();
       }
   }

   public static void printRes() {
       for(int n : res) {
           System.out.print(" "+ n);
       }
       System.out.println();
   }
}