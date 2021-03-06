package item10;

import item10.code2.*;
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
		//対象律を破っていると以下のコードの振る舞いが保証できない
		System.out.println(list.contains(s));//false
		
		
		//推移律に違反
		ColorPoint p1 = new ColorPoint(1,2,Color.RED);
		Point p2 = new Point(1,2);
		ColorPoint p3 = new ColorPoint(1,2,Color.BLUE);
		System.out.println(p1.equals(p2));//true
		System.out.println(p2.equals(p3));//true
		System.out.println(p1.equals(p3));//false
	
		CounterPoint cp = new CounterPoint(0,1);
		CounterPoint cp2 = new CounterPoint(0,1);
		
		System.out.println(cp.numberCreated());//2
		System.out.println(cp2.numberCreated());//2
		
		System.out.println(Code10.onUnitCircle(cp));//false
		
		p2 = new Point(0,1);
		
		System.out.println(p2.equals(cp));
		System.out.println(cp.equals(p2));
		
		item10.code2.ColorPoint cp3 = new item10.code2.ColorPoint(0,1,Color.RED);
		//スーパークラスと比較するときはクラス自身ではなく保持しているスーパークラスのインスタンスと比較する
		System.out.println(p2.equals(cp3.asPoint()));//true
	}

}
