/**
* 删除表中的偶数的一个低效算法
* O(N^2)复杂度
*/

public static void removeEvenVel1(List<Integer> lst) {
	int i = 0;
	while(i < lst.size())
		if (lst.get(i) % 2 == 0)
			lst.remove(i);
		else
			i++;
}
