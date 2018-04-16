package item10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Code10 {
	public static void main(String args[]) {
		
		//ArrayListとLinkedリストは内容が同じであれば肩が違っていてもequalsはtrueとなる
		String s1 = "s1";
		String s2 = "s2";
		String s3 = "s3";
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();		
		
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		
		linkedList.add(s1);
		linkedList.add(s2);		
		linkedList.add(s3);
		
		System.out.println(arrayList.equals(linkedList));//true
		
		
	}
	//単位円上の全てのPointインスタンスを含むようにUnitCircleを初期化する
	private static final Set<Point> unitCircle;
	static {
		unitCircle = new HashSet<Point>();
		unitCircle.add(new Point(1,0));
		unitCircle.add(new Point(0,1));
		unitCircle.add(new Point(-1,0));
		unitCircle.add(new Point(0,-1));
		
	}
	
	public static boolean onUnitCircle(Point p) {
		return unitCircle.contains(p);
	}

}
