package sample;

import java.util.Calendar;

/**
 * FreeMarkerテスト用のサンプルBeanクラス。
 */
public class CopyOfSampleBean {

	public boolean sampleBoolean(int first, int second) {
		return true;
	}

	public Calendar sampleCalendar(int year, int month, int date) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		return cal;
	}

	public int[] sampleIntArray(int first, int second) {
		return new int[] { 15, 16 };
	}

}