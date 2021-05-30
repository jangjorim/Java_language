package ch04;

public class Member {
	private String name;
	private int id;
	private int pw;
	private int age;

	Member(String a, int b, int c, int d) {
		this.name = a;
		this.id = b;
		this.pw = c;
		this.age = d;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	void setPw(int pw) {
//		this.pw = pw;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getPw() {
		return pw;
	}

	public int getAge() {
		return age;
	}

}
