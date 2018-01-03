package item32;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class Test32 {

	@org.junit.jupiter.api.Test
	void test() {
		
		//引数がnullの場合も、複数の場合も実行できてしまう。
		Code32.cantUserGenericsAndVarargs(null);
		List<String> tempList = List.of("test","32");
		List<String> tempList2 = List.of("test2","32");
		Code32.cantUserGenericsAndVarargs(tempList,tempList2);
		
		
		//genericsが不変であるルールがjava9で変わったわけではない。
		//以下のコードはコンパイルエラーになる
		//Type mismatch: cannot convert from ArrayList<String> to List<Object>
		//List<Object> object = new ArrayList<String>();
		
		//ただし本書記載のメソッドの警告は出ている
		//Type safety: Potential heap pollution via varargs parameter lists
		
		// 別の実行環境で試してみたところ以下のような警告が出力された
		// HelloWorld.java:6: warning: non-varargs call of varargs method with inexact
		// argument type for last parameter;
		// cantUserGenericsAndVarargs(null);
		// ^
		// cast to List<String> for a varargs call
		// cast to List<String>[] for a non-varargs call and to suppress this warning
		// Note: HelloWorld.java uses unchecked or unsafe operations.
		// Note: Recompile with -Xlint:unchecked for details.
		// 1 warning
		
		/*
		//もしも配列とgenericsを混ぜて使えたら以下のようなことが起こる
		//1.GenericsでStringのListの配列を作る
		List<String>[] stringList = new List<String>[1];
		//2.GenericsでIntegerのListを作る
		List<Integer> intList = List.of(42);
		//3.Objectの配列で宣言した変数にList<String>の配列を代入
		Object[] objects = stringLists;
		//4.
		objects[0] = intLists;
		String s = stringLists[0].get(0);
		 */
		
	}

	@org.junit.jupiter.api.Test
	void sampleOfJavapTest() {
		Code32.sampleOfArray();
		Code32.sampleOfGenerics();
		
	}
	

}
