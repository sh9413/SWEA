import java.util.Scanner;

public class Solution1926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int i=1; i<=N; i++) {
			int h = -1;
			int t = -1;
			int o = -1;
			boolean bh = false;
			boolean bt = false;
			boolean bo = false;
			if ( i>=100 ) {
				h = i/100; // 백의자리
				t = i - h*100;
				o = i - h*100 - t*10;
				if( h != 0 && h%3 == 0 ) {
					bh = true;
				}
				if( t != 0 && t%3 == 0 ) {
					bt = true;
				}
				if( o != 0 && o%3 == 0 ) {
					bo = true;
				}
			}
			else if( i>=10 ) {
				t = i/10; // 십의자리
				o = i - t*10;
				if( t != 0 && t%3 == 0 ) {
					bt = true;
				}
				if( o != 0 && o%3 == 0 ) {
					bo = true;
				}
			}
			
			else if( i<10 ) {
				o = i;
				if( o != 0 && o%3 == 0 ) {
					bo = true;
				}
			}
			
			if( !bo && !bt && !bh ) {
				System.out.print(i+" ");
			}
			else {
				if(bh) {
					System.out.print("-");
				}
				if(bt) {
					System.out.print("-");
				}
				if(bo) {
					System.out.print("-");
				}
				System.out.print(" ");
			}
		}
	}

}
