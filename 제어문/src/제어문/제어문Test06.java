package 제어문;

import java.util.Scanner;

public class 제어문Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("철수");
		String iron = sc.nextLine();
		System.out.print("영희");
		String input = sc.nextLine();

		if (iron.equals(input))
			System.out.println("무승부");
		if (iron.equals("r") || input.equals("r"))
			iron = 3;
		else if (iron.equals("s") || input.equals("s"))
			iron = "2";
		else if (iron.equals("p") || input.equals("p"))
			iron = "1";
		
		if ()
			
	}
}
