package item10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Test10 {

	@Test
	void test() {
		CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
		String s = "polish";
		//対称律を破っている
		System.out.println(cis.equals(s));//true
		System.out.println(s.equals(cis));//false
		
		List<CaseInsensitiveString> list = new ArrayList<>();
		list.add(cis);
		System.out.println(list.contains(s));//false
	}

}
