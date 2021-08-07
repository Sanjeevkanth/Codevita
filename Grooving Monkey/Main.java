import java.util.*;

public class Main {
	public static long gcd(long a, long b) {
		long temp;
		while(b != 0) {
			temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}

	public static void main(String[] args) {
		int t;
		long n, i, ans, c, tempI, temp;
		t = STDIN_SCANNER.nextInt();
		while(t-- != 0) {
			n = STDIN_SCANNER.nextLong();
			long[] a = new long[(int)n];
			for(i = 0; i < n; i++) {
				a[(int)i] = STDIN_SCANNER.nextLong();
			}
			i = 0;
			ans = 1;
			c = 0;
			while(i <= n - 1) {
				tempI = i;
				c = 0;
				while(a[(int)i] != 0) {
					temp = i;
					i = a[(int)i] - 1;
					a[(int)temp] = 0;
					c += 1;
				}
				i = tempI + 1;
				if(c != 0) {
					ans = ans * c / gcd(ans, c);
				}
			}
			System.out.println(ans);
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}