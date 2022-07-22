package chap10.exception_example;

public class ClassCastException {

	public static void main(String[] args) {
		Animal animal = new Dog();
		if(animal instanceof Cat) {
		Cat cat = (Cat)animal;
		}
//		instanceof를 사용해서 
	}

}


class Animal {	
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}