package item32;

import java.util.ArrayList;
import java.util.List;

public class Code32 {
	/**
	 * Java5で追加されたgenericsと可変長引数は同時に使用することができない<br/>
	 * Type safety: Potential heap pollution via varargs parameter 
 lists
	 */
	static String cantUserGenericsAndVarargs(List<String> ... lists) {
		//List<Object> object = new ArrayList<String>();

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
