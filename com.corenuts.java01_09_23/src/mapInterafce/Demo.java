package mapInterafce;

import java.util.HashMap;
import java.util.Set;

public class Demo {
	static void charNum(String inputString) {
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		char[] strArry = inputString.toCharArray();
		
		for (char c : strArry) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}

		}
		Set<Character> charlnString = charMap.keySet();
		for (Character ch : charlnString) {
			if (charMap.get(ch) > 1) {
				System.out.println(ch + " :" + charMap.get(ch));
			}

		}
	}

	public static void main(String[] args) {
		// charNum("javaJ2Ee");

		// No need to mention the
		// Generic type twice
		HashMap<Integer, String> hm1 = new HashMap<>(10);

		// Initialization of a HashMap using Generics
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>(2);

		// Adding elements to object of HashMap
		// using put method

		// HashMap 1
		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");

		// HashMap 2
		hm2.put(4, "four");
		hm2.put(5, "five");
		hm2.put(6, "six");
		hm2.put(9, "six");

		// Printing elements of HashMap 1
		System.out.println("Mappings of HashMap hm1 are : " + hm1);

		// Printing elements of HashMap 2
		System.out.println("Mapping of HashMap hm2 are : " + hm2);
	}

}
