package item5;

import java.util.List;
import java.util.Objects;

public class SpellChecker2 {
	private final Lexicon dictionary;
	public SpellChecker2(Lexicon dictionary) {
		this.dictionary = Objects.requireNonNull(dictionary);
	}
	
	public boolean isValid(String word) {
		return false;
	}
	public List<String>suggestions(String typo){
		return null;
	}

}
