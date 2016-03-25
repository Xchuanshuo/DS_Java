public class Reversion {
	public static int f(int x) {
		if (x == 0)
			return 0;
		else
			return 2 * f(x - 1) + x * x;
	}

	public static void main(String[] avg) {
		System.out.println(f(3));
	}
}