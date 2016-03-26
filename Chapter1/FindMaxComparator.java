/**
* 构建一个函数对象来作为参数传递
*/

import java.util.Comparator;

public class FindMaxComparator {

	public static void main(String[] args) {
		String[] arr = { "ZEBRA", "alligator", "crocodile" };
		System.out.println(findMax(arr, new CaseInsensitive()));
	}

	public static <T> T findMax(T[] arr, Comparator<? super T> cmp) {
		int maxIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (cmp.compare(arr[i], arr[maxIndex]) > 0) {
				maxIndex = i;
			}
		}
		return arr[maxIndex];
	}
}

class CaseInsensitive implements Comparator<String> {
	public int compare(String lhs, String rhs) {
		return lhs.compareToIgnoreCase(rhs);
	}
}
