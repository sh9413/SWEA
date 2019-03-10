import java.util.Scanner;

public class Solution4013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int K = sc.nextInt();
			int[] gear1 = new int[8]; for(int i=0 ;i<8; i++) gear1[i] =sc.nextInt();
			int[] gear2 = new int[8]; for(int i=0 ;i<8; i++) gear2[i] =sc.nextInt();
			int[] gear3 = new int[8]; for(int i=0 ;i<8; i++) gear3[i] =sc.nextInt(); 				
			int[] gear4 = new int[8]; for(int i=0 ;i<8; i++) gear4[i] =sc.nextInt();
			
			for(int i=0; i<K; i++) {
				int gear = sc.nextInt();
				int dir = sc.nextInt();
				switch (gear) {
					case 1: {
						if( dir == 1 ) {
							if( gear1[2] != gear2[6]) {
								if (gear2[2] != gear3[6]) {
									if (gear3[2] != gear4[6]) {
										rotateLeft(gear4);
									}
									rotateRight(gear3);
								}
								rotateRight(gear1);
								rotateLeft(gear2);
							}
						} else {
							if( gear1[2] != gear2[6]) {
								if (gear2[2] != gear3[6]) {
									if (gear3[2] != gear4[6]) {
										rotateRight(gear4);
									}
									rotateLeft(gear3);
								}
								rotateLeft(gear1);
								rotateRight(gear2);
							}
						}
						break;
					}
					case 2: {
						if ( dir == 1 ) {
							if (gear2[6] != gear1[2] ) {
								rotateLeft(gear1);
							}
							if (gear2[2] != gear3[6] ) {
								if(gear3[2] != gear4[6]) {
									rotateRight(gear4);
								}
								rotateLeft(gear3);
							}
						} else {
							rotateLeft(gear2);
							if (gear2[6] != gear1[2] ) {
								rotateRight(gear1);
							}
							if (gear2[2] != gear3[6] ) {
								if(gear3[2] != gear4[6]) {
									rotateLeft(gear4);
								}
								rotateRight(gear3);
							}
						}
						break;
					}
					case 3: {
						if ( dir == 1 ) {
							rotateRight(gear3);
							if( gear3[2] != gear4[6] ) {
								rotateLeft(gear4);
							}
							if( gear3[6] != gear2[2] ) {
								if(gear2[6] != gear1[2]) {
									rotateRight(gear1);
								}
								rotateLeft(gear2);
							}
						} else {
							rotateLeft(gear3);
							if( gear3[2] != gear4[6] ) {
								rotateRight(gear4);
							}
							if( gear3[6] != gear2[2] ) {
								if(gear2[6] != gear1[2]) {
									rotateLeft(gear1);
								}
								rotateRight(gear2);
							}
						}
					}
					case 4: {
						if (dir ==1) {
							rotateRight(gear4);
							if( gear4[6] != gear3[2] ) {
								if( gear3[6] != gear2[2]) {
									if(gear2[6] != gear1[2]) {
										rotateLeft(gear1);
									}
									rotateRight(gear2);
								}
								rotateLeft(gear3);
							}
						} else {
							rotateLeft(gear4);
							if( gear4[6] != gear3[2] ) {
								if( gear3[6] != gear2[2]) {
									if(gear2[6] != gear1[2]) {
										rotateRight(gear1);
									}
									rotateLeft(gear2);
								}
								rotateRight(gear3);
							}
						}
						break;
					}
					
				}
			}
			int res= gear1[0]*1+gear2[0]*2+gear3[0]*4+gear4[0]*8;
			System.out.println("#"+tc+" "+res);
		}
	}
	
	public static void rotateRight(int[] gear) {
		int temp = gear[7];
		for(int i=7; i>0; i--) {
			gear[i] = gear[i-1];
		}
		gear[0] = temp;
	}
	
	public static void rotateLeft(int[] gear) {
		int temp = gear[0];
		for(int i=0; i<7; i++) {
			gear[i] = gear[i+1];
		}
		gear[7] = temp;
	}
}
