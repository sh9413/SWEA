import java.util.Scanner;

public class Solution1216 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1; tc<=10; tc++) {
			int T = sc.nextInt();
			char[][] ch = new char[100][100];
			for(int i=0; i<100; i++) {
				ch[i] = sc.next().toCharArray();
			}
			
			int max_len = 0;
			for(int len = 2; len <= 100; len++) {
				for(int i=0; i<100; i++) {
					for(int j=0; j<100-len+1; j++) {
						for(int k=0; k<len/2; k++) {
							if ( ch[i][j+k] == ch[i][j+(len-1-k)] ) {
								if ( k == len/2-1 ) {
									max_len = len;
								}
							} else {
								break;
							}
						}
					}
				}
				for(int j=0; j<100; j++) {
					for(int i=0; i<100-len+1; i++) {	
						for(int k=0; k<len/2; k++) {
							if ( ch[i+k][j] == ch[i+(len-k-1)][j] ) {
								if ( k == len/2-1 ) {
									max_len = len;
								}
							} else {
								break;
							}
						}
					}
				}
			}
			
			System.out.println("#"+tc+" "+max_len);
			
			
			
		}
	}
}
