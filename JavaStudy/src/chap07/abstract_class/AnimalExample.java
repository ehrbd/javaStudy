package chap07.abstract_class;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(dog.kind);
		System.out.println(cat.kind);
		
		dog.breath();
		cat.breath();
		
		dog.sound();
		cat.sound();
		
		// 다형성 : 상속관계
		// 자동 타입 변환
		Animal animal = new Dog();
		System.out.println(animal.kind);
		animal.sound();
		animal.breath();
		
		animal = new Cat();
		animal.sound();
		animal.breath();

//		animalSound(new Dog());
//		animalSound(new Cat());
//		
//	}
//
//	public static void animalSound(animal animal) {
//		animal.sound();
//		
	}
}
