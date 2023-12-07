package MethodOverriding;

import java.io.FileNotFoundException;

public class Dog  extends Animal  {
  public Animal makeSound(Animal a) throws FileNotFoundException {  // Compilation error: Return type is incompatible
        System.out.println("Dog barks")  ;
        return new Dog();
}
    public static void main(String[] args) {
        Animal dog = new Dog();
        try {
			dog.makeSound(dog);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
