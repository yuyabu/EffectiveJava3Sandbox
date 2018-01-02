package item32;

import java.util.List;

public class Code {
	/**
	 * Java5で追加されたgenericsと可変長引数は同時に使用することができない<br/>
	 * Type safety: Potential heap pollution via varargs parameter 
 lists
	 */
	String cantUserGenericsAndVarargs(List<String> ... lists) {
		if(lists == null) {
			return null;
		}
		for(List<String> list:lists) {
			for(String str: list) {
				System.out.print(str);
			}
			System.out.println();
		}
		return null;
	}

}
