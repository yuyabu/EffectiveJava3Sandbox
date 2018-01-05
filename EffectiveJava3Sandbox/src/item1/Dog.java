package item1;

public class Dog extends Animal {
	String name;
	public Dog() {}
	public Dog(String name) {
		this.name = name;
	}
	public void bark() {
		System.out.println("Bow! (I am "+ this.name+")");
	}

}
