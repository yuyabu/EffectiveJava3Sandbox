package item26;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

class Test26 {

	@Test
	void test() {
		//Raw collection type 
		List stamps = new ArrayList();
		stamps.add(new Stamp("big"));
		stamps.add(new Coin(5));
		
		//Stamp専用のコレクションのつもりでも、genericsを使わない場合は、
		//Coinクラスを挿入できてしまう。
		
		//Stamp stamp1 = stamps.get(0);//Type missmuch(Canot Compile)
		Stamp stamp1 = (Stamp) stamps.get(0);
		//Stamp stamp2 = (Stamp) stamps.get(1);//ClassCastException 実行時例外!!!
		
		List<Stamp> stamps2 = new ArrayList<>();
		stamps2.add(new Stamp("big"));
		//stamps2.add(new Coin(5));//コンパイル時にエラー発見可能！
		
		List rowList = new ArrayList();
		List<String> genericList = new ArrayList<>();
		
		sampleFunc(rowList);//List<String>はListのサブタイプである
		//sampleFunc2(genericList);List<String>はList<Object>のサブタイプではない
		
		//協会ワイルドカードがパラメータ化されたSetインスタンスにはnull以外の要素を挿入できない。
		Set<?> set = new HashSet<>();
		//set.add(new Object());下記のエラーが発生する
		//The method add(capture#1-of ?) in the type Set<capture#1-of ?> is not applicable for the arguments (Object)
		
		//nullは挿入できるらしい。
		set.add(null);
		
		//genericはクラスリテラルに使えない。
		Class c1 =  List.class;
		//Class c2 =  List<String>.class;ilegal
		
		System.out.println();
	}
	void sampleFunc(List list) {
		
	}
	void sampleFunc2(List<Object> list) {
		
	}

}
