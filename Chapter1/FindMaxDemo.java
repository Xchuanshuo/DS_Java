/**
* 使用Comparable来实现代码重用
*/

public class FindMaxDemo {

	public static Comparable findMax(Comparable[] arr) {
		int maxInd = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(arr[maxIndex]) > 0)
				maxIndex = i;
		}
		return arr[maxIndex];
	}

	public static void main(String[] args) {
		String[] st1 = { "Joe", "Bob", "Bill", "Zeke" };
		System.out.println(findMax(st1));
	}

}
