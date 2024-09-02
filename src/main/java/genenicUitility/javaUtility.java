package genenicUitility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class javaUtility {

	public String calendarHandling(String pattern) {
		Calendar cal = Calendar.getInstance();
		Date d =cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String data = sdf.format(d);
		return data;

	}
	public int getRandomNumber(int range) {
		Random r = new Random();
		int num = r.nextInt(range);
		return num;
	}
	public String getDataFormProperties(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
