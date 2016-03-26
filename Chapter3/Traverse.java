/**
* 用增强for循环以及Iterator来对表遍历
*/

public static <AnyType> void print(Collection<AnyType> coll) {
	for (AnyType item : coll) {
		System.out.println(item);
	}
	
	Iterator<AnyType> itr = coll.iterator();
	while(itr.hasNext()){
		AnyType item = itr.next();
		System.out.println(item);
	}
}
