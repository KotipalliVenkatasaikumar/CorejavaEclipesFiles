package strings;

public class Sample {

	public static void main(String[] args) {
		String s="hello";
		String s1="java";
		System.out.println(s.concat(s1));
		System.out.println(s.contains(s1));
		String s2=s+"hello";
		System.out.println(s);
		System.out.println(s2);
		System.out.println("*********************************");
		StringBuffer stringBuffer=new StringBuffer("hiiiiiiiiiii");
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.reverse());
		System.out.println(stringBuffer.insert(6, "python"));
		System.out.println(stringBuffer.delete(6, 8));
		StringBuilder stringBuilder=new StringBuilder("hiiiiiiiiiii");
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.append(".net"));
				
	}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

}
