import java.util.Scanner;
import java.util.Stack;

public class Solution1218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		for(int tc=1; tc<=10; tc++) {
			int N = s.nextInt();
			char[] c = new char[N];
			String line = s.next();
			for(int i=0; i<N; i++) {
				c[i] = line.charAt(i);
			}
			boolean check = true;
			for(int i=0; i<N; i++) {
				switch (c[i]) {
					case '(': {
						stack.push(1);
						break;
					}
					case ')': {
						if(!stack.isEmpty()) {
							if (stack.pop() != 1) {
								check = false;
							}
						} else {
							check = false;
						}
						break;
					}
					case '{': {
						stack.push(2);
						break;
					}
					case '}': {
						if(!stack.isEmpty()) {							
							if (stack.pop() != 2) {
							check = false;
							}
						} else {
							check = false;
						}
						break;
					}
					case '[': {
						stack.push(3);
						break;
					}
					case ']': {
						if(!stack.isEmpty()) {							
							if (stack.pop() != 3) {
							check = false;
							}
						} else {
							check = false;
						}
						break;
					}
				}
			}
			
			if(check) {
				System.out.println("#"+tc+" "+1);
			}
			else if (!check){
				System.out.println("#"+tc+" "+0);
			}
			
		}
	}

}
