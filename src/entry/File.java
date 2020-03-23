package entry;

public class File extends Entry {
	int size;
	public File(String name, int size) { 
		super(name);
		this.size = size; 
	}
	public Entry add(Entry ent) {
		getTime2();
		return null;
	}
	public int size() {
		getTime2();
		return size; 
	}
	public void print(String prefix) {
		System.out.println(prefix + "/" + name + " (" + size() + ")");
		getTime2();
	}
	public Entry delete(Entry ent) {
		getTime2();
		return null;
	}
}