
public class BoxingDemo {

	public static void main(String[] args) {
		GenericMemoryCell<Integer> m = new GenericMemoryCell<Integer>();
		
		// �Զ�װ�䡢�Զ�����
		m.write(37);
		int val = m.read();
		System.out.println("Contents are: " + val);
	}

}

class GenericMemoryCell<T> {
	public T read() {
		return storedValue;
	}

	public void write(T x) {
		storedValue = x;
	}

	private T storedValue;
}

