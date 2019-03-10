import java.util.Scanner;

public class Solution1266 {
	static boolean[] prime = new boolean[20];
	public static void main(String[] args) {
		prime[0] = prime[1] = false;
		for(int i=2; i<= 19; i++) {
			prime[i] = true;
		}
		for(int i=2; i*i <= 19; i++) {
			for(int j= i*i; j<=19; j+=i) {
				prime[j] = false;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			double Ap = A/100.0;
			double Bp = B/100.0;
			
			double ASum = 0.0;
			double BSum = 0.0;
			double CSum = 0.0;
			
			for(int i=0; i<=18; i++) {
				if(prime[i]) {
					double Aprime = nCr(18,i) * Math.pow(Ap, i) * Math.pow(1.0-Ap, 18-i);
					double Bprime = nCr(18,i) * Math.pow(Bp, i) * Math.pow(1.0-Bp, 18-i);
					for(int j=0; j<=18; j++) {
						if (!prime[j]) {
							double Anatural = nCr(18,j) * Math.pow(Bp, j) * Math.pow(1.0-Bp, 18-j);
							ASum += Aprime*Anatural;
							double Bnatural = nCr(18,j) * Math.pow(Ap, j) * Math.pow(1.0-Ap, 18-j);
							BSum += Bprime*Bnatural;
						}
						if (prime[j]) {
							double Aprime2 = nCr(18,j) * Math.pow(Ap, j) * Math.pow(1.0-Ap, 18-j);
							CSum += Bprime*Aprime2;
						}
					}
				}
			}
			System.out.printf("#%d %.6f\n",tc,ASum + BSum + CSum);
		}
	}
	
	static double nCr(int n,int r) {
		double result = 1.0;
		for(int i=0; i<r; i++) {
			result*= (n-i);
		}
		for(int i=0; i<r; i++) {
			result/=(i+1);
		}
		return result;
	}
}
