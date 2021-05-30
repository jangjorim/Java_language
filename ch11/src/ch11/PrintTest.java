package ch11;

import java.util.ArrayList;

public class PrintTest {
	public static void main(String[] args) {
		// String[] name = { "갈매기", "나비", "다람쥐", "라마" };

		ArrayList<String> list = new ArrayList<String>();
		list.add("갈매기");
		list.add("나비");
		list.add("다람쥐");
		list.add("라마");

		for (String b : list) {
			if (b.length() == 2) {
				System.out.println(b);
			}
		}
	}
}
