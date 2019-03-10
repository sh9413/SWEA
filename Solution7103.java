import java.util.Scanner;

public class Solution7103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int count = 0;
			int num = sc.nextInt();
			if (num == 0)
				break;
				int len = (int) Math.sqrt(num);
				for (int i = 1; i <= len; i++) {
					if (i * i == num) {
						count++;
						continue;
					}
					for (int j = i; j <= len; j++) {
						if (i * i + j * j == num) {
							count++;
							break;
						} else if (i * i + j * j > num)
							break;
						for (int k = j; k <= len; k++) {
							if (i * i + j * j + k * k == num) {
								count++;
								break;
							} else if (i * i + j * j + k * k > num)
								break;
							for (int l = k; l <= len; l++) {
								if (i * i + j * j + k * k + l * l == num) {
									count++;
									break;
								} else if (i * i + j * j + k * k + l * l > num)
									break;
							}
						}
					}
				}
				System.out.println("#"+tc+" "+count);
			}
		}
	}
