import java.util.ArrayList;
import java.util.Iterator;
public class Collection2 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add("Ananth");
		a1.add("end");
		a1.remove(2);
		a1.remove(0);
		a1.add(0,100);
		Iterator itr = a1. iterator();                          // By took output by Iterator ();
		while(itr.hasNext())
			System.out.println(itr.next());
//		for(int i : a1) {
//			System.out.println(i);								// Enhanced for loop
//		}
	}

}
