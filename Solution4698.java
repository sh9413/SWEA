import java.util.Scanner;

public class Solution4698 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[1000001];
		for(int i=2; i<arr.length; i++) {
			arr[i] = i;
		}
		
		for(int i=2; i<arr.length; i++) {
			if(arr[i] == 0) 
				continue;
			for(int j=i+i; j<arr.length; j+=i) {
				arr[j] = 0;
			}
		}
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int D = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int count = 0;
			for(int i=A; i<B; i++) {
				String tmp = arr[i] + "";
				if(!tmp.equals("0") && tmp.contains(D+"")){
					count++;
				}
			}
			System.out.println("#"+tc+" "+count);
		}
	}
}

