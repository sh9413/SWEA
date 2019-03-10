
public class Solution3131 {
	public static void main(String[] args) {
		boolean[] arr = new boolean[1000001];
		for(int i=2; i<Math.sqrt(arr.length); i++) {
			if(arr[i]) 
				continue;
			for(int j=i+i; j<arr.length; j+=i) {
				arr[j] = true;
			}
		}
		for(int i=2; i<arr.length; i++) {
			if(!arr[i])
				System.out.print(i+" ");
		}
	}
}
