import java.util.Scanner;

public class Solution3064 {
	static int[] tree;
	static int start;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int log = (int) (Math.log10(N) / Math.log10(2)); 
			int size = (int) Math.pow(2, log + 1);
			int len = 0;
			int n = size;
			while (n > 0) {
				len += n;
				n /= 2;
			}
			tree = new int[len + 1];
			start = len + 1 - size;
			for (int i = 1; i <= N; i++) {
				add(i, sc.nextInt());
			}
			System.out.print("#" + tc);
			for (int i = 0; i < M; i++) {
				int C = sc.nextInt();
				int A = sc.nextInt();
				int B = sc.nextInt();
				if (C == 1) {
					add(A, B);
				}
				if (C == 2) {
					sum(A, B);
				}
			}
			System.out.println();
		}
	}

	public static void sum(int s, int e) {
		int r = 0;
		int sidx = s + start - 1;
		int eidx = e + start;
		int sSum = tree[sidx];
		int eSum = tree[eidx];
		while (eidx > 1) {
			if (eidx % 2 == 0) {
			} else {
				eSum += tree[eidx - 1];
			}
			eidx /= 2;
		}

		if (s == 1) {
			r = eSum;
		} else {
			while (sidx > 1) {
				if (sidx % 2 == 0) {
				} else {
					sSum += tree[sidx - 1];
				}
				sidx /= 2;
			}
			r = eSum - sSum;
		}

		System.out.print(" " + r);
	}

	public static void add(int idx, int n) {
		int index = start + idx;
		tree[index] += n;
		index /= 2;
		while (index > 0) {
			tree[index] += n;
			index /= 2;
		}

	}
}
