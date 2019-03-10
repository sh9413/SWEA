import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution1226 {
	static int ans = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		for(int tc=1;tc<=10;tc++) {
			br.readLine();
			int[][] map = new int[16][16];
			int startx=0;
			int starty=0;
			for(int i=0; i<16; i++) {
				String[] sp = br.readLine().trim().split("");
				for(int j=0; j<16;j++) {
					if ( sp[j].equals("2")) {
						startx=i;
						starty=j;
					}
					map[i][j] = Integer.parseInt(sp[j]);
				}
			}
			ans = 0;
			search(map,starty,startx,-1,0);
			search(map,starty,startx,1,0);
			search(map,starty,startx,0,1);
			search(map,starty,startx,0,-1);
			if (ans == 3) {
				System.out.println("#"+tc+" 1");
			} else {
				System.out.println("#"+tc+" 0");
			}
		}
	
	}
	
	public static void search(int[][] map,int y,int x,int dy,int dx) {
		map[y][x] = 1;
		if( y+dy > 0 && x+dx > 0 && y+dy < 16 && x+dx < 16 && map[y+dy][x+dx] != 1) {
			if(map[y+dy][x+dx] == 3)
				ans = 3;
			search(map,y+dy,x+dx,-1,0);
			search(map,y+dy,x+dx,1,0);
			search(map,y+dy,x+dx,0,-1);
			search(map,y+dy,x+dx,0,1);
		} else {
			return ;
		}
		return ;
	}
}
