package strings;

public class Demo {
	public static void main(String[] args) {
		String s1 = new String("good"); 
		String s2 = new String("good");
		String s = "Developer";
		String s6 = "DEVELOPER";
		String s4 = "good";
		String s5 = "good";
		String z=" ";
//		System.out.println(s.equalsIgnoreCase(s6));
		System.out.println(z.isEmpty());
		System.out.println(z.isBlank()); 
//		System.out.println(s1 == s2); 
//		System.out.println(s3 == s4);
//		System.out.println(s4 == s5);
//	System.out.println(s1.equals(s2));
//	System.out.println(s3.concat("mornning"));
//	System.out.println(s3);
//	s3.toUpperCase();'
//	System.out.println(s3);
//		System.out.println(s3.trim());
//		System.out.println(s3.isEmpty()); 
//		System.out.println(s3.concat("    welcome"));
//		System.out.println(s3.charAt(5));
//		System.out.println(s1.endsWith(";"));
		System.out.println("===uppercase==");
		System.out.println(s.toUpperCase());
		System.out.println("===lowercase====");
		System.out.println(s.toLowerCase());
		System.out.println("===concat====");
		System.out.println(s.concat(" mr-sai-athlete"));
		System.out.println("====lenght===");
		System.out.println(s.length()); 
		System.out.println("charAt index value====");
		System.out.println(s.charAt(5));
		System.out.println("===inderOf charCh ");
		System.out.println(s.indexOf('e'));
		System.out.println("====indexOf string===");
		System.out.println(s.indexOf("per"));
		System.out.println("====charch== int index ");
		System.out.println(s.indexOf('e', 6));
		System.out.println("====string str int index===");
		System.out.println(s.indexOf("lop", 2));
		System.out.println("lastIndexOf charch");
		System.out.println(s.lastIndexOf('e'));
		System.out.println("lastIndexOf string str");		
		System.out.println(s.lastIndexOf("eve"));
		System.out.println("charCh and int inder");
		System.out.println(s.lastIndexOf('e', 3));
		System.out.println("substring int index");
		System.out.println(s.substring(4));
		System.out.println(s.substring(0));
		System.out.println("int beginindex and endindex");
		System.out.println(s.substring(4, 7));
		System.out.println("endwith string str"); 
		System.out.println(s.endsWith("lop"));
		System.out.println(s.endsWith("per"));
		System.out.println("===equalsIgnoreCase=====");
		System.out.println(s.equalsIgnoreCase(s6));
		System.out.println(s.equalsIgnoreCase(s6));	
		System.out.println(s4.equalsIgnoreCase(s6)); 
		System.out.println("=====contentEquals====");
		System.out.println(s.contentEquals("hello"));
		System.out.println(s.contentEquals("Developer"));
		System.out.println("=====isEmpty=====");
		System.out.println(z.isEmpty());
		System.out.println(z.isBlank());
		System.out.println("=======trim==========");
		System.out.println(s.trim());
		System.out.println("=========string buffer=========");
		StringBuffer b = new StringBuffer("Good") ;  
		
		System.out.println("====append======");
		System.out.println(b.append("morning  "));
		System.out.println("insert data");
		System.out.println(b.insert(2, "sai"));
		System.out.println("delete=====================");
		System.out.println(b.delete(2, 5));
		System.out.println("=====capacity====");
		System.out.println(b.capacity());
		System.out.println("reverse order=============");
		System.out.println(b.reverse());
		
		
		
		
		
		
	}

}
