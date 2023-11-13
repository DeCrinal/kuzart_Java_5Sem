package lab1;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> smth = new LinkedList<Integer>();
		for(int i = 0; i < 10; i++) {
			smth.add(i);
		}
		System.out.println(smth.size());
		Iterator<Integer> iter = smth.iterator();
		System.out.println("----------------------");
		for(int i = 0; i < 10; i++) {
			if(iter.hasNext()) {
				System.out.println(iter.next());
			}
		}
		/*Iterator<Integer> iter2 = smth.iterator();
		if(iter2.hasNext()) {
			iter2.next();
		}
		iter2.remove();
		iter = smth.iterator();
		System.out.println("----------------------");
		while(iter.hasNext()) {
				System.out.println(iter.next());
		}*/
	}
}
