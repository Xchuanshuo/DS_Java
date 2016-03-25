class ReversionPrint{
	public static void printOut(int n) {
		if (n >= 10)
			printOut(n / 10);
		System.out.print(n % 10);
	}
	
	public static void main(String[] args) {
		printOut(123456);
	}
}