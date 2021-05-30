package ch06;

class Phone {
	protected String owner;

	Phone(String a) {
		owner = a;
	}

	void talk() {
		System.out.println(owner + "가 통화중이다.");
	}
}

class TelePhone extends Phone {
	private String when;

	TelePhone(String b, String c) {
		super(b);
		when = c;
	}

	String getwhen() {
		return when;
	}

	void autoAnswering() {
		System.out.println(owner + "가 없다." + getwhen() + "전화 줄래?");
	}

}

class SmartPhone extends TelePhone {
	private String game;

	SmartPhone(String d, String e) {
		super(d, null);
		game = e;
	}

	String getgame() {
		return game;
	}

	void playGame() {
		System.out.println(owner + "가" + getgame() + "게임을 하는 중이다.");
	}

}

public class Test05 {
	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new TelePhone("길동이", "내일"), new SmartPhone("민국이", "갤러그") };
		for (int i = 0; i < 3; i++) {
			if (phones[i] instanceof SmartPhone) {
				SmartPhone s = (SmartPhone) phones[i];
				s.playGame();
			} else if (phones[i] instanceof TelePhone) {
				TelePhone t = (TelePhone) phones[i];
				t.autoAnswering();
			} else if (phones[i] instanceof Phone) {
				phones[i].talk();
			}
		}
	}
}
