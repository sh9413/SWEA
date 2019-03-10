import java.util.Scanner;

public class Solution6900 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			lotto[] lotto = new lotto[N];
			for(int i=0; i<N; i++) {
				lotto[i] = new lotto(sc.next(),sc.nextInt());
			}
			String[] s = new String[M];
			for(int i=0; i<M; i++) {
				s[i] = sc.next();
			}
			int prize = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if ( verification(lotto[i].num, s[j]) )  {
						System.out.println("MONEY :"+lotto[i].money);
						prize += lotto[i].money;
					}
				}
			}
			System.out.println("#"+tc+" "+prize);
		}
	}

	public static boolean verification(String snum , String s) {
			for (int i = 0; i < snum.length(); i++) {
				if (snum.charAt(i) != '*' && snum.charAt(i) != s.charAt(i) ) {
					break;
				} else if (i == snum.length()-1) {
					return true;
				}
		}
		return false; 
	}
	
	public static class lotto {
		String num;
		int money;
		lotto(String n, int m) {
			num = n;
			money = m;
		}
	}
}
