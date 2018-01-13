package item3;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

class Test3 {

	@Test
	void test() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Elvis onlyOneElvis = Elvis.INSTANCE;
		Paul onlyOnePaul = Paul.getInstance();
		
		Constructor<Elvis> testConstructor = Elvis.class.getDeclaredConstructor();
		testConstructor.setAccessible(true);
		Elvis fakeElvis = testConstructor.newInstance();
		//最強のシングルトン。
		System.out.println(fakeElvis == onlyOneElvis);
		DalisDaughter onlyOneDaughter =  DalisDaughter.INSTANCE;
	}

}
