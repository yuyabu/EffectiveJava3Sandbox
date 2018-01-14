package item4;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.Test;

import item3.Elvis;

class Test4 {

	@Test
	void test() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		UtilityClass.printf("hello world");
		
		//実行不可
		//UtilityClass test = new UtilityClass();
		//message:The constructor UtilityClass() is not visible
		
		//リフレクションによる攻撃を追記予定
		try {
			Constructor<UtilityClass> testConstructor = UtilityClass.class.getDeclaredConstructor();
			testConstructor.setAccessible(true);
			
			UtilityClass fakeElvis = testConstructor.newInstance();
		}catch(AssertionError e) {
			System.out.println("コンストラクタの実行に失敗(エラーを受け取った　)");
		}

		
		
	}

}
