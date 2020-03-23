package entry;

public class SymbolicLink extends Entry { 
	String path;
	public SymbolicLink(String name, String path) { 
		super(name);
		this.path = path; 
	}
	public Entry add(Entry ent) {
		getTime2();
        return null;
      }
	public int size() {
		getTime2();
		return 0; 
	}
	public void print(String prefix) {
		getTime2();
		System.out.println(prefix + "/" + name + " -> " + path); 
	}
	public Entry delete(Entry ent) {
		getTime2();
		return null;
	}
}