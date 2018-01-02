package item28;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
/**
 * Item28:Prefer lists to arrays
 */
class Test28 {

	@org.junit.jupiter.api.Test
	void test() {
		
		//配列とgenericsの一部を検証するコード

		//失敗するコード(配列)
		//Object[] objectArray = new Long[1];
		//objectArray[0] = "I dont fit in";//実行時例外
		//ArrayStoreException
		
		//失敗するコード(generics)
		//List<Object> ol = new ArrayList<Long>();
		//Type mismatch: cannot convert from ArrayList<Long> to List<Object>
		//ol.add("I dont fit in");
		
	}

}
