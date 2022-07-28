import java.util.LinkedList;

public class Collection3 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add("Ananth");
		l1.add("end");
		l1.remove(3);
		l1.add(1,22);	
		System.out.println(l1);

	}

}
