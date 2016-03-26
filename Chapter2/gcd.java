/**
* 辗转相除法求最大公因数
*/

public static long gcd(long m, long n) {
	while(n != 0) {
		long rem = m % n;
		m = n;
		n = rem;
	}
}