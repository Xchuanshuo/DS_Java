/**
* Recursive maximum contiguous subsequence sum algorithm.
* Find maximum sum in subarray spanning a[left..right].
* Does not attempt to maintain actual best sequence.
*/

import java.util.Scanner;

class MaxSubSum3{
	private static int maxSumRec(int[] a, int left, int right) {
		if (left == right)
			if (a[left] > 0)
				return a[left];
			else
				return 0;
			
		int center = (left + right) / 2;
		int maxLeftSum = maxSumRec(a, left, center);
		int maxRightSum = maxSumRec(a, center + 1, right);
		
		int maxLeftBorderSum = 0, leftBorderSum = 0;
		for (int i = center; i >= left; i--) {
			leftBorderSum += a[i];
			if (leftBorderSum > maxLeftBorderSum)
				maxLeftBorderSum = leftBorderSum;
		}
		
		int maxRightBorderSum = 0, rightBorderSum = 0;
		for (int i = center + 1; i <= right; i++) {
			rightBorderSum += a[i];
			if (rightBorderSum > maxRightBorderSum)
				maxRightBorderSum = rightBorderSum;
		}
		
		return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);
	}
	
	private static int max3(int x, int y, int z) {
		if (x > y && x > z)
			return x;
		else if (y > x && y > z)
			return y;
		else
			return z;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int a[] = new int[len];
		for (int i = 0; i < len; i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = maxSumRec(a, 0, len - 1);
		System.out.println(sum);
	}
}