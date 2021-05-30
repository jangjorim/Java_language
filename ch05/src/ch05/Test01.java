package ch05;

public class Test01 {
	static int cnt = 0;

	static int countChar(String s, char c) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// throws IOException
		// String s = sc.next();
		// char c = (char) System.in.read();
		// cnt = countChar(s, c);
		cnt = countChar("HHello", 'H');
		System.out.println(cnt);
	}
}
