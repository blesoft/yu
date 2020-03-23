package entry;
import java.util.ArrayList; 
import java.util.List;
import java.time.LocalDateTime;

public class Directory extends Entry { 
	List<Entry> directory;
	
	
	public Directory(String name) {
      super(name);
      directory = new ArrayList<Entry>(); 
    }
	public Entry add(Entry ent) {
		directory.add(ent);
		getTime1();
		return this;
	}
	public int size() { 
		int size = 0;
		for (Entry ent : directory) {
			size += ent.size(); 
		} 
		getTime2();
		return size; 
	}
	public void print(String prefix) {
		String newPrefix = prefix + "/" + name;
		System.out.println(newPrefix + " (" + size() +")"); 
		for (Entry ent : directory) {
			ent.print(newPrefix);
		}
		getTime2();
	}
	public Entry delete(Entry ent) {
		if(directory.contains(ent)) {
			directory.remove(ent);
			this.getTime1();
		}else {
			System.out.println("エラーでっせ");
		}
		return this;
	}
}
	
