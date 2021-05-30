package ch09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		Calendar c = Calendar.getInstance();

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("오늘은 " + "MM" + "월의 " + "dd" + "번째 날");
		SimpleDateFormat sdf3 = new SimpleDateFormat("오늘은 " + "yyyy" + "년의 " + c.get(Calendar.DAY_OF_YEAR) + "번째 날");

		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
	}
}
