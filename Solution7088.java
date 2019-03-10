import java.util.Scanner;

public class Solution7088 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		for(int tc=1;tc<=T; tc++) {
			int N= sc.nextInt();
			int Q = sc.nextInt();
			
			int[] cow = new int[N+1];
			int[] count = new int[4]; // 0번 미사용
			String[] cow_count = new String[N+1];
			cow_count[0] = "0 0 0";
			for(int i=1; i<N+1;i++) {
				cow[i] = sc.nextInt();
				count[cow[i]]++;
				cow_count[i] = count[1]+" "+count[2]+" "+count[3]+"";
			}
			System.out.println("#"+tc);
			for(int i=0; i<Q; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				
				String[] send = cow_count[end].split(" ");
				String[] sstart = cow_count[start-1].split(" ");
				
				int count0 = Integer.parseInt(send[0])-Integer.parseInt(sstart[0]);
				int count1 = Integer.parseInt(send[1])-Integer.parseInt(sstart[1]);
				int count2 = Integer.parseInt(send[2])-Integer.parseInt(sstart[2]);
				
				System.out.println(count0+" "+count1+" "+count2);
			}
		}
	}
}
