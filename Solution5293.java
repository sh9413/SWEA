import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution5293 {
	static String ans;
	static int count;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			ans = "";
			if (Math.abs(B-C) >= 2) {
				System.out.println("#"+tc+" impossible");
				continue;
			} else {
				count =0;
				go(A,B,C,D,"0",'0',A+B+C+D+1,0);
				count =0;
				go(A,B,C,D,"1",'1',A+B+C+D+1,0);
			}
			if ( ans == "" ) {
				System.out.println("#"+tc+" impossible");
			} else {
				System.out.println("#"+tc+" "+ans);
			}
		}
	}
	public static void go(int A,int B,int C,int D,String s,char c,int len,int cnt) {
		if( A==0 && B==0 && C==0 && D==0 ) {
			ans = s;
			return ;
		}
		
		if(cnt == len-1) {
			count++;
		} else if(count==4) return;
		if ( A<0 || B<0 || C<0 || D<0 ) {
			return ;
		}
		if(c == '0') {
			go(A-1,B,C,D,s+"0",'0',len,cnt+1);
			go(A,B-1,C,D,s+"1",'1',len,cnt+1);
		} else if (c == '1') {
			go(A,B,C-1,D,s+"0",'0',len,cnt+1);
			go(A,B,C,D-1,s+"1",'1',len,cnt+1);
		}
		
	}
}
