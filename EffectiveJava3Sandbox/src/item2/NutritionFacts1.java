package item2;

/**
 * テレスコーピングコンストラクタを使ったケース
 */
public class NutritionFacts1 {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbonhydrate;
	
	public NutritionFacts1(int servingSize,int servings) {
		this(servingSize,servings,0);
	}
	public NutritionFacts1(int servingSize,int servings,int calories) {
		this(servingSize,servings,calories,0);
	}
	public NutritionFacts1(int servingSize,int servings,int calories,int fat) {
		this(servingSize,servings,calories,fat,0);
	}
	public NutritionFacts1(int servingSize,int servings,int calories,int fat,int sodium) {
		this(servingSize,servings,calories,fat,sodium,0);
	}
	public NutritionFacts1(int servingSize,int servings,int calories,int fat,int sodium,int carbonhydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbonhydrate = carbonhydrate;
	}

}
