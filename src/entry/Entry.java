package entry;

import java.time.LocalDateTime;

public abstract class Entry {
	public static void main(String[] args) {
		Directory dir2 = new Directory("dir");
		File file2 = new File("file2", 200);
		File file3 = new File("file3", 3000);
		File file5 = new File("file5",500);
		SymbolicLink link1 = new SymbolicLink("link1", "/root"); 
		dir2.add(file2);
		dir2.add(link1); 
		dir2.add(file3);
		Directory dir1 = new Directory("root"); File file1 = new File("file1", 10); 
		dir1.add(file1);
		dir1.add(dir2);
		dir1.print(); 
		dir2.delete(file5);
		dir1.print();
		dir1.printTime();
		dir2.printTime();
		
	}
	String name;
	LocalDateTime ldt_1;//作ったとき
	LocalDateTime ldt_2;//変更したとき
	LocalDateTime ldt_3;//アクセスしたとき
    public Entry(String name) {
    	this.name = name; 
    	ldt_1 = LocalDateTime.now();
    }
    public abstract Entry add(Entry ent);
    public abstract int size();
    public abstract void print(String prefix);
    public void print() {
    	print(""); 
    }
    public abstract Entry delete(Entry ent);
	
	//変更したとき
	public void getTime1() {
		ldt_2 = LocalDateTime.now();	
	}
	//アクセスしたとき
	public void getTime2() {
		ldt_3 = LocalDateTime.now();
	}
	public void printTime() {
		System.out.print(this.name);
		System.out.print("作成日時:");
		System.out.println(ldt_1);
		System.out.print("変更日時:");
		System.out.println(ldt_2);
		System.out.print("アクセス日時:");
		System.out.println(ldt_3);
	}
}
