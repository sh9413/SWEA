import java.util.Scanner;

public class Solution4047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int[] S = new int[14];
			int[] D = new int[14];
			int[] H = new int[14];
			int[] C = new int[14];
			boolean check = true;
			for(int i=1; i<S.length; i++) {
				S[i]=i; D[i]=i; H[i]=i; C[i]=i;
			}
			
			String line = sc.next();
			for(int i=0; i<line.length(); i+=3) {
				String s = line.substring(i, i+3);
				char c = s.charAt(0); // 카드의 모양
				int no;
				if( s.charAt(1) != '0' ) { 
					no = Integer.parseInt(s.substring(1,3));
				} else {
					no = Integer.parseInt(s.substring(2,3));
				}
				switch (c) {
					case 'S': {
						if(S[no] != -1) {
							S[no] = -1;
						} else { // 이미 가지고 있었다면..
							check = false;
						}
						break;
					}
					case 'D': {
						if(D[no] != -1) {
							D[no] = -1;
						} else { // 이미 가지고 있었다면..
							check = false;
						}
						break;
					}
					case 'H': {
						if(H[no] != -1) {
							H[no] = -1;
						} else { // 이미 가지고 있었다면..
							check = false;
						}
						break;
					}
					case 'C': {
						if(C[no] != -1) {
							C[no] = -1;
						} else { // 이미 가지고 있었다면..
							check = false;
						}
						break;
					}
				}
			}
			
			int n1=13,n2=13,n3=13,n4=13;
			for(int i=1; i<14; i++) {
				if(S[i] == -1) {
					n1--;
				}
				if(D[i] == -1) {
					n2--;
				}
				if(H[i] == -1) {
					n3--;
				}
				if(C[i] == -1) {
					n4--;
				}
			}
			System.out.print("#"+tc+" ");
			if(!check) {
				System.out.println("ERROR");
			} else {
				System.out.println(n1+" "+n2+" "+n3+" "+n4);
			}
			
		
			
		
			
			
		}
	}
}
