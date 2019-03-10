import java.util.Scanner;

public class Solution2058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int sum = 0;
		if(a>=1000) {
			int temp = a/1000;
			sum = sum + temp;
			a = a - temp*1000;
		}
		if(a>=100) {
			int temp = a/100;
			sum = sum + temp;
			a = a - temp*100;
		}
		if(a>=10) {
			int temp = a/10;
			sum = sum + temp;
			a = a - temp*10;
		}
		sum = sum + a;
		System.out.println(sum);
	}

}
