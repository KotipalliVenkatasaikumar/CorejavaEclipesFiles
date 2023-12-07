package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Object> list = new LinkedList<>();
		list.add("SAI");
		list.add("swamy");
		list.add("dp");
		list.add("siva");
		list.add('c');
		list.add(10);
		list.add(0, "kvs");
		list.add(new StringBuffer("hdsjkfdbhjk"));
		((LinkedList) list).addFirst("raf");
		((LinkedList<Object>) list).addLast("balu");
		((LinkedList<Object>) list).getFirst();
		((LinkedList<Object>) list).removeFirst();
		((LinkedList<Object>) list).removeLast();

		System.out.println(list);

	}

}
