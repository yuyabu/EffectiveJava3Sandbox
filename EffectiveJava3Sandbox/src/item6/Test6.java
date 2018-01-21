package item6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test6 {

	@Test
	void test() {
		String s1 = "bikini";
		String s2 = new String("bikini");// creates a new String instance
		String s3 = "bikini";// Object reused from s1
		
		System.out.println(s1==s2);//false
		System.out.println(s1 == s3);
		
		Boolean.valueOf("true");
	}

}
