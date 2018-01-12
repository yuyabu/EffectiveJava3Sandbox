package item3;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.AccessibleObject;

import org.junit.jupiter.api.Test;

class Test3 {

	@Test
	void test() {
		Elvis onlyOneElvis = Elvis.INSTANCE;
		Paul onlyOnePaul = Paul.getInstance();
	}

}
