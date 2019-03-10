import java.util.Scanner;
import java.util.Stack;

public class Solution5432 {
/**
 * 
 * ( 여는 괄호이면 stack에 넣기
 * ) 닫는 괄호이면 
 *  	방금 전 문자열이 ( 이면 레이저이므로, 현재 stack크기만큼 cnt에 누적 후 ( 를 스택에서 제거
 * 		방금 전 문자열이 ) 이면 레이저가 아니므로, cnt++ 후 ) 를 스택에서 제거
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		int T = s.nextInt();
		for (int tc=1; tc<=T; tc++) {			
			String line = s.next();
			int N = line.length();
			char[] c = new char[N];
			for(int i=0; i<N; i++) {
				c[i] = line.charAt(i);
			}
			int count = 0;
			for(int i=0; i<line.length(); i++) {
				if(c[i] == '(') {
					stack.push(c[i]);
				}
				else // 닫히는 괄호가 나타났네 ? 레이저인지 막대기 끝인지 판단해야함 바로 앞에 ( 있는지 없는지 봐야함.
				{   
					char tmp = line.charAt(i-1);
					stack.pop();
					if (tmp == '(') {
						count += stack.size();
					}
					else {
						count++;
					}
				}
			}
			
			System.out.println("#"+tc+" "+count);
			
		}
	}

}
