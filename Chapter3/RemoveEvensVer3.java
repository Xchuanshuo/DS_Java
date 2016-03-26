/**
* 删除表中的偶数元素的一个高效算法
* 对于LinkedList是线性的
*/

public static void removeEvensVel3(List<Integer> lst) {
	Iterator itr = lst.iterator();
	
	while(itr.hasNext())
		if (itr.next() % 2 == 0)
			itr.remove();
}