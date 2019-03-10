import java.util.Scanner;

public class Solution1976 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int Firsthour = s.nextInt();
			int Firstminute = s.nextInt();
			int Secondhour = s.nextInt();
			int Secondminute = s.nextInt();
			int hour;
			int minute;
			if ( (Firstminute + Secondminute) > 60) {
				hour = 1;
			}
			else {
				hour = 0;
			}
			minute = (Firstminute +Secondminute)%60;
			if( hour + Firsthour + Secondhour == 12 || hour + Firsthour + Secondhour == 24 ) {
				hour = 12;
			}
			else {
				hour = (hour + Firsthour + Secondhour)%12;
			}
				
			
			System.out.println("#"+tc+" "+hour+" "+minute);
		}
	}

}
