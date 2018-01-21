package item6;

public class Code6 {
	static boolean isRomanNumeral(String s) {
		return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
				+ "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
	}

}
