package item1;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.EnumSet;
import java.util.Random;
import java.util.Set;

import org.junit.jupiter.api.Test;

import item1.Code1.SampleEnum;
import item1.Code1.tooBigEnum;

class Test1 {

	@Test
	void test() {
		//sample of static factory method
		Boolean tempVal = Boolean.valueOf(true);
		System.out.println(tempVal);
		
		Random rnd = new Random();
		
		BigInteger sample1 = new BigInteger(5,0,rnd); //クラス名で呼ばれるので生成されるインスタンスの意味がわかりにくい
		BigInteger sample2 = BigInteger.probablePrime(5, rnd);//スタティックファクトリは名前を持てるため、生成されるインスタンの意味を表せる

		System.out.println(sample1);
		System.out.println(sample2);
		
		Animal animal = Animal.newDog("potchi");
		animal.bark();
		
		//EnumSetの動作確認
		Set<SampleEnum> flg = EnumSet.noneOf(Code1.SampleEnum.class);

		
		Set<tooBigEnum> flg2 = EnumSet.noneOf(Code1.tooBigEnum.class);
		Set<tooBigEnum> flg3 = EnumSet.noneOf(Code1.tooBigEnum.class);
		Set<tooBigEnum> flg4 = EnumSet.noneOf(Code1.tooBigEnum.class);
		Set<tooBigEnum> flg5 = EnumSet.noneOf(Code1.tooBigEnum.class);
		
		flg3.add(Code1.tooBigEnum.No1);//elements = 1
		flg4.add(Code1.tooBigEnum.No2);// elements = 2
		flg5.add((Code1.tooBigEnum.No3));//elements[0] = 4
		flg5.add(Code1.tooBigEnum.No65);// elements[1]= 1
		
 		System.out.println();
	}
	

}
