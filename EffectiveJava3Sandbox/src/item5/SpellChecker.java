package item5;

import java.util.List;

public class SpellChecker {
	private static final Lexicon dictionary = Lexicon.getInstance();
	
	private SpellChecker() {}//インスタンス化不可
	
	public static boolean isValid(String word) {
		//TODO:実装してません、的な例外に置き換え予定
		return false;
	}
	public static List<String> suggestion(String typo){
		return null;
	}
	
}
