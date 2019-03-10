import java.util.Scanner;

public class Solution1873 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			char[][] map = new char[H][W];
			for(int i=0;i<H;i++) {
				map[i] = sc.next().toCharArray();
			}
			

			
			int tank_x = 0;
			int tank_y = 0;
			int tank_dir = 0; // dir == 1 À§ // dir == 2 ¾Æ·¡ // dir == 3 ¿À¸¥ÂÊ // dir == 4 ¿ÞÂÊ
			for(int i=0;i<H;i++) {
				for(int j=0; j<W; j++) {
					if (map[i][j] == '<' || map[i][j] == '>' || map[i][j] == '^' || map[i][j] == 'v') {
						tank_x = j;
						tank_y = i;
						if ( map[i][j] == '<' ) {
							tank_dir = 4; 
						} else if ( map[i][j] == '>' ) {
							tank_dir = 3; 
						} else if ( map[i][j] == '^' ) {
							tank_dir = 1; 
						} else if ( map[i][j] == 'v' ) {
							tank_dir = 2; 
						}   
						
					}
				}
			}
			
			int N = sc.nextInt();
			char[] cmd = new char[N];
			cmd = sc.next().toCharArray();
			int x = 0;
			int y = 0;
			for(int i=0; i<cmd.length; i++) {
				x = tank_x;
				y = tank_y;
				map[y][x] = '.';
				if( cmd[i] == 'S' ) {
					if ( tank_dir == 1 ) { // x¿Í y´Â Æ÷ÅºÀÇ ÁÂÇ¥
						while ( y > 0 && map[y][x] != '*' && map[y][x] != '#') {
							y = y - 1;
						}
					} else if ( tank_dir == 2 ) {
						while ( y < H-1 && map[y][x] != '*' && map[y][x] != '#') {
							y = y + 1;
						}
					} else if ( tank_dir == 3 ) {
						while ( x < W-1 && map[y][x] != '*' && map[y][x] != '#') {
							x = x + 1;
						}
					} else if ( tank_dir == 4 ) {
						while ( x > 0 && map[y][x] != '*' && map[y][x] != '#') {
							x = x - 1;
						}
					}
					if ( map[y][x] == '*' ) {
						map[y][x] = '.';
					}
				} else if ( cmd[i] == 'U' ) {
					tank_dir = 1;
					if ( tank_y > 0 && map[tank_y-1][tank_x] != '-' && map[tank_y-1][tank_x] != '*' && map[tank_y-1][tank_x] != '#' ) {
						tank_y = tank_y - 1;
					}
				} else if ( cmd[i] == 'D'  ) {
					tank_dir = 2;
					if ( tank_y < H - 1 && map[tank_y+1][tank_x] != '-' && map[tank_y+1][tank_x] != '*' && map[tank_y+1][tank_x] != '#') {
						tank_y = tank_y + 1;
					}
				} else if ( cmd[i] == 'R' ) {
					tank_dir = 3;
					if ( tank_x < W - 1  && map[tank_y][tank_x+1] != '-'  && map[tank_y][tank_x+1] != '*'  && map[tank_y][tank_x+1] != '#') {
						tank_x = tank_x + 1;
					}
				} else if ( cmd[i] == 'L' ) {
					tank_dir = 4;
					if ( tank_x > 0  && map[tank_y][tank_x-1] != '-' && map[tank_y][tank_x-1] != '#' && map[tank_y][tank_x-1] != '*') {
						tank_x = tank_x - 1;
					}
				}
				
				char tank='0';
				if( tank_dir == 1 ) {
					tank  = '^';
				} else if ( tank_dir == 2 ) {
					tank = 'v';
				} else if ( tank_dir == 3 ) {
					tank = '>';
				} else {
					tank = '<';
				}
				map[tank_y][tank_x] = tank;
			}
			System.out.print("#"+tc+" ");
			for(int ii=0;ii<H;ii++) {
				for(int jj=0; jj<W; jj++) {
					System.out.print(map[ii][jj]);
				}
				System.out.println();
			}
		}
	}
}
