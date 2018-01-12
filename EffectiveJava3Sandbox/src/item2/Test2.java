package item2;
import static item2.NyPizza.*;

import static item2.NyPizza.Size.*;
import static item2.Pizza.Topping.*;

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
		cocaCola2.setServings(8);
		cocaCola2.setCalories(100);
		cocaCola2.setSodium(35);
		cocaCola2.setCarbohydrate(27);
		
		//builderパターン
		NutritionFacts3 cocaCola3 = new NutritionFacts3.Builder(240, 8)
				.calories(100).sodium(35).carbohydrate(27).build();
		
		//NyPizza pizza = new NyPizza.Builder(Size.SMALL).addToping(Topping.SAUSAGE).addToping(Topping.ONION).build();
		//本書のように以下のようにかけない。
		NyPizza pizza = new NyPizza.Builder(SMALL).addToping(SAUSAGE).addToping(ONION).build();
		
		Calzone calzone = new Calzone.Builder().addToping(HAM).sauceInside().build();
		
		
	}

}
