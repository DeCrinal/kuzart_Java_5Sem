package lab1;

public class Main {
	public static void main(String[] args) {
		MyLinkedList<Integer> smth = new MyLinkedList<Integer>();
		for(int i = 0; i < 10; i++) {
			smth.addLast(i);
		}
		System.out.println(smth.size());
		System.out.println("----------------------");
		for(Integer el : smth) {
			System.out.println(el + " ]]");
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
