class NutritionFacts:
    def __init__(self,
                 servingSize,
                 servings,
                 calories=0,
                 fat=0,
                 sodium=0,
                 carbohydrate=0):
        self.servingSize = servingSize;
        self.servings = servings;
        self.calories = calories;
        self.fat = fat;
        self.sodium = sodium;
        self.carbohydrate = carbohydrate;
    # toString() in Java...
    def __str__(self):
        return  " servingSize; = " + str(self.servingSize) \
      + ",\n"+ " servings; = " + str(self.servings) \
      + ",\n"+ " calories; = " + str(self.calories)  \
      + ",\n"+ " fat; = " + str(self.fat) \
      + ",\n"+ " sodium; = " + str(self.sodium) \
      + ",\n"+ " carbohydrate; = " + str(self.carbohydrate) + ",\n"
ins = NutritionFacts(servingSize=240,servings=8,calories=100,sodium=35,carbohydrate=27)
print(ins)