package item1;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.Random;

import org.junit.jupiter.api.Test;

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
	}

}
