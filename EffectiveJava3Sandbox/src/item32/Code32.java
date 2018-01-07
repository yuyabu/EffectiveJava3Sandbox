package item32;

import java.util.ArrayList;
import java.util.List;

public class Code32 {
	/**
	 * Java5で追加されたgenericsと可変長引数は同時に使用することができない<br/>
	 * Type safety: Potential heap pollution via varargs parameter 
 lists
	 */
	@SafeVarargs
	static String cantUserGenericsAndVarargs(List<String> ... lists) {
		//List<Object> object = new ArrayList<String>();

		if(lists == null) {
			return null;
		}
		for(List<String> list:lists) {
			for(String str: list) {
				System.out.print(str);
			}
			System.out.println();
		}
		return null;
	}
	/**
	 * javapで解析用の配列コードのサンプル
	 */
	static void sampleOfArray() {
		int[] intArray = {1,2,3,4};
		int amount=0;
		for(int i: intArray) {
			amount += i;
		}
		System.out.println(+amount);//result=10
		
	}
	/**
	 * javapで解析用のgenericsコードのサンプル
	 */
	static void sampleOfGenerics() {
		List<Integer> intList = List.of(1,2,3,4);
		int amount =0;
		for(int i: intList) {
			amount += i;
		}
		System.out.println(amount);//result=10
		
	}
	public String instanceMethodCantUserGenericsAndVarargs(List<String> ... lists) {
		return null;
	}

}
