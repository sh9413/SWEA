import java.util.Scanner;

public class Solution2043 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int P = s.nextInt();
	int K = s.nextInt();
	int count = 1;
	while(K!=P) {
		K++;
		count++;
	}
	System.out.println(count);
	}
}
