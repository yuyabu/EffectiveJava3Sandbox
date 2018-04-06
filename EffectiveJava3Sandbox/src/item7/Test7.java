package item7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import org.junit.jupiter.api.Test;

class Test7 {

	@Test
	void test() {
		
		Code7 instance = new Code7(new WeakHashMap<>(),new HashMap<>());
		String studentNo1 = new String("1");
		String studentNo2 = new String("2");
		String studentNo3 = new String("3");
		
		instance.studentList.put(studentNo1,new String("田中太郎"));
		instance.studentList.put(studentNo2,new String("山田太郎"));
		instance.studentList.put(studentNo3,new String("佐藤太郎"));
		
		System.out.println(instance);
		
		instance.registBlackList(studentNo3);
		System.out.println(instance);

		//強参照を全て消す
		studentNo1 = null;
		studentNo2 = null;
		studentNo3 = null;
		
		System.gc();
		
		System.out.println(instance);
		System.out.println(instance.studentList.get("1"));//null
		
		
		
	}
	


}
