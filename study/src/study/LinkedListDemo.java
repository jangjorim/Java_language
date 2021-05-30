package study;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

		int count = 0;

		LinkedList<Integer> li = new LinkedList<>();
		ArrayList<Integer> ar = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(1, 40);

		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(1, 40);

		System.out.println(li.get(2));
		System.out.println(ar.get(2));

		for (int i = 1; i < 31; i++) {
			if (li.contains(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
