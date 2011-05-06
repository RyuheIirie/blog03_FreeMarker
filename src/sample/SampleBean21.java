package sample;

public class SampleBean21 {
	private int key;
	private String value;

	public SampleBean21(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public boolean checkResult(int prm1, int prm2) {
		return prm1 == prm2;
	}

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
