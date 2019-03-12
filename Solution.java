import java.util.Scanner;

public class Solution {
	static char[][] map;
	static int N;
	static int SCORE_A = 0;
	static int SCORE_B = 0;
	static int[] line;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			map = new char[N][6];
			line = new int[6];
			SCORE_A = 0;
			SCORE_B = 0;
			for(int i=0; i<N; i++) {
				int input = sc.nextInt();
				int y = findY(input);
				if(i%2==0) {
					map[y][input] = 'A';
				} else {
					map[y][input] = 'B';
				}
				//print();
				//System.out.println();
				line[input]++;
				if( isgetScore() ) {
					Scoreing(i);
				}
			}
			System.out.println("#"+tc+" "+Math.abs(SCORE_A-SCORE_B));
		}
	}
	public static int findY(int input) {
		for(int y=0; y<N; y++) {
			if( map[y][input] == '\0' ) {
				return y;
			}
		}
		return (Integer) null;
	}
	
	
	
	public static void print() {
		for(int y=10; y>=0; y--) {
			for(int x=0; x<6; x++) {
				System.out.print(map[y][x]+"!");
			}System.out.println();
		}System.out.println();
	}
	
	
	public static void downBlock() {
		for(int y=0; y<N-1; y++) {
			for(int x=0; x<6; x++) {
				if ( map[y][x] == '\0' && map[y+1][x] != '\0') {  
					map[y][x] = map[y+1][x];
					map[y+1][x] = '\0';
				}
			}
		}
		//print();
	}
	
	public static void Scoreing(int i) {
		int score = 0;
		Point p = getScore();
		if( i%2 == 0 && map[p.Y][p.X] =='A') {
			score += p.len;
		} else if ( i%2 == 1 && map[p.Y][p.X] =='B') {
			score += p.len;
		}
		if ( p == null ) {
			return ;
		}
		for(int len=0;len<p.len; len++) {
			map[p.Y][p.X+len] = '\0';
		}
		downBlock();
		while(isgetScore()) {
			p = getScore();
			if( i%2 == 0 && map[p.Y][p.X] =='A') {
				score += p.len;
			} else if ( i%2 == 1 && map[p.Y][p.X] =='B') {
				score += p.len;
			}
			if ( p == null ) {
				return ;
			}
			for(int len=0;len<p.len; len++) {
				map[p.Y][p.X+len] = '\0';
			}
			downBlock();
		}
		
		if ( i%2==0 ) { //  A의 턴
			SCORE_A += score;
		} else {
			SCORE_B += score;
		}
		//System.out.println("A: "+SCORE_A);
		//System.out.println("B: "+SCORE_B);
	}
	public static Point getScore() {
		for(int y=0; y<N; y++) {
			for(int x=0; x<1; x++) {
				if( map[y][x] == map[y][x+1] && map[y][x+1] == map[y][x+2] && map[y][x+2] == map[y][x+3] && map[y][x+3] == map[y][x+4] && map[y][x+4] == map[y][x+5] && map[y][x] != '\0') {
					return new Point(x,y,6);
				}
			}
		}
		for(int y=0; y<N; y++) {
			for(int x=0; x<2; x++) {
				if( map[y][x] == map[y][x+1] && map[y][x+1] == map[y][x+2] && map[y][x+2] == map[y][x+3] && map[y][x+3] == map[y][x+4]  && map[y][x] != '\0') {
					return new Point(x,y,5);
				}
			}
		}
		for(int y=0; y<N; y++) {
			for(int x=0; x<3; x++) {
				if( map[y][x] == map[y][x+1] && map[y][x+1] == map[y][x+2] && map[y][x+2] == map[y][x+3]  && map[y][x] != '\0') {
					return new Point(x,y,4);
				}
			}
		}
		return null;
	}
	
	public static boolean isgetScore() {
		for(int y=0; y<N; y++) {
			for(int x=0; x<3; x++) {
				if( map[y][x] == map[y][x+1] && map[y][x+1] == map[y][x+2] && map[y][x+2] == map[y][x+3]  && map[y][x] != '\0') {
					return true;
				}
			}
		}
		return false;
	}
	
	public static class Point{
		int X;
		int Y;
		int len;
		public Point(int x,int y,int l) {
			X=x;
			Y=y;
			len = l;
		}
	}
}
