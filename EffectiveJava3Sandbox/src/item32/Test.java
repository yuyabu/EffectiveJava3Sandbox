package item32;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		
		//引数がnullの場合も、複数の場合も実行できてしまう。
		Code.cantUserGenericsAndVarargs(null);
		List<String> tempList = List.of("test","32");
		List<String> tempList2 = List.of("test2","32");
		Code.cantUserGenericsAndVarargs(tempList,tempList2);
		
		
		//genericsが不変であるルールがjava9で変わったわけではない。
		//以下のコードはコンパイルエラーになる
		//Type mismatch: cannot convert from ArrayList<String> to List<Object>
		//List<Object> object = new ArrayList<String>();
		
		//ただし本書記載のメソッドの警告は出ている
		//Type safety: Potential heap pollution via varargs parameter lists
		
		

		
	}

}
