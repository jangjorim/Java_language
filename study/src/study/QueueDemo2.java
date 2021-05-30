package study;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo2 {
	public static void main(String[] args) {

		int size = 0;
		Queue<String> q = new LinkedList<>();
		String q2 = null;
		q.offer("사과");
		q.offer("딸기");
		q.offer("바나나");
		q.offer("멜론");
		q.offer("나주배");

		size = q.size();
		for (int i = 0; i < size; i++) {
			if (q.peek() == "나주배") {
				System.out.println(q.peek());
				for (i = 0; i < size + 1; i++) {
					for (int j = 0; j < i; j++) {
						System.out.print(q2 + " ");
					}
					System.out.println();
				}
			} else {
				q2 = q.peek();
				q.poll();
			}

		}

	}
}
