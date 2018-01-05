package item1;

public class Animal implements Barkble{
	
	public static Animal newDog(String name) {
		return new Dog(name);
	}
	public Animal() {
		
	}
	@Override
	public void bark() {
	}
;
}
