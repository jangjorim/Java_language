package Test2;

import javax.swing.JFrame;

public class TestJava {
	public static void main(String[] ar) {
		RpgGame_frame rg = new RpgGame_frame();
	}
}

class RpgGame_frame extends JFrame {
	RpgGame_frame() {
		setTitle("테스트");
		setSize(800, 600);
		setVisible(true);
	}
}