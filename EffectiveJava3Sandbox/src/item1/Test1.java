package item1;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

import org.junit.jupiter.api.Test;

import item1.Code1.SampleEnum;
import item1.Code1.tooBigEnum;

class Test1 {

	@Test
	void test() {
		// sample of static factory method
		Boolean tempVal = Boolean.valueOf(true);
		System.out.println(tempVal);

		Random rnd = new Random();

		BigInteger sample1 = new BigInteger(5, 0, rnd); // クラス名で呼ばれるので生成されるインスタンスの意味がわかりにくい
		BigInteger sample2 = BigInteger.probablePrime(5, rnd);// スタティックファクトリは名前を持てるため、生成されるインスタンの意味を表せる

		System.out.println(sample1);
		System.out.println(sample2);

		Animal animal = Animal.newDog("potchi");
		animal.bark();

		// EnumSetの動作確認
		Set<SampleEnum> flg = EnumSet.noneOf(Code1.SampleEnum.class);

		Set<tooBigEnum> flg2 = EnumSet.noneOf(Code1.tooBigEnum.class);
		Set<tooBigEnum> flg3 = EnumSet.noneOf(Code1.tooBigEnum.class);
		Set<tooBigEnum> flg4 = EnumSet.noneOf(Code1.tooBigEnum.class);
		Set<tooBigEnum> flg5 = EnumSet.noneOf(Code1.tooBigEnum.class);

		flg3.add(Code1.tooBigEnum.No1);// elements = 1
		flg4.add(Code1.tooBigEnum.No2);// elements = 2
		flg5.add((Code1.tooBigEnum.No3));// elements[0] = 4
		flg5.add(Code1.tooBigEnum.No65);// elements[1]= 1

		Code1.tooBigEnum test1 = Code1.tooBigEnum.No10;

		// example of "from"
		Instant instant = Instant.now();
		Date d = Date.from(instant);

		// example of "of"
		Set<Rank> faceCards = EnumSet.of(Rank.JACK, Rank.QUEEN, Rank.KING);
		// 本書のこの例はどうやって動かすの？
		// Set<Rank> faceCards = EnumSet.of(JACK,QUEEN,KING);

		// example of "valeOf"
		BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);

		// example of "getInstance"
		Calendar cal = Calendar.getInstance();

		// example of "create newInstance"
		Object newArray = Array.newInstance(String.class, 4);

		// example of getType
		// FileStore fs = Files.getFileStore();

		// example of newType
		// BufferedReader br = Files.newBufferedReader(path);

		// example of type
		Vector<String> v = new Vector();
		v.add("aa");
		v.add("bb");
		List<String> testList = Collections.list(v.elements());
		System.out.println();
	}

	static enum Rank {
		JACK, QUEEN, KING
	}

}
