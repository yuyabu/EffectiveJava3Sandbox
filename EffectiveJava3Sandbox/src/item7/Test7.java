package item7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.WeakHashMap;

import org.junit.jupiter.api.Test;

class Test7 {

	@Test
	void test() {
		Code7 instance = new Code7(new WeakHashMap<>(),new HashMap<>());
		instance.studentList.put(1,"田中太郎");
		instance.studentList.put(2,"山田太郎");
		instance.studentList.put(3,"佐藤太郎");
		
		System.out.println(instance.studentList);
		
		
		
		
	}


}
