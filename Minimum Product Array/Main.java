import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		long n, k, larB = 0, sum = 0, larBIndex = 0;
		n = STDIN_SCANNER.nextLong();
		k = STDIN_SCANNER.nextLong();
        long[] a = new long[(int)n], b = new long[(int)n];
		for(int i = 0; i < n; i++) {
			a[i] = STDIN_SCANNER.nextLong();
		}
		for(int i = 0; i < n; i++) {
			b[i] = STDIN_SCANNER.nextLong();
		}
		for(int i = 0; i < n; i++) {
			if(Math.abs(b[i]) > larB) {
				larB = Math.abs(b[i]);
				larBIndex = i;
			}
		}
		if(b[(int)larBIndex] > 0) {
			a[(int)larBIndex] = a[(int)larBIndex] + -2 * k;
		} else {
			a[(int)larBIndex] = a[(int)larBIndex] + 2 * k;
		}
		for(int i = 0; i < n; i++) {
			sum = sum + a[i] * b[i];
		}
		System.out.print(sum);
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}