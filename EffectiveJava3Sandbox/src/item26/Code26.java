package item26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Code26 {
	/**
	 * raw typeを使った例。禁止すべき。
	 * @param s1
	 * @param s2
	 * @return
	 */
	static int rowTypeSample(Set s1, Set s2) {
		int result = 0;
		for(Object o1: s1)
			if(s2.contains(o1))
				result++;
		return result;
	}
	/**
	 * 非境界ワイルドカード(unbounded wild card)を使った例。原型(row type)よりこちらを使うべき。
	 * @param s1
	 * @param s2
	 * @return
	 */
	static int unboundedWildcardSample(Set<?> s1, Set<?> s2) {
		int result = 0;
		for(Object o1: s1)
			if(s2.contains(o1))
				result++;
		return result;
	}
	
}
