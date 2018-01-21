package item6;

import java.util.regex.Pattern;

public class Code6 {
	static boolean isRomanNumeral(String s) {
		return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
				+ "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
	}
	
	private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
			+ "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
	static boolean isRomanNumeral2(String s) {
		return ROMAN.matcher(s).matches();
		//この書き方はパフォーマンス改善になるが、メソッドが呼ばれない場合にも
		//Staticメンバのインスタンスが不用意に生成されてしまう。
		//遅延初期化(lazy initialization)で抑制することができるが
		//遅延初期化は実装を複雑にする割に、あまりパフォーマンスを改善しないので非推奨。
	}

}
