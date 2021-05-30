package ch04;

public class MemberDemo {
	public static void main(String[] args) {
		Member m = new Member("김성민", 4005, 12345, 18);
//		Member m = new Member();
//		m.setName("김성민");
//		m.setId(4005);
//		m.setPw(12345);
//		m.setAge(18);
		System.out.println("나이는" + m.getName() + "아이디는" + m.getId() + "비밀번호는" + m.getPw() + "나인는" + m.getAge());
	}
}
