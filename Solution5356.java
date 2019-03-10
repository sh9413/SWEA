import java.util.Scanner;

public class Solution5356 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			String[][] arr = new String[5][15];
			for(int j=0; j<5; j++) {
				String str = s.next();
				for(int i=0; i<str.length(); i++) {
					arr[j][i] = str.substring(i, i+1);
				}
			}
			System.out.print("#"+tc+" ");
			for(int j=0; j<15; j++) {
				for(int i=0; i<5; i++) {
					if(arr[i][j] != null) {
						System.out.print(arr[i][j]);
					}
				}
			}
			System.out.println();
		}		
	}
}
