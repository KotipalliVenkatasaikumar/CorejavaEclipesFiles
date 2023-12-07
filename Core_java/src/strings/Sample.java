package strings;

public class Sample {

	public static void main(String[] args) {

		String str = "core nuts";
		String str1 = "     corenuts    ";
		String str3 = "core nuts";
		String str4 = " ";
		// concat
		System.out.println("**********concat********");
		str.concat("Technologies");
		System.out.println(str);
		StringBuffer s1 = new StringBuffer("corenuts technologies");
		// append
		System.out.println("*********append**********");
		s1.append("technologies");
		System.out.println(s1);
		// startsWith
		System.out.println("*********startWith **********");
		System.out.println(str.startsWith("c"));
		System.out.println(str.startsWith("n", 5));
		// indexOf
		System.out.println("********indexOf************");
		System.out.println(str.indexOf('u'));
		System.out.println(str.indexOf("ore"));
		System.out.println(str.indexOf('t', 5));
		// String empty or not
		System.out.println("********string empty or not***********");
		System.out.println(str.isEmpty());
		System.out.println(s1.isEmpty());
		System.out.println("*********string Blank or not************");
		System.out.println(str4.isBlank());
		System.out.println("valueOf it is used to wrapper class ");
		System.out.println(str.valueOf(false));
		System.out.println(str.valueOf(2));
		System.out.println(str.valueOf(2.2));
		System.out.println(str.valueOf(3));
		System.out.println("********split the string***********");
		// split the string
		String[] s2 = str.split(" ");
		// print the length of array
		System.out.println(s2.length);
		// for loop
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		System.out.println("********substring*********");
		// substring
		System.out.println(str.substring(5));
		System.out.println(s1.substring(8));
		// replace particular char string
		System.out.println("************replace the particular char********");
		System.out.println(str.replace(' ', '0'));
		System.out.println("*************replace StringBuffer***************");
		System.out.println(s1.replace(2, 5, "1234"));
		// replaceAll the existing string
		System.out.println("************ReplaceAll***************** ");
		System.out.println(str.replaceAll("core nuts", "technologies"));
		// charAT particular char
		System.out.println("********charAT index value***********");
		System.out.println(str.charAt(5));
		// charAT in the stringBuffer
		System.out.println("**********stringBufffer**************");
		System.out.println(s1.charAt(5));
		// trim
		System.out.println("**********trim remove the extra spaes");
		System.out.println(str1.trim());
		// length of the string
		System.out.println("*********string lenght************ ");
		System.out.println(str.length());
		// length of the stringBuffer
		System.out.println("*********stringBuffer lenght********* ");
		System.out.println(s1.length());
		// replaceFirst of string
		System.out.println("**********replaceFirst string*************  ");
		System.out.println(str.replaceFirst("core", "sai"));
		// equals method
		System.out.println("************string eqaual or not**********");
		System.out.println(str.equals(str1));
		System.out.println("**********equalsIgnoreCase***********");
		System.out.println(str.equalsIgnoreCase(str1));
		String s7 = "         ";
		if (s7.isBlank()) {
			System.out.println("is  blank");
		} else

		{
			System.out.println("is not blank");
		}

		if (s7.isEmpty()) {
			System.out.println("is empty");
		} else {
			System.out.println("is not empty");
		}

	}

//		startwith
//		indexof
//		isempty
//		isbalnk
//		valueof
//		split
//		substring
//		replace
//		replaceall
//		charAt
//		trim, trimRight, trimLeft
//		length
//		size
//		replaceFirst
//		equal
//		equalignore

}
