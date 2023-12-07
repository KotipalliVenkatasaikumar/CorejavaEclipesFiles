package collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;


public class Demo {
	public static void main(String[] args) {
		
//		  List<Integer> numbers = new ArrayList<>();
//		        numbers.add(1);
//		        numbers.add(2);
//		        numbers.add(3);
//		        numbers.add(2);
//		        numbers.add(1);
//
//		    List<Integer> uniqueNumbers = removeDuplicates(numbers);
//
//		        System.out.println("Original List: " + numbers);
//		        System.out.println("List without Duplicates: " + uniqueNumbers);
//		    }
//
//		    public static <T> List<T> removeDuplicates(List<T> list) {
//		        Set<T> set = new HashSet<>(list);
//		        return new ArrayList<>(set);
		
	
		        List<String> fruits = new ArrayList<>();
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Apple");
		        fruits.add("Orange");
		        fruits.add("Banana");

		        List<String> uniqueFruits = removeDuplicates(fruits);

		        System.out.println("Original List: " + fruits);
		        System.out.println("List without Duplicates: " + uniqueFruits);
		    }

		    public static List<String> removeDuplicates(List<String> list) {
		        Set<String> set = new LinkedHashSet<>(list);
		        return new ArrayList<>(set);
		    }
		

		    }
		

	


