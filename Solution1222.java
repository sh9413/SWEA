import java.util.Scanner;
import java.util.Stack;

public class Solution1222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int tc=1; tc<=10; tc++) {
			int len = sc.nextInt(); // 입력되는 수식의 길이
			sc.nextLine(); // 위에 nextInt입력할때 들어온 엔터키 버퍼에 남은거 날려주기
			
			String input = sc.nextLine(); // 중위표기법 수식 입력됨.
			String postFix = ""; // 후위 표기법 수식 만들어서 이어붙이기 진행할 문자열
			
			
			// step 1 : 중위표기식을 후위표기식으로 변환해보기
			Stack<Character> stack = new Stack<>(); 

			for(int i=0; i<len; i++) {
				char ch = input.charAt(i);
				
				if(ch>='0' && ch<='9') {
					postFix += ch; // 읽은 글자가 숫자인게 확인되면 그냥 출력부에 붙여버림.
				} else { // 숫자가 아니면 무조건 '+'가 들어옴
					if (stack.isEmpty()) { // '+'만 후보이므로 비어있을때만 push 가능함.
						stack.push(ch);
					} else {
						postFix += stack.pop(); // pop한 연산자는 postfix에 이어붙이기.
						stack.push(ch);
					}
				}
			}
			
			while(!stack.isEmpty()) { // 앞에 처리 끝냈는데 스택이 연산자가 남아있다면 모두 pop 
				postFix += stack.pop();
			}
			//System.out.println(postFix);
			// step 2 : 후위표기식을 계산해서 결과값 만들어내기
			Stack<Integer> numStack = new Stack<>();
			for (int i=0; i<postFix.length(); i++) {
				char ch = postFix.charAt(i);
				
				if(ch>='0' && ch<='9') { 
					// Stack에 push할때, char -> int 방법 2가지
					numStack.push(ch-'0'); // 유니코드 표에서 '0'만큼 빼버리기
					// numStack.push(Integer.parseInt(ch+"")); // string으로 만들어낸 후, parseInt하기
				} else {
					int n1 = numStack.pop();
					int n2 = numStack.pop();
					numStack.push(n1+n2);
				}
			}
			int result = numStack.pop();
			System.out.println("#"+tc+" "+result);
		}
	}

}
