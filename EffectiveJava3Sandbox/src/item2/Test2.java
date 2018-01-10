package item2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test2 {

	@Test
	void test() {
		
		//テレスコーピングコンストラクタ
		NutritionFacts1 cocaCola1 = new NutritionFacts1(240,8,100,0,35,27);
		
		//JavaBeansパターン
		NutritionFacts2 cocaCola2 = new NutritionFacts2();
		cocaCola2.setServingSize(240);
		cocaCola2.setCalories(100);
		cocaCola2.setSodium(35);
		cocaCola2.setCarbohydrate(27);
		
		//builderパターン
		
		
	}

}
