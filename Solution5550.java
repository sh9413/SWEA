import java.util.ArrayList;
import java.util.Scanner;

public class Solution5550 {
	static int res=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			res =0;
			int ret=0;
			int cCount=0,rCount=0,oCount=0,aCount=0,kCount=0;
			String s = sc.next();
			for(int i=0; i<s.length(); i++) {
				char cha = s.charAt(i);
				switch (cha) {
					case 'c': {
						cCount++;
						rCount++;
						
						if(cCount>ret) {
							ret = cCount;
						}
						break;
					}
					case 'r': {
						if (rCount == 0) {
							res = -1;
						} else {
							rCount--;
							oCount++;
						}
						break;
					}
					
					case 'o': {
						if (oCount == 0) {
							res = -1;
						} else {
							oCount--;
							aCount++;
						}
						break;
					}
					
					case 'a': {
						if (aCount == 0) {
							res = -1;
						} else {
							aCount--;
							kCount++;
						}
						break;
					}
					
					case 'k': {
						if (kCount == 0) {
							res = -1;
						} else {
							cCount--;
							kCount--;
						}
						break;
					}
				}
			}
			
			if (cCount > 0) {
				res = -1;
			} else if (res != -1){
				res = ret;
			}
			
			System.out.println("#"+tc+" "+res);
		}
		
	}

}
