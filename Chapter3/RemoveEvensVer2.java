/**
* 删除表中偶数元素的一个错误的算法
* 因为会导致ConcurrentModificationException
*/

public static void removeEvensVel2(List<Integer> lst) {
	for (Integer x : lst)
		if (x % 2 == 0)
			lst.remove(x);
}