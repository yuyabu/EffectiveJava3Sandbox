package item6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
		Boolean tes = new Boolean("true");//Boolean Constructor is depecated in Java9.
		
		//Map#keySetは同じインスタンスを返す
		Map<String,String> map = new HashMap<>();
		map.put("1", "10");
		map.put("2", "20");
		map.put("3", "30");
		map.put("4", "40");
		
		Set<String> setView = map.keySet();
		Set<String> setView2 = map.keySet();
		
		System.out.println(setView == setView2);//true
		//setView.add("test");//UnsupportedOperationException
		//実装はHashMapクラスのインナークラスのインスタンスが帰ってくる
		//AbstructCollectionのaddがオーバーライドされていないので実行できない。
		//view objectというらしい。
		System.out.println("end");
		
		//autoBoxinがパフォマンスを下げる例。
		Long start,end;
		start = System.nanoTime();
		Code6.sumBadPerformance();
		end= System.nanoTime();
		System.out.println("Time:" + (end - start)/1000000f + "ms");
		
		start = System.nanoTime();
		Code6.sumGoodPerformance();
		end= System.nanoTime();
		System.out.println("Time:" + (end - start)/1000000f + "ms");
		
		//Time:6964.7607ms
		//Time: 660.76697ms
		//約１0倍近く違う。
		
	}

}
