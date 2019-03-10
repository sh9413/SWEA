import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution6959 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			String N = br.readLine();
			int sum = 0;
			for(int i=0; i<N.length(); i++) {
				sum += N.charAt(i)-'0';
			}
			if(((sum-1)/9+N.length()+1)%2==0){
				System.out.println("#"+tc+" B");
			}else {
				System.out.println("#"+tc+" A");
			}
		}
		
	}
}
