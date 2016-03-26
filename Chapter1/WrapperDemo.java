/**
* 使用Object以及
* 包装类的标准写法，不使用自动装箱拆箱
*/

public class WrapperDemo {

	public static void main(String[] args) {
		MemoryCell m = new MemoryCell();
		
		m.write(new Integer(37));
		Integer wrapperVal = (Integer) m.read();
		int val = wrapperVal.intValue();
		System.out.println("Contents are: " + val);
	}

}

class MemoryCell {
	private Object storedValue;

	public Object read() {
		return storedValue;
	}

	public void write(Object x) {
		storedValue = x;
	}
}
