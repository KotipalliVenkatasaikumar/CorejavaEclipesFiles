package MethodOverriding;

import java.io.FileNotFoundException;

public class Animal {
	public Animal makeSound(Animal a)  throws Exception{
		System.out.println("Animal makes a sound");
		return new Animal();
	}
}
