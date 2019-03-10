import java.util.Scanner;

public class Solution1824 {
	static char[][] cmd;
	static int dir;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,-1,1};
	static boolean[][][][] ck;
	// 0 : -> // 1 : <- // 2 : 위 // 3 : 아래 // 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int C = sc.nextInt();
			int R = sc.nextInt();
			int memory = 0;
			dir = 0;
			cmd = new char[C][R];
			ck = new boolean[C][R][4][16];
			// i좌표값 j좌표값 방향 메모리 
			for(int i=0; i<C; i++) {
				cmd[i] = sc.next().toCharArray();
			}
			
			// C 세로 R 가로
			if (go(0,0,true,0,R,C,memory,0) ) {
				System.out.println("#"+tc+" YES");
			} else {
				System.out.println("#"+tc+" NO");
			}
		}
	}
	public static boolean go(int i,int j,boolean check,int dir,int R,int C,int memory,int depth) {
		if ( depth == 2 ) {
			return false;
		}
		while ( check ) {
			switch ( cmd[i][j] ) {
				case '<':
					dir = 1;
					break;
				case '>':
					dir = 0;
					break;
				case '^': 
					dir = 2;
					break;
				case 'v':
					dir = 3;
					break;
				case '_': 
					if(memory == 0) {
						dir = 0;
					} else {
						dir = 1;
					}
					break;
				case '|': 
					if(memory == 0) {
						dir = 3;
					} else {
						dir = 2;
					}
					break;
				case '?': 
					if ( j+1 < R && go(i,j+1,true,0,R,C,memory,depth+1) ) {
						check = false;
					} else if ( j-1 >= 0 && go(i,j-1,true,1,R,C,memory,depth+1) ) {
						check = false;
					} else if ( i-1 >= 0 && go(i-1,j,true,2,R,C,memory,depth+1)) {
						check = false;
					} else if ( i+1 < C && go(i+1,j,true,3,R,C,memory,depth+1 )) {
						check = false;
					}
					break;
				case '.':
					break;
				case '@': 
					check = false;
					break;
				case '+': 
					if (memory == 15) {
						memory = 0;
					} else {
						memory++;
					}
					break;
				case '-': 
					if (memory == 0) {
						memory = 15;
					} else {
						memory--;
					}
					break;
				default:
					memory = cmd[i][j]-'0';
					break;
			}
			
			
			if ( ck[i][j][dir][memory] ) {
				return false;
			}
			ck[i][j][dir][memory] = true;
		
			i = i + dy[dir];
			j = j + dx[dir];
			
			if ( i >= C ) {
				i = 0;
			} else if ( i < 0 ) {
				i = C-1;
			} else if ( j >= R ) {
				j = 0;
			} else if ( j < 0 ) {
				j = R-1;
			}
			
		}
		if (!check) {
			return true;
		} else {
			return false;
			
		}
	}
}