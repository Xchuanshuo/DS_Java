
public class TestGenericMemoryCell {

	public static void main(String[] args) {
		GenericMemoryCell<String> m = new GenericMemoryCell<String>();

		m.write("37");
		String val = (String) m.read();
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
