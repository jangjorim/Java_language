package ch11;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> map = new Hashtable<>();

		map.put("김열공", 80);
		map.put("최고봉", 90);
		map.put("우등생", 95);
		map.put("나자바", 88);

		System.out.print("이름을 입력하세요 :");
		String key = sc.next();
		System.out.println(map.get(key));

	}
}
