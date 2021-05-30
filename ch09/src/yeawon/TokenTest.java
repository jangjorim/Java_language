package yeawon;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {
	public static void main(String[] args) {
		int cnt = 0;
		String s = "Empty vessels make the most sound.";
		StringTokenizer st = new StringTokenizer(s); // StringTokenizer, countTokens, nextToken
		System.out.println("입력: " + s);//////////////
		String[] arr = new String[st.countTokens()];
		System.out.println(st.countTokens());/////////
		while (cnt < arr.length) {
			arr[cnt] = st.nextToken();
			cnt++;
		}
		Arrays.sort(arr);
		System.out.print("정렬된 토큰 : ");//////////////
		for (String a : arr) {
			System.out.print(a + ", ");
		}

	}
}
