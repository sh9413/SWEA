import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution4008 {
	static boolean[] used;
	static int N;
	static char[] cmd;
	static int[] num;
	static int min;
	static int max;
	static Set<char[]> set;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N =sc.nextInt();
			int[] tempcmd = new int[4];
			for(int i=0; i<tempcmd.length; i++) {
				tempcmd[i] = sc.nextInt();
			}
			set = new HashSet<>();
			cmd = new char[N-1];
			int index = 0;
			for(int j=0; j<4; j++) {
				for(int i=0; i<tempcmd[j]; i++) {
					switch (j) {
						case 0: {
							cmd[index++] = '+';
							break;
						}
						case 1: {
							cmd[index++] = '-';
							break;
						}
						case 2: {
							cmd[index++] = '*';
							break;
						}
						case 3: {
							cmd[index++] = '/';
							break;
						}
					}
				}
			}

			
			used = new boolean[N-1];
			num = new int[N];
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
			for(int i=0; i<N; i++) {
				num[i] = sc.nextInt();
			}
			
			go(0,"");
			for(char s : set) {
				int sum = calc(String.format(s));
				min = min < sum ? min : sum;
				max = max > sum ? max : sum;	
			}
			System.out.println("#"+tc+" "+(max-min));
		}
	} 
	
	public static void go(int depth,char[] cmd) {
		if(N-1 == depth) {
			set.add(cmd);
			return ;
		}
		for(int i=depth; i<cmd.length; i++) {
			swap(cmd,i,depth);
			go(depth+1,cmd);
			swap(cmd,i,depth);
		}
	}
	
	public static void swap(char[] cmd,int i,int depth) {
		char temp = cmd[i];
		cmd[i] = cmd[depth];
		cmd[depth] = cmd[i];
	}
		
	
	
	
	public static int calc(String s) {
		String[] cmd = s.split("");
		int sum = num[0];
		for(int i=0; i<cmd.length; i++) {
			switch(cmd[i]) {
				case "+": {
					sum = sum + num[i+1];
					break;
				}
				case "-": {
					sum = sum - num[i+1];
					break;
				}
				case "*": {
					sum = sum * num[i+1];
					break;
				}
				case "/": {
					if ( num[i+1] == 0 ) {
						sum = Integer.MAX_VALUE;
					} else {
						sum = sum / num[i+1];
					}
					break;
				}
			}
		}
		return sum;
	}
}
