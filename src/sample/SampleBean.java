package sample;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

/**
 * FreeMarkerテスト用のサンプルBeanクラス。
 */
public class SampleBean {
	/**
	 * 平均値を返却します。
	 * @param first 数値
	 * @param second 数値
	 * @return 平均値
	 */
	public BigDecimal sampleBigDecimal(int first, int second) {
		return new BigDecimal(first + second).divide(new BigDecimal(2), 3, RoundingMode.HALF_EVEN);
	}

	public BigInteger sampleBigInteger(int first, int second) {
		return new BigInteger("13");
	}

	// public boolean sampleBoolean( int first, int second) {
	// return true;
	// }

	public byte sampleByte(int first, int second) {
		return 15;
	}

	// public Calendar sampleCalendar(int year, int month, int date) {
	// Calendar cal = Calendar.getInstance();
	// cal.set(year, month, date);
	// return cal;
	// }

	public Date sampleDate(int year, int month, int date) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, date);
		return cal.getTime();
	}

	// public int[] sampleIntArray( int first, int second) {
	// return new int[] { 15, 16 };
	// }

	public double sampleDouble(int first, int second) {
		return 12;
	}

	public long sampleLong(int first, int second) {
		return 11;
	}

	public short sampleShort(int first, int second) {
		return 14;
	}
}