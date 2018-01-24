package item26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Code26 {
	static int rowTypeSample(Set s1, Set s2) {
		int result = 0;
		for(Object o1: s1)
			if(s2.contains(o1))
				result++;
		return result;
	}
	
}
