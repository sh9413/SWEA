import java.util.ArrayList;
import java.util.Scanner;

public class Solution1230 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1; tc<=10; tc++) {
			ArrayList<Integer> aList = new ArrayList<>();
			int N = sc.nextInt();
			for(int i=0; i<N; i++) {
				aList.add(sc.nextInt());
			}
			
			int M = sc.nextInt(); // 명령어의 갯수
			for(int i=0; i<M; i++) {
				int index = 0;
				String c = sc.next();
				switch (c) {
					case "I": {
						int x = sc.nextInt();
						int y = sc.nextInt();
						for(int j=0; j<y; j++) { 
							aList.add(x+(index++), sc.nextInt());
						}
						break;
					}
					case "D": {
						int x = sc.nextInt();
						int y = sc.nextInt();
						for(int j=0; j<y; j++) {
							aList.remove(x);
						}
						break;
					}
					case "A": {
						int y= sc.nextInt();
						for(int j=0; j<y; j++) {
							aList.add(sc.nextInt());
						}
						break;
					}
				}
			}
			
			System.out.print("#"+tc+" ");
			for(int i=0; i<10; i++) {
				System.out.print(aList.get(i)+" ");
			}
			System.out.println();
		}
	}
}
