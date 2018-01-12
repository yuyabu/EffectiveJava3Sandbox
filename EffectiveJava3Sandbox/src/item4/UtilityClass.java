package item4;

public class UtilityClass {
	private UtilityClass() {
		throw new AssertionError();
	}
	/**
	 * 引数valを標準入出力に出力します
	 * @param val 出力対象の文字列
	 * 
	 */
	public static void printf(String val) {
		System.out.println(val);
	}

}
