package item5;

public class Lexicon {
	private  final static Lexicon INSTANCE = new Lexicon();
	private Lexicon() {
	}
	public static Lexicon getInstance() {
		return INSTANCE;
	}
}
