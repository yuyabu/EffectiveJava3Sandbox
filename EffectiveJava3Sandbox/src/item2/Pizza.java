package item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
	public enum Topping {HAM,MUSHROOM,ONION,PEPPER,SAUSAGE}
	final Set<Topping> toppings;
	abstract static class Builder<T extends Builder<T>>{
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
		public T addToping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}
		abstract Pizza build();
		
		//サブクラスはthisを返せるよう必ずこのメソッドをオーバーライドすること
		protected abstract T self();
	}
	Pizza(Builder<?> builder){
		toppings = builder.toppings.clone();//item 50を参照
	}
	
}
