package ch09;

import java.text.MessageFormat;

public class MessageFormatTest {
	public static void main(String[] args) {
		Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마마", 2, "미국" }, { "징기스칸", 3, "몽고" } };

		for (int i = 0; i < data.length; i++) {
			System.out.println(
					MessageFormat.format("이름 : {0}      번호 : {1}     국적 : {2}", data[i][0], data[i][1], data[i][2]));
		}

	}
}
